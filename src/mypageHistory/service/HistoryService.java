package mypageHistory.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import common.JDBCTemplate;
import manager.member.model.dao.M_memberDAO;
import manager.member.moder.vo.M_PageData;
import manager.member.moder.vo.M_member;
import mypageHistory.dao.HistoryDAO;
import mypageHistory.model.vo.History;
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
		
		return hisPage;
	}
	
}
