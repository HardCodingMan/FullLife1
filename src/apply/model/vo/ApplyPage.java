package apply.model.vo;

import java.util.List;

public class ApplyPage {

	private List<ApplyNotice> aList;
	private String pageNavi; 
	
	public ApplyPage() {}

	public List<ApplyNotice> getaList() {
		return aList;
	}

	public void setaList(List<ApplyNotice> aList) {
		this.aList = aList;
	}

	public String getPageNavi() {
		return pageNavi;
	}

	public void setPageNavi(String pageNavi) {
		this.pageNavi = pageNavi;
	}

	@Override
	public String toString() {
		return "ApplyPage [aList=" + aList + ", pageNavi=" + pageNavi + "]";
	}
	
}
