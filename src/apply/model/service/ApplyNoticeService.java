package apply.model.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.jsp.tagext.PageData;

import apply.model.dao.ApplyNoticeDAO;
import apply.model.vo.Notice;
import apply.model.vo.ApplyNoticeFile;
import apply.model.vo.ApplyNoticeReply;
import apply.model.vo.ApplyPage;
import common.JDBCTemplate;

public class ApplyNoticeService {

	private JDBCTemplate jdbcTemplate;
	
	public ApplyNoticeService() {
		jdbcTemplate = JDBCTemplate.getConnection();
	}
	
	public int noticeWrite(Notice notice) {
		Connection conn = null;
		int result = 0;
		
		try {
			conn = jdbcTemplate.createConnection();
			result = new ApplyNoticeDAO().insertNotice(conn, notice);
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

	public Notice printOneByNo(int noticeNo) {
		Notice applyNotice = null;
		Connection conn = null;
		List<ApplyNoticeReply> aList = null;
		ApplyNoticeDAO applyDAO = new ApplyNoticeDAO();
		try {
			conn = jdbcTemplate.createConnection();
			applyNotice = applyDAO.selectOneByNo(conn, noticeNo);
			aList = applyDAO.selectAllNoticeReply(conn, noticeNo);
			applyNotice.setReplist(aList);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
		return applyNotice;
	}

	public int registerApplyReply(String replyContents, int applyNo, String userId) {
		Connection conn = null;
		int result = 0;
		
		try {
			conn = jdbcTemplate.createConnection();
			result =  new ApplyNoticeDAO().insertNoticeReply(conn, replyContents, applyNo, userId);
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

	public int removeNotice(int applyNoticeNo) {
		int result = 0;
		Connection conn = null;
		
		try {
			conn = jdbcTemplate.createConnection();
			result = new ApplyNoticeDAO().deleteApply(conn, applyNoticeNo);
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

}
