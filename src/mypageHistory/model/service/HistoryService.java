package mypageHistory.model.service;

import java.sql.Connection;
import java.sql.SQLException;
import common.JDBCTemplate;
import mypageHistory.model.dao.HistoryDAO;
import mypageHistory.model.vo.BookedHospitalInfo;
import mypageHistory.model.vo.HistoryPage;

public class HistoryService {
	private JDBCTemplate jdbcTemplate;
	
	public HistoryService() {
		jdbcTemplate = JDBCTemplate.getConnection();
	}
	


	public HistoryPage printAllList(int historyPage) {
		HistoryPage hisPage = new HistoryPage();
		Connection conn = null;
		HistoryDAO hDao = new HistoryDAO();
		
		try {
			conn=jdbcTemplate.createConnection();
			hisPage.sethList(hDao.selectAllList(conn, historyPage));
			hisPage.setPageNavi(hDao.getPageNavi(conn, historyPage));
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
<<<<<<< HEAD:src/mypageHistory/service/HistoryService.java
		
		return hisPage;
	} 
=======
		return his;
	}

	public BookedHospitalInfo getBookedHospitalInfo(String userId) {
		BookedHospitalInfo info = null;
		Connection conn = null;
		
		try {
			conn = jdbcTemplate.createConnection();
			info = new HistoryDAO().getBookedHospitalInfo(userId, conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(conn);
		}
		
		return info;
	}

>>>>>>> 7aa522b4c02514daf6fcc743b8d1c6137416f71f:src/mypageHistory/model/service/HistoryService.java
	
}
