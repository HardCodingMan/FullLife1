package member.model.vo;

import java.sql.Date;

public class Member {
	private String userId;
	private int userNo;
	private String userPwd;
	private String userName;
	private double userZumin;
	private String userAddr;
	private String userPhone;
	private Date regDate;
	private String relation;
	private char enrolled;
	private int totalPoint;
	
	public Member() {}
	
	

	public Member(String userId, int userNo, String userPwd, String userName, double userZumin, String userAddr,
			String userPhone, Date regDate, String relation, char enrolled, int totalPoint) {
		super();
		this.userId = userId;
		this.userNo = userNo;
		this.userPwd = userPwd;
		this.userName = userName;
		this.userZumin = userZumin;
		this.userAddr = userAddr;
		this.userPhone = userPhone;
		this.regDate = regDate;
		this.relation = relation;
		this.enrolled = enrolled;
		this.totalPoint = totalPoint;
	}


	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public double getUserZumin() {
		return userZumin;
	}

	public void setUserZumin(double userZumin) {
		this.userZumin = userZumin;
	}

	public String getUserAddr() {
		return userAddr;
	}

	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public char getEnrolled() {
		return enrolled;
	}

	public void setEnrolled(char enrolled) {
		this.enrolled = enrolled;
	}

	public int getTotalPoint() {
		return totalPoint;
	}

	public void setTotalPoint(int totalPoint) {
		this.totalPoint = totalPoint;
	}

	@Override
	public String toString() {
		return "회원아이디=" + userId + ", 회원번호=" + userNo + ", 비밀번호=" + userPwd + ", 이름=" + userName
				+ ", 주민번호=" + userZumin + ", 주소=" + userAddr + ", 전화번호=" + userPhone + ", 가입날짜="
				+ regDate + ", 환자와의관계=" + relation + ", 탈퇴여부=" + enrolled + ", 포인트=" + totalPoint;
	}
	
	
	

}
