package apply.model.service;

import java.sql.Connection;
import java.sql.SQLException;

import apply.model.dao.ApplyNoticeDAO;
import apply.model.vo.ApplyNotice;
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

}
