package mypagecontroller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mypageHistory.model.service.HistoryService;
import mypageHistory.model.vo.BookedHospitalInfo;

/**
 * Servlet implementation class MypageRegHospital
 */
@WebServlet("/mypage/regHospital")
public class RegHospitalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegHospitalServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String userId = (String)session.getAttribute("userId");
		BookedHospitalInfo bookedInfo = new HistoryService().getBookedHospitalInfo(userId);
		System.out.println(bookedInfo.getOrgan());
		if(bookedInfo != null) {
			request.setAttribute("bookedInfo", bookedInfo);
			request.getRequestDispatcher("/WEB-INF/views/mypage/mypageRegHospital.jsp").forward(request, response);	
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
