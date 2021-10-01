package support.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import support.model.service.SupportService;
import support.model.vo.Support;

/**
 * Servlet implementation class FastDonateServlet
 */
@WebServlet("/donate/move")
public class FastDonateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FastDonateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int firstRank = Integer.parseInt(request.getParameter("rank1"));
		int secondRank = Integer.parseInt(request.getParameter("rank2"));
		double percentage1 = 0;
		double percentage2 = 0;
		Support firstSupport = new SupportService().getFirstSupportNotice(firstRank);
		Support secondSupport = new SupportService().getSecondSupportNotice(secondRank);
		
		System.out.println(firstSupport.getNoticeTitle()+","+firstSupport.getNeedSupport()+","+firstSupport.getNowSupport()+","+firstSupport.getViews()+","+firstSupport.getPicPath());
		System.out.println(secondSupport.getNoticeTitle()+","+secondSupport.getNeedSupport()+","+secondSupport.getNowSupport()+","+secondSupport.getViews()+","+secondSupport.getPicPath());
		
		if(firstSupport != null && secondSupport != null) {
			request.setAttribute("firstSupport", firstSupport);
			request.setAttribute("secondSupport", secondSupport);
			request.setAttribute("firstPercentage", percentage1);
			request.setAttribute("secondPercentage", percentage2);
			request.getRequestDispatcher("/WEB-INF/views/donate/fastDonate.jsp").forward(request, response);
			
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
