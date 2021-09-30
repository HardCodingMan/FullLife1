package ask.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import ask.model.vo.Ask;

public class AskDAO {

	public int insertAsk(Connection conn, Ask ask) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "INSERT INTO ASK(ASK_NO,ASK_SUBJECT,ASK_CONTENTS,ANSWER_CONTENTS, VALUES(SEQ_ASK.NEXTVAL,?,?,NULL,DEFAULT,DEFAULT,"
				
		return 0;
	}

	public List<Ask> selectAllAsk(Connection conn, int currentPage) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPageNavi(Connection conn, int currentPage) {
		return null;
	}

	public int insertAsk(Connection conn, Ask ask) {
		return 0;
	}

}
