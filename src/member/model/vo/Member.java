package member.model.vo;

import java.sql.Date;

public class Member {
   private String userId;
   private int userNo;
   private String userPwd;
   private String userName;
   private String userZumin;
   private String userPhone;
   private String userAddr;
   private String userEmail;
   private Date regDate;
   private char enrolled;
   private int totalPoint;

   
   public Member() {}

   public Member(String userId, int userNo, String userPwd, String userName, String userZumin, String userPhone,
         String userAddr, String userEmail, Date regDate, char enrolled, int totalPoint) {
      super();
      this.userId = userId;
      this.userNo = userNo;
      this.userPwd = userPwd;
      this.userName = userName;
      this.userZumin = userZumin;
      this.userPhone = userPhone;
      this.userAddr = userAddr;
      this.userEmail = userEmail;
      this.regDate = regDate;
      this.enrolled = enrolled;
      this.totalPoint = totalPoint;
   }
   
<<<<<<< HEAD
   public String getUserId() {
      return userId;
   }
=======
   public Member(String userId, String userPwd, String userName, String userZumin, String userPhone, String userAddr,
		String userEmail) {
	super();
	this.userId = userId;
	this.userPwd = userPwd;
	this.userName = userName;
	this.userZumin = userZumin;
	this.userPhone = userPhone;
	this.userAddr = userAddr;
	this.userEmail = userEmail;
}
>>>>>>> origin/mooooo

public String getUserId() {
      return userId;
   }

<<<<<<< HEAD
   public void setUserId(String userId) {
      this.userId = userId;
   }
=======
>>>>>>> origin/mooooo

   public void setUserId(String userId) {
      this.userId = userId;
   }

<<<<<<< HEAD
   public int getUserNo() {
      return userNo;
   }
=======
>>>>>>> origin/mooooo

   public int getUserNo() {
      return userNo;
   }

<<<<<<< HEAD
   public void setUserNo(int userNo) {
      this.userNo = userNo;
   }
=======
>>>>>>> origin/mooooo

   public void setUserNo(int userNo) {
      this.userNo = userNo;
   }

<<<<<<< HEAD
   public String getUserPwd() {
      return userPwd;
   }
=======
>>>>>>> origin/mooooo

   public String getUserPwd() {
      return userPwd;
   }

<<<<<<< HEAD
   public void setUserPwd(String userPwd) {
      this.userPwd = userPwd;
   }
=======
>>>>>>> origin/mooooo

   public void setUserPwd(String userPwd) {
      this.userPwd = userPwd;
   }

<<<<<<< HEAD
   public String getUserName() {
      return userName;
   }
=======
>>>>>>> origin/mooooo

   public String getUserName() {
      return userName;
   }

<<<<<<< HEAD
   public void setUserName(String userName) {
      this.userName = userName;
   }
=======
>>>>>>> origin/mooooo

   public void setUserName(String userName) {
      this.userName = userName;
   }

<<<<<<< HEAD
   public String getUserZumin() {
      return userZumin;
   }
=======
>>>>>>> origin/mooooo

   public String getUserZumin() {
      return userZumin;
   }

<<<<<<< HEAD
   public void setUserZumin(String userZumin) {
      this.userZumin = userZumin;
   }
=======
>>>>>>> origin/mooooo

   public void setUserZumin(String userZumin) {
      this.userZumin = userZumin;
   }

<<<<<<< HEAD
   public String getUserPhone() {
      return userPhone;
   }
=======
>>>>>>> origin/mooooo

   public String getUserPhone() {
      return userPhone;
   }

<<<<<<< HEAD
   public void setUserPhone(String userPhone) {
      this.userPhone = userPhone;
   }
=======
>>>>>>> origin/mooooo

   public void setUserPhone(String userPhone) {
      this.userPhone = userPhone;
   }

<<<<<<< HEAD
   public String getUserAddr() {
      return userAddr;
   }
=======
>>>>>>> origin/mooooo

   public String getUserAddr() {
      return userAddr;
   }

<<<<<<< HEAD
   public void setUserAddr(String userAddr) {
      this.userAddr = userAddr;
   }
=======
>>>>>>> origin/mooooo

   public void setUserAddr(String userAddr) {
      this.userAddr = userAddr;
   }

<<<<<<< HEAD
   public String getUserEmail() {
      return userEmail;
   }
=======
>>>>>>> origin/mooooo

   public String getUserEmail() {
      return userEmail;
   }

<<<<<<< HEAD
   public void setUserEmail(String userEmail) {
      this.userEmail = userEmail;
   }
=======
>>>>>>> origin/mooooo

   public void setUserEmail(String userEmail) {
      this.userEmail = userEmail;
   }

<<<<<<< HEAD
   public Date getRegDate() {
      return regDate;
   }
=======
>>>>>>> origin/mooooo

   public Date getRegDate() {
      return regDate;
   }

<<<<<<< HEAD
   public void setRegDate(Date regDate) {
      this.regDate = regDate;
   }
=======
>>>>>>> origin/mooooo

   public void setRegDate(Date regDate) {
      this.regDate = regDate;
   }

<<<<<<< HEAD
   public char getEnrolled() {
      return enrolled;
   }
=======
>>>>>>> origin/mooooo

   public char getEnrolled() {
      return enrolled;
   }

<<<<<<< HEAD
   public void setEnrolled(char enrolled) {
      this.enrolled = enrolled;
   }
=======
>>>>>>> origin/mooooo

   public void setEnrolled(char enrolled) {
      this.enrolled = enrolled;
   }

<<<<<<< HEAD
   public int getTotalPoint() {
      return totalPoint;
   }
=======
>>>>>>> origin/mooooo

   public int getTotalPoint() {
      return totalPoint;
   }

<<<<<<< HEAD
   public void setTotalPoint(int totalPoint) {
      this.totalPoint = totalPoint;
   }
=======
>>>>>>> origin/mooooo

   public void setTotalPoint(int totalPoint) {
      this.totalPoint = totalPoint;
   }

<<<<<<< HEAD
=======

>>>>>>> origin/mooooo
   @Override
   public String toString() {
      return "회원아이디=" + userId + ", 회원번호=" + userNo + ", 비밀번호=" + userPwd + ", 이름=" + userName
            + ", 주민번호=" + userZumin + ", 전화번호=" + userPhone + ", 주소=" + userAddr + ", 이메일="
            + userEmail + ", 가입날짜=" + regDate + ", 탈퇴여부=" + enrolled + ", 포인트=" + totalPoint;
   }
   
   
   

}