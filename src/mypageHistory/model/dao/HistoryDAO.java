package mypageHistory.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import common.JDBCTemplate;
import mypageHistory.model.vo.BookedHospitalInfo;
import mypageHistory.model.vo.History;

public class HistoryDAO {
	

	public List<History> selectAllList(Connection conn, int historyPage) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		List<History>hList = null;
		String query = "SELECT * FROM HISTORY";
		
		try {
			pstmt = conn.prepareStatement(query);
			int countHistoryPage =10;
			int start = historyPage*countHistoryPage -(countHistoryPage-1);
			int end = historyPage*countHistoryPage;
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			rset = pstmt.executeQuery();
			hList = new ArrayList<History>();
			while(rset.next()) {
				History result = new History();
				result.setHistoryNo(rset.getInt("HISTORY_NO"));
				result.setOrganNo(rset.getInt("ORGAN_NO"));
				result.setOrganQuantity(rset.getInt("ORGAN_QUANTITY"));
				result.setHistoryDate(rset.getDate("HISTORY_DATE"));
				result.setPayment(rset.getInt("PAYMENT"));
				result.setPaymentDate(rset.getDate("PAYMENT_DATE"));
				result.setUsedPoint(rset.getInt("USED_POINT"));
				result.setUserId(rset.getString("USER_ID"));
				result.setHospitalNo(rset.getInt("HOSPITAL_NO"));
				hList.add(result);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		return hList;
		
	}

	public BookedHospitalInfo getBookedHospitalInfo(String userId, Connection conn) {
		PreparedStatement pstmt = null;
		BookedHospitalInfo info = null;
		ResultSet rset = null;
		String query = "SELECT * FROM BOOKED_HOSPITAL_INFO JOIN ORGAN USING(ORGAN_NO) JOIN HOSPITAL USING(HOSPITAL_NO) JOIN RESULT USING(USER_ID) WHERE USER_ID = ?";
	
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			rset = pstmt.executeQuery();
			if(rset.next()) {
				info = new BookedHospitalInfo();
				info.setHospitalAddr(rset.getString("HOSPITAL_ADDR"));
				info.setHospitalName(rset.getString("HOSPITAL_NAME"));
				info.setCheckDate(rset.getString("CHECK_DATE"));
				info.setHospitalTime(rset.getDate("HOSPITAL_TIME"));
				info.setOrgan(rset.getString("ORGAN_NAME"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		return info;
	}
	
	
	
	
	
	
	
}
