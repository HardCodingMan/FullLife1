package support.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.model.service.MemberService;
import member.model.vo.Member;
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
		HttpSession session = request.getSession();
		String userId = (String)session.getAttribute("userId");
		
		int firstRank = Integer.parseInt(request.getParameter("rank1"));
		int secondRank = Integer.parseInt(request.getParameter("rank2"));
		int percentage1 = 0;
		int percentage2 = 0;
		
		Support firstSupport = new SupportService().getFirstSupportNotice(firstRank);
		Support secondSupport = new SupportService().getSecondSupportNotice(secondRank);
		Member member = new MemberService().getMemberTotalPoint(userId);
		double nowSupport1 = firstSupport.getNowSupport();
		double nowSupport2 = secondSupport.getNowSupport();
		double needSupport1 = firstSupport.getNeedSupport();
		double needSupport2 = secondSupport.getNeedSupport();
		percentage1 = (int) (nowSupport1 / needSupport1 * 100);
		percentage2 = (int) (nowSupport2 / needSupport2 * 100);
		
		request.setAttribute("firstSupport", firstSupport);
		request.setAttribute("secondSupport", secondSupport);
		request.setAttribute("firstPercentage", percentage1);
		request.setAttribute("secondPercentage", percentage2);
		if(member != null) {
			request.setAttribute("totalPoint", member.getTotalPoint());			
		}
		request.getRequestDispatcher("/WEB-INF/views/donate/fastDonate.jsp").forward(request, response);			
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
