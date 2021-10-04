<<<<<<< HEAD
<<<<<<< HEAD:src/mypage/controller/DeleteReserveServlet.java
package mypage.controller;
=======
package manager.apply.controller;
>>>>>>> b3a7e139a4285fcf944c479c1a0ee6ade1760742:src/manager/apply/controller/M_applyRemoveServlet.java
=======
package mypage.controller;
>>>>>>> origin/stitchkang

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mypage.model.service.MypageService;

/**
<<<<<<< HEAD
<<<<<<< HEAD:src/mypage/controller/DeleteReserveServlet.java
=======
>>>>>>> origin/stitchkang
 * Servlet implementation class DeleteReserveServlet
 */
@WebServlet("/mypage/delete")
public class DeleteReserveServlet extends HttpServlet {
<<<<<<< HEAD
=======
 * Servlet implementation class M_applyRemoveServlet
 */
@WebServlet("/manager/m_apply_remove")
public class M_applyRemoveServlet extends HttpServlet {
>>>>>>> b3a7e139a4285fcf944c479c1a0ee6ade1760742:src/manager/apply/controller/M_applyRemoveServlet.java
=======
>>>>>>> origin/stitchkang
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
<<<<<<< HEAD
<<<<<<< HEAD:src/mypage/controller/DeleteReserveServlet.java
    public DeleteReserveServlet() {
=======
    public M_applyRemoveServlet() {
>>>>>>> b3a7e139a4285fcf944c479c1a0ee6ade1760742:src/manager/apply/controller/M_applyRemoveServlet.java
=======
    public DeleteReserveServlet() {
>>>>>>> origin/stitchkang
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
<<<<<<< HEAD
<<<<<<< HEAD:src/mypage/controller/DeleteReserveServlet.java
=======
>>>>>>> origin/stitchkang
		HttpSession session = request.getSession();
		
		String userId = (String)session.getAttribute("userId");
		int result = new MypageService().deleteHospitalInfo(userId);
		if(result > 0) {
			response.sendRedirect("/mypage/main");
<<<<<<< HEAD
=======
		int notiNo = Integer.parseInt(request.getParameter("notiNo"));
		int result = new M_applyService().deleteApply(notiNo);
		if(result > 0) {
			response.sendRedirect("/manager/m_apply_list");
		}else {
			request.getRequestDispatcher("/WEB-INF/manager/manager_fail/m_search_fail.jsp").forward(request, response);
>>>>>>> b3a7e139a4285fcf944c479c1a0ee6ade1760742:src/manager/apply/controller/M_applyRemoveServlet.java
=======
>>>>>>> origin/stitchkang
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
