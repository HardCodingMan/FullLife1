package mypageCheckResult.model.vo;

import java.sql.Date;

public class CheckResult {
	private int resultNo;
	private String fileName;
	private String filePath;
	private int fileSize;
	private Date checkDate;
	private String userId;
	private int hospitalNo;
	
	public CheckResult() {
		
	}

	public CheckResult(int resultNo, String fileName, String filePath, int fileSize, Date checkDate, String userId,
			int hospitalNo) {
		super();
		this.resultNo = resultNo;
		this.fileName = fileName;
		this.filePath = filePath;
		this.fileSize = fileSize;
		this.checkDate = checkDate;
		this.userId = userId;
		this.hospitalNo = hospitalNo;
	}

	public int getResultNo() {
		return resultNo;
	}

	public void setResultNo(int resultNo) {
		this.resultNo = resultNo;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public int getFileSize() {
		return fileSize;
	}

	public void setFileSize(int fileSize) {
		this.fileSize = fileSize;
	}

	public Date getCheckDate() {
		return checkDate;
	}

	public void setCheckDate(Date checkDate) {
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

	@Override
	public String toString() {
		return "검사번호" + resultNo + ", 파일이름=" + fileName + ", 파일경로=" + filePath + ", 파일용량="
				+ fileSize + ", 검사날짜=" + checkDate + ", 회원아이디=" + userId + ", 병원고유번호=" + hospitalNo;
	}
	
	
	


}