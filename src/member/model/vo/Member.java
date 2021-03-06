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


   public String getUserZumin() {
      return userZumin;
   }


   public void setUserZumin(String userZumin) {
      this.userZumin = userZumin;
   }


   public String getUserPhone() {
      return userPhone;
   }


   public void setUserPhone(String userPhone) {
      this.userPhone = userPhone;
   }


   public String getUserAddr() {
      return userAddr;
   }


   public void setUserAddr(String userAddr) {
      this.userAddr = userAddr;
   }


   public String getUserEmail() {
      return userEmail;
   }


   public void setUserEmail(String userEmail) {
      this.userEmail = userEmail;
   }


   public Date getRegDate() {
      return regDate;
   }


   public void setRegDate(Date regDate) {
      this.regDate = regDate;
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
      return "???????????????=" + userId + ", ????????????=" + userNo + ", ????????????=" + userPwd + ", ??????=" + userName
            + ", ????????????=" + userZumin + ", ????????????=" + userPhone + ", ??????=" + userAddr + ", ?????????="
            + userEmail + ", ????????????=" + regDate + ", ????????????=" + enrolled + ", ?????????=" + totalPoint;
   }
   
   
   

}