package mypageHistory.model.vo;

import java.sql.Date;

public class BookedHospitalInfo {
	private String userId;
	private int hospitalNo;
	private String hospitalName;
	private String hospitalAddr;
	private Date hospitalTime;
	private String organ;
	private int organNo;
	private String checkDate;
	


	public BookedHospitalInfo() {
		// TODO Auto-generated constructor stub
	}
	
	
	public String getCheckDate() {
		return checkDate;
	}
	public void setCheckDate(String checkDate) {
		this.checkDate = checkDate;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getHospitalNo() {
		return hospitalNo;
	}
	public void setHospitalNo(int hospitalNo) {
		this.hospitalNo = hospitalNo;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getHospitalAddr() {
		return hospitalAddr;
	}
	public void setHospitalAddr(String hospitalAddr) {
		this.hospitalAddr = hospitalAddr;
	}
	public Date getHospitalTime() {
		return hospitalTime;
	}
	public void setHospitalTime(Date hospitalTime) {
		this.hospitalTime = hospitalTime;
	}
	public String getOrgan() {
		return organ;
	}
	public void setOrgan(String organ) {
		this.organ = organ;
	}
	public int getOrganNo() {
		return organNo;
	}
	public void setOrganNo(int organNo) {
		this.organNo = organNo;
	}
	
	

	@Override
	public String toString() {
		return "BookedHospitalInfo [userId=" + userId + ", hospitalNo=" + hospitalNo + ", hospitalName=" + hospitalName
				+ ", hospitalAddr=" + hospitalAddr + ", hospitalTime=" + hospitalTime + ", organ=" + organ
				+ ", organNo=" + organNo + "]";
	}
}
