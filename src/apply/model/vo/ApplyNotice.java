package apply.model.vo;

import java.sql.Date;
import java.util.List;


public class ApplyNotice {
	
	private int applyNo;
	private String applyTitle;
	private String applyContents;
	private Date enrollDate;
	private int applyLike;
	private int applyViews;
	private String userId;
	private int picSize;
	private String picPath;
	private String mngCheck;
	
	// 댓글
		private List<ApplyNoticeReply> replist;
		
		public ApplyNotice(List<ApplyNoticeReply> replist) {
			super();
			this.replist = replist;
		}

		public List<ApplyNoticeReply> getReplist() {
			return replist;
		}

		public void setReplist(List<ApplyNoticeReply> replist) {
			this.replist = replist;
		}
	
	public ApplyNotice() {};
	
	public ApplyNotice(int applyNo, String applyTitle, String applyContents, Date enrollDate, int applyLike,
			int applyViews, String userId, int picSize, String picPath, String mngCheck) {
		super();
		this.applyNo = applyNo;
		this.applyTitle = applyTitle;
		this.applyContents = applyContents;
		this.enrollDate = enrollDate;
		this.applyLike = applyLike;
		this.applyViews = applyViews;
		this.userId = userId;
		this.picSize = picSize;
		this.picPath = picPath;
		this.mngCheck = mngCheck;
	}

	public int getApplyNo() {
		return applyNo;
	}

	public void setApplyNo(int applyNo) {
		this.applyNo = applyNo;
	}

	public String getApplyTitle() {
		return applyTitle;
	}

	public void setApplyTitle(String applyTitle) {
		this.applyTitle = applyTitle;
	}

	public String getApplyContents() {
		return applyContents;
	}

	public void setApplyContents(String applyContents) {
		this.applyContents = applyContents;
	}

	public Date getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}

	public int getApplyLike() {
		return applyLike;
	}

	public void setApplyLike(int applyLike) {
		this.applyLike = applyLike;
	}

	public int getApplyViews() {
		return applyViews;
	}

	public void setApplyViews(int applyViews) {
		this.applyViews = applyViews;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getPicSize() {
		return picSize;
	}

	public void setPicSize(int picSize) {
		this.picSize = picSize;
	}

	public String getPicPath() {
		return picPath;
	}

	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public String getMngCheck() {
		return mngCheck;
	}

	public void setMngCheck(String mngCheck) {
		this.mngCheck = mngCheck;
	}

	@Override
	public String toString() {
		return "ApplyNotice [applyNo=" + applyNo + ", applyTitle=" + applyTitle + ", applyContents=" + applyContents
				+ ", enrollDate=" + enrollDate + ", applyLike=" + applyLike + ", applyViews=" + applyViews + ", userId="
				+ userId + ", picSize=" + picSize + ", picPath=" + picPath + ", mngCheck=" + mngCheck + "]";
	}
	
	
}
