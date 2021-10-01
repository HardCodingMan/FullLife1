package apply.model.vo;

public class ApplyNoticeFile {

	private String filePath;
	private long fileSize;
	
	public ApplyNoticeFile(String filePath, long fileSize) {
		super();
		this.filePath = filePath;
		this.fileSize = fileSize;
	}
	
	public ApplyNoticeFile() {};

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public long getFileSize() {
		return fileSize;
	}

	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}

	@Override
	public String toString() {
		return "ApplyNoticeFile [filePath=" + filePath + ", fileSize=" + fileSize + "]";
	}
	
}
