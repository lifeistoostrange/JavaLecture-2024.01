package mysql.sec07_bbs.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import mysql.sec07_bbs.entity.Reply;

public class ReplyDao {
	private String connStr;
	private String user;
	private String password;
	private Connection conn;

	public ReplyDao() {
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

	public Reply getReply(int rid) {
		String sql = "SELECT * FROM reply WHERE rid = ?";
	    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
	        pstmt.setInt(1, rid);
	        ResultSet rs = pstmt.executeQuery();
	        if (rs.next()) {
	            Reply reply = new Reply();
	            reply.setRid(rs.getInt("rid"));
	            reply.setComment(rs.getString("comment"));
	            reply.setRegTime(rs.getTimestamp("regTime").toLocalDateTime());
	            reply.setUid(rs.getString("uid"));
	            reply.setBid(rs.getInt("bid"));
	            return reply;
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return null;
	}

	public List<Reply> getReplyList(int bid) {
		List<Reply> replyList = new ArrayList<>();
	    String sql = "SELECT * FROM reply WHERE bid = ?";
	    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
	        pstmt.setInt(1, bid);
	        ResultSet rs = pstmt.executeQuery();
	        while (rs.next()) {
	            Reply reply = new Reply();
	            reply.setRid(rs.getInt("rid"));
	            reply.setComment(rs.getString("comment"));
	            reply.setRegTime(rs.getTimestamp("regTime").toLocalDateTime());
	            reply.setUid(rs.getString("uid"));
	            reply.setBid(rs.getInt("bid"));
	            replyList.add(reply);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return replyList;
	}

	public void insertReply(Reply reply) {
		String sql = "INSERT INTO reply (comment, regTime, uid, bid) VALUES (?, ?, ?, ?)";
		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
	        pstmt.setString(1, reply.getComment());
	        pstmt.setTimestamp(2, Timestamp.valueOf(LocalDateTime.now()));
	        pstmt.setString(3, reply.getUid());
	        pstmt.setInt(4, reply.getBid());
	        pstmt.executeUpdate();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

}
