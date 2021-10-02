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
	private long picSize;
	private String picPath;
	private char mngCheck;
	private int replyCount;
	private String picName;
		// 댓글
		private List<ApplyNoticeReply> replist;
		
		public ApplyNotice(List<ApplyNoticeReply> replist) {
			super();
			this.replist = replist;
		}
		
		public List<ApplyNoticeReply> getReplist(){
			return replist;
		}
		
		public void setReplist(List<ApplyNoticeReply> replist) {
			this.replist = replist;
		}
	
	public ApplyNotice() {};
	
	public ApplyNotice(int applyNo, String applyTitle, String applyContents, Date enrollDate, int applyLike,
			int applyViews, String userId, long picSize, String picPath, char mngCheck) {
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

	public long getPicSize() {
		return picSize;
	}

	public void setPicSize(long picSize) {
		this.picSize = picSize;
	}

	public String getPicPath() {
		return picPath;
	}

	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public char getMngCheck() {
		return mngCheck;
	}

	public void setMngCheck(char mngCheck) {
		this.mngCheck = mngCheck;
	}
	
	public int getReplyCount() {
		return replyCount;
	}

	public void setReplyCount(int replyCount) {
		this.replyCount = replyCount;
	}
	
	public String getPicName() {
		return picName;
	}

	public void setPicName(String picName) {
		this.picName = picName;
	}

	@Override
	public String toString() {
		return "ApplyNotice [applyNo=" + applyNo + ", applyTitle=" + applyTitle + ", applyContents=" + applyContents
				+ ", enrollDate=" + enrollDate + ", applyLike=" + applyLike + ", applyViews=" + applyViews + ", userId="
				+ userId + ", picSize=" + picSize + ", picPath=" + picPath + ", mngCheck=" + mngCheck + ", replyCount="
				+ replyCount + ", replist=" + replist + "]";
	}

	
	
	
}
