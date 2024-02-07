package mysql.sec05_message;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


public class MessageDao {
	private String connStr;
	private String user;
	private String password;
	private Connection conn;

	public MessageDao() {
		String path = "C:/Workspace/Java/lesson/src/mysql/mysql.properties";
		try {
			Properties prop = new Properties();
			prop.load(new FileInputStream(path));

			String host = prop.getProperty("host");
			String port = prop.getProperty("port");
			String database = prop.getProperty("database");
			this.connStr = "jdbc:mysql://" + host + ":" + port + "/" + database;
			this.user = prop.getProperty("user");
			this.password = prop.getProperty("password");
			this.conn = DriverManager.getConnection(connStr, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void close() {
		try {
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Message getMessageByMid(int mid) {
	    String sql = "SELECT * FROM message WHERE mid=?";
	    Message msg = null;
	    try {
	        PreparedStatement pstmt = conn.prepareStatement(sql);
	        pstmt.setInt(1, mid);

	        ResultSet rs = pstmt.executeQuery();
	        if (rs.next()) {
	            int messageId = rs.getInt("mid");
	            String content = rs.getString("content");
	            String writer = rs.getString("writer");
	            java.sql.Timestamp modTimeTimestamp = rs.getTimestamp("modTime");
	            LocalDateTime modTime = modTimeTimestamp.toLocalDateTime();
	            

	            msg = new Message(messageId, content, writer, modTime);
	        }
	        rs.close();
	        pstmt.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return msg;
	}
	public List<Message> getMessageListByWriter(String writer) {
        List<Message> messageList = new ArrayList<>();
        String sql = "SELECT * FROM message WHERE writer=?";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, writer);

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int messageId = rs.getInt("mid");
                String content = rs.getString("content");
                java.sql.Timestamp modTimeTimestamp = rs.getTimestamp("modTime");
                LocalDateTime modTime = modTimeTimestamp.toLocalDateTime();
                int isDeleted = rs.getInt("isDeleted");

                Message message = new Message(messageId, content, writer, modTime, isDeleted);
                messageList.add(message);
            }
            rs.close();
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return messageList;
    }

    public void insertMessage(Message msg) {
        String sql = "INSERT INTO message (content, writer) VALUES (?, ?)";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, msg.getContent());
            pstmt.setString(2, msg.getWriter());
            pstmt.setInt(3, msg.getMid());

            pstmt.executeUpdate();
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateMessage(Message msg) {
        String sql = "UPDATE message SET content=?, writer=? WHERE mid=?";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, msg.getContent());
            pstmt.setString(2, msg.getWriter());
            pstmt.setInt(3, msg.getMid());

            pstmt.executeUpdate();
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteMessage(int mid) {
        String sql = "DELETE FROM message WHERE mid=?";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, mid);

            pstmt.executeUpdate();
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Message> getMessageListAll() {
        List<Message> messageList = new ArrayList<>();
        String sql = "SELECT * FROM message";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int messageId = rs.getInt("mid");
                String content = rs.getString("content");
                String writer = rs.getString("writer");
                java.sql.Timestamp modTimeTimestamp = rs.getTimestamp("modTime");
                LocalDateTime modTime = modTimeTimestamp.toLocalDateTime();
                int isDeleted = rs.getInt("isDeleted");

                Message message = new Message(messageId, content, writer, modTime, isDeleted);
                messageList.add(message);
            }
            rs.close();
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return messageList;
    }
}