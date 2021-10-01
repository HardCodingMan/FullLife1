package mypageHistory.model.vo;

import java.util.List;


public class HistoryPage {
	private List<History> hList;
	
	public HistoryPage() {}

	public List<History> gethList() {
		return hList;
	}

	public void sethList(List<History> hList) {
		this.hList = hList;
	}

	@Override
	public String toString() {
		return "HistoryData [hList=" + hList + "]";
	}

	

}
