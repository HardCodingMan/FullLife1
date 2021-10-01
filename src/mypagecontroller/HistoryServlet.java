package mypagecontroller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mypageHistory.model.vo.History;
import mypageHistory.model.vo.HistoryPage;
import mypageHistory.service.HistoryService;

/**
 * Servlet implementation class MypageHistory
 */
@WebServlet("/mypage/history")
public class HistoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HistoryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int historyPage = 0;
		String getHistoryPage = request.getParameter("historyPage");
		if(getHistoryPage == null) {
			historyPage = 1;
		}else {
			historyPage = Integer.parseInt(getHistoryPage);
		}
		HistoryPage his = new HistoryService().printAllList(historyPage);
		List<History> hList = his.gethList();
		if(!hList.isEmpty()) {
			request.setAttribute("hLisst", hList);
			request.getRequestDispatcher("/WEB-INF/views/mypage/mypageHistory.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("/WEB-INF/views/mypage/mypageHistory.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
