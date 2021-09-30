package manager.result.model.vo;

import java.util.List;

public class M_FilePage {

	private List<M_result> fPdList;
	private String pageNavi;
	
	public M_FilePage() {}

	public List<M_result> getfPdList() {
		return fPdList;
	}

	public void setfPdList(List<M_result> fPdList) {
		this.fPdList = fPdList;
	}

	public String getPageNavi() {
		return pageNavi;
	}

	public void setPageNavi(String pageNavi) {
		this.pageNavi = pageNavi;
	}

	@Override
	public String toString() {
		return "M_FilePage [fPdList=" + fPdList + ", pageNavi=" + pageNavi + "]";
	}
	
	
}
