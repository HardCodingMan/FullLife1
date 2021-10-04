<<<<<<< HEAD:src/manager/apply/controller/M_applyUpdateServlet.java
package manager.apply.controller;
=======
package mypage.controller;
>>>>>>> 648d74181ee17f888af35bf2c751770dfec6a2c3:src/mypage/controller/ModifyMemberServlet.java

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import manager.apply.model.service.M_applyService;
import manager.apply.model.vo.M_apply;

/**
<<<<<<< HEAD:src/manager/apply/controller/M_applyUpdateServlet.java
 * Servlet implementation class M_applyUpdateServlet
 */
@WebServlet("/manager/m_apply_update")
public class M_applyUpdateServlet extends HttpServlet {
=======
 * Servlet implementation class ModifyMemberServlet
 */
@WebServlet(name = "ModifyMemberInfoServlet", urlPatterns = { "/mypage/modify" })
public class ModifyMemberServlet extends HttpServlet {
>>>>>>> 648d74181ee17f888af35bf2c751770dfec6a2c3:src/mypage/controller/ModifyMemberServlet.java
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
<<<<<<< HEAD:src/manager/apply/controller/M_applyUpdateServlet.java
    public M_applyUpdateServlet() {
=======
    public ModifyMemberServlet() {
>>>>>>> 648d74181ee17f888af35bf2c751770dfec6a2c3:src/mypage/controller/ModifyMemberServlet.java
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
<<<<<<< HEAD:src/manager/apply/controller/M_applyUpdateServlet.java
		int notiNo = Integer.parseInt(request.getParameter("notiNo"));
		int result = new M_applyService().updateApply(notiNo);
		if(result > 0) {
			response.sendRedirect("/manager/m_apply_list");
		}else {
			request.getRequestDispatcher("/WEB-INF/manager/manager_fail/m_search_fail.jsp").forward(request, response);
		}
		
=======
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
>>>>>>> 648d74181ee17f888af35bf2c751770dfec6a2c3:src/mypage/controller/ModifyMemberServlet.java
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
