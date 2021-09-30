package apply.model.service;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.jsp.tagext.PageData;

import apply.model.dao.ApplyNoticeDAO;
import apply.model.vo.ApplyNotice;
import apply.model.vo.ApplyPage;
import common.JDBCTemplate;

public class ApplyNoticeService {

	private JDBCTemplate jdbcTemplate;
	
	public ApplyNoticeService() {
		jdbcTemplate = JDBCTemplate.getConnection();
	}
	
	public int noticeWrite(ApplyNotice applyNotice) {
		Connection conn = null;
		int result = 0;
		
		try {
			conn = jdbcTemplate.createConnection();
			result = new ApplyNoticeDAO().insertNotice(conn, applyNotice);
			if(result > 0) {
				JDBCTemplate.commit(conn);
			}else {
				JDBCTemplate.rollback(conn);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
		return result;
	}

	public ApplyPage printAllApply(int currentPage) {
		ApplyPage ap = new ApplyPage();
		Connection conn = null;
		ApplyNoticeDAO applyDAO = new ApplyNoticeDAO();
		
		try {
			conn = jdbcTemplate.createConnection();
			ap.setaList(applyDAO.pageAllNotice(conn, currentPage));
			ap.setPageNavi(applyDAO.getPageNavi(conn, currentPage));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
		return ap;
	}

	public ApplyNotice printOneByNo(int applyNoticeNo) {
		ApplyNotice applyNotice = null;
		Connection conn = null;
		return null;
	}

	


}
