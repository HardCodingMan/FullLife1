package mypageHistory.service;

import java.sql.Connection;
import java.sql.SQLException;
import common.JDBCTemplate;
import mypageHistory.dao.HistoryDAO;
import mypageHistory.model.vo.HistoryPage;

public class HistoryService {
	private JDBCTemplate jdbcTemplate;
	
	public HistoryService() {
		jdbcTemplate = JDBCTemplate.getConnection();
	}
	
	public HistoryPage printAllList(int historyNo) {
		HistoryPage his = new HistoryPage();
		Connection conn = null;
		HistoryDAO hDAO = new HistoryDAO();
		
		try {
			conn= jdbcTemplate.createConnection();
			his.sethList(hDAO.selectAllList(conn, historyNo));
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
		return his;
	}

	
}
