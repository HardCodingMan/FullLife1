package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTemplate {

<<<<<<< HEAD
	//싱글톤 패턴 적
	private static JDBCTemplate instance;
	
	public JDBCTemplate() {
		//드라이버 등록
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//싱글톤 패턴 - 메소드
	public static JDBCTemplate getConnection() {
		if(instance == null) {
			instance = new JDBCTemplate();
		}
		return instance;
	}
	//연결 생성
	public Connection createConnection() throws SQLException {
<<<<<<< HEAD
		
		String url = "jdbc:oracle:thin:@sonof.iptime.org:8521:XE";
		String user = "FULLLIFE";
		String password ="FULLLIFE";
=======
		String url = "jdbc:oracle:thin:@sonof.iptime.org:8521:XE";
		String user = "FULLLIFE";
		String password ="FULLLIFE";

>>>>>>> 648d74181ee17f888af35bf2c751770dfec6a2c3
		Connection conn = DriverManager.getConnection(url,user,password);
		conn.setAutoCommit(false);
		return conn;
	}
	//연결 닫기
	public static void close(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//커밋
	public static void commit(Connection conn) {
		try {
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//롤백
	public static void rollback(Connection conn) {
		try {
			conn.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//자원해제
	public static void close(ResultSet rset) {
		try {
			if(rset != null && !rset.isClosed()) {
				rset.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void close(Statement stmt) {
		try {
			if(stmt != null && !stmt.isClosed()) {
				stmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
=======
   //싱글톤 패턴 적
   private static JDBCTemplate instance;
   
   public JDBCTemplate() {
      //드라이버 등록
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
      } catch (ClassNotFoundException e) {
         e.printStackTrace();
      }
   }
   
   //싱글톤 패턴 - 메소드
   public static JDBCTemplate getConnection() {
      if(instance == null) {
         instance = new JDBCTemplate();
      }
      return instance;
   }
   //연결 생성
   public Connection createConnection() throws SQLException {
      String url = "jdbc:oracle:thin:@sonof.iptime.org:8521:XE";
      String user = "FULLLIFE";
      String password ="FULLLIFE";

      Connection conn = DriverManager.getConnection(url,user,password);
      conn.setAutoCommit(false);
      return conn;
   }
   //연결 닫기
   public static void close(Connection conn) {
      try {
         if(conn != null && !conn.isClosed()) {
            conn.close();
         }
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
   
   //커밋
   public static void commit(Connection conn) {
      try {
         conn.commit();
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
   //롤백
   public static void rollback(Connection conn) {
      try {
         conn.rollback();
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
   
   //자원해제
   public static void close(ResultSet rset) {
      try {
         if(rset != null && !rset.isClosed()) {
            rset.close();
         }
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
   public static void close(Statement stmt) {
      try {
         if(stmt != null && !stmt.isClosed()) {
            stmt.close();
         }
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
}
>>>>>>> f152e77a3ef574e6a4eb307c74533b8f2e1bc621
