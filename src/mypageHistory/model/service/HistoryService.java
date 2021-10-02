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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD:src/mypageHistory/model/service/HistoryService.java
		return his;
=======
		return hisPage;
>>>>>>> cbeb7513c6a7aa4151cefce6d693fd4009b3b87b
	}
=======
		return hisPage;
	} 
>>>>>>> origin/Hyunseok

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
<<<<<<< HEAD
	}

<<<<<<< HEAD
=======
		
		return hisPage;
	} 
>>>>>>> ccf2c619516a4e187ffd1b1f1312edd819d99d05:src/mypageHistory/service/HistoryService.java
=======
	} 
>>>>>>> cbeb7513c6a7aa4151cefce6d693fd4009b3b87b
	
}
=======
>>>>>>> origin/Hyunseok
