package apply.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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

	public List<ApplyNotice> pageAllNotice(Connection conn, int currentPage) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String query = "SELECT * FROM(SELECT ROW_NUMBER() OVER(ORDER BY APPLY_NO DESC) AS NUM, APPLY_NO, APPLY_TITLE, APPLY_CONTENTS,ENROLL_DATE ,USER_ID,APPLY_VIEWS, APPLY_LIKE FROM APPLY_NOTICE) WHERE NUM BETWEEN ? AND ?";
		List<ApplyNotice> aList = null;
		
		try {
			pstmt = conn.prepareStatement(query);
			// 한 페이지에 나올 게시물의 수
			int viewCountPage = 8;
			int start = (currentPage * viewCountPage) - (viewCountPage - 1);
			int end = currentPage * viewCountPage;
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			rset = pstmt.executeQuery();
			aList = new ArrayList<ApplyNotice>();
			while(rset.next()) {
				ApplyNotice applyNotice = new ApplyNotice();
				applyNotice.setApplyNo(rset.getInt("APPLY_NO"));
				applyNotice.setApplyTitle(rset.getString("APPLY_TITLE"));
				applyNotice.setApplyContents(rset.getString("APPLY_CONTENTS"));
				applyNotice.setEnrollDate(rset.getDate("ENROLL_DATE"));
				applyNotice.setUserId(rset.getString("USER_ID"));
				applyNotice.setApplyViews(rset.getInt("APPLY_VIEWS"));
				applyNotice.setApplyLike(rset.getInt("APPLY_LIKE"));
				aList.add(applyNotice);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(pstmt);
			JDBCTemplate.close(rset);
		}
		return aList;
	}

	public String getPageNavi(Connection conn, int currentPage) {
		int pageCountView = 5;
		int viewTotalCount = totalCount(conn);
		int viewCountPage = 8;
		int totalCountPage = 0;
		int totalCountPageMod = viewTotalCount % viewCountPage;
		if(totalCountPageMod > 0) {
			totalCountPage = viewTotalCount / viewCountPage +1;
		}else {
			totalCountPage = viewTotalCount / viewCountPage;
		}
		int startNavi =((currentPage - 1) / pageCountView) * pageCountView + 1;
		int endNavi = startNavi + pageCountView - 1;
		if(endNavi > totalCountPage) {
			endNavi = totalCountPage;
		}
		boolean needPrev = true;
		boolean needNext = true;
		if(startNavi == 1) {
			needPrev = false;
		}
		if(endNavi == totalCountPage) {
			needNext = false;
		}
		StringBuilder sb = new StringBuilder();
		if(needPrev) {
			sb.append("<a href='/Notice/Apply/ApplyNotice?currentPage=" + (startNavi-1) + "'> [이전] </a>");
		}
		for(int i = startNavi; i <= endNavi; i++) {
			if(i == currentPage) {
				sb.append(i);
			}else {
				sb.append("<a href='/Notice/Apply/ApplyNotice?currentPage=" + i + "'>" + i + " </a>");
			}
		}
		if(needNext) {
			sb.append("<a href='/Notice/Apply/ApplyNotice?currentPage=" + (endNavi+1) + "'> [다음] </a>");
		}
		return sb.toString();
	}
	
	public int totalCount(Connection conn) {
		int totalValue = 0;
		Statement stmt = null;
		ResultSet rset = null;
		String query = "SELECT COUNT(*) AS TOTALCOUNT FROM APPLY_NOTICE";
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			if(rset.next()) {
				totalValue = rset.getInt("TOTALCOUNT");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(stmt);
		}
		
		return totalValue;
	}

}
