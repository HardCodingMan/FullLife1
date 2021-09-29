package apply.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import apply.model.vo.ApplyNotice;
import common.JDBCTemplate;

public class ApplyNoticeDAO {

	public int insertNotice(Connection conn, ApplyNotice applyNotice) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "INSERT INTO APPLY_NOTICE VALUES(SEQ_APPLY_NO.NEXTVAL,?,?,DEFAULT,DEFAULT,DEFAULT,?,0,'경로',DEFAULT)";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, applyNotice.getApplyTitle());
			pstmt.setString(2, applyNotice.getApplyContents());
			pstmt.setString(3, applyNotice.getUserId());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(pstmt);
		}
		
		return result;
	}

}
