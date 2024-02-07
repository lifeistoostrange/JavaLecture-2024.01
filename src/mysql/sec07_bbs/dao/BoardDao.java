package mysql.sec07_bbs.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import mysql.sec07_bbs.entity.Board;

public class BoardDao {
	private String connStr;
	private String user;
	private String password;
	private Connection conn;

	public BoardDao() {
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

	public Board getBoard(int bid) {
		String sql = "SELECT * FROM board WHERE bid = ?";
	    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
	        pstmt.setInt(1, bid);
	        ResultSet rs = pstmt.executeQuery();
	        if (rs.next()) {
	            Board board = new Board();
	            board.setBid(rs.getInt("bid"));
	            board.setTitle(rs.getString("title"));
	            board.setContent(rs.getString("content"));
	            board.setUid(rs.getString("uid"));
	            board.setModTime(rs.getTimestamp("modTime").toLocalDateTime());
	            board.setIsDeleted(rs.getInt("isDeleted"));
	            board.setViewCount(rs.getInt("viewCount"));
	            board.setReplyCount(rs.getInt("replyCount"));
	            return board;
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return null;
	}

	// field 값은 title, content, uid 등 attribute name
	// query 값은 검색어
	public List<Board> getBoardList(String field, String query, int num, int offset) {
		List<Board> boardList = new ArrayList<>();
	    String sql = "SELECT * FROM board WHERE " + field + " LIKE ? LIMIT ? OFFSET ?";
	    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
	        pstmt.setString(1, "%" + query + "%");
	        pstmt.setInt(2, num);
	        pstmt.setInt(3, offset);
	        ResultSet rs = pstmt.executeQuery();
	        while (rs.next()) {
	            Board board = new Board();
	            board.setBid(rs.getInt("bid"));
	            board.setTitle(rs.getString("title"));
	            board.setContent(rs.getString("content"));
	            board.setUid(rs.getString("uid"));
	            board.setModTime(rs.getTimestamp("modTime").toLocalDateTime());
	            board.setIsDeleted(rs.getInt("isDeleted"));
	            board.setViewCount(rs.getInt("viewCount"));
	            board.setReplyCount(rs.getInt("replyCount"));
	            boardList.add(board);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return boardList;
	}

	public void insertBoard(Board board) {
		String sql = "INSERT INTO board (title, content, uid, modTime, isDeleted, viewCount, replyCount) VALUES (?, ?, ?, ?, ?, ?, ?)";
	    try (PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
	        pstmt.setString(1, board.getTitle());
	        pstmt.setString(2, board.getContent());
	        pstmt.setString(3, board.getUid());
	        pstmt.setTimestamp(4, Timestamp.valueOf(LocalDateTime.now()));
	        pstmt.setInt(5, board.getIsDeleted());
	        pstmt.setInt(6, board.getViewCount());
	        pstmt.setInt(7, board.getReplyCount());
	        pstmt.executeUpdate();
	        ResultSet generatedKeys = pstmt.getGeneratedKeys();
	        if (generatedKeys.next()) {
	            board.setBid(generatedKeys.getInt(1));
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	public void updateBoard(Board board) {
		String sql = "UPDATE board SET title = ?, content = ?, modTime = ?, isDeleted = ?, viewCount = ?, replyCount = ? WHERE bid = ?";
	    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
	        pstmt.setString(1, board.getTitle());
	        pstmt.setString(2, board.getContent());
	        pstmt.setTimestamp(3, Timestamp.valueOf(board.getModTime()));
	        pstmt.setInt(4, board.getIsDeleted());
	        pstmt.setInt(5, board.getViewCount());
	        pstmt.setInt(6, board.getReplyCount());
	        pstmt.setInt(7, board.getBid());
	        pstmt.executeUpdate();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	public void deleteBoard(int bid) {
		String sql = "DELETE FROM board WHERE bid = ?";
	    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
	        pstmt.setInt(1, bid);
	        pstmt.executeUpdate();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	// field 값은 view 또는 reply
	public void increaseCount(String field, int bid) {
		String sql = "UPDATE board SET " + field + " = " + field + " + 1 WHERE bid = ?";
	    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
	        pstmt.setInt(1, bid);
	        pstmt.executeUpdate();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

}
