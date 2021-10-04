<<<<<<< HEAD:src/mypage/controller/ModifyMemberServlet.java
package mypage.controller;
=======
package manager.apply.controller;
>>>>>>> b3a7e139a4285fcf944c479c1a0ee6ade1760742:src/manager/apply/controller/M_applyRemoveServlet.java

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import manager.apply.model.service.M_applyService;

/**
<<<<<<< HEAD:src/mypage/controller/ModifyMemberServlet.java
 * Servlet implementation class ModifyMemberServlet
 */
@WebServlet(name = "ModifyMemberInfoServlet", urlPatterns = { "/mypage/modify" })
public class ModifyMemberServlet extends HttpServlet {
=======
 * Servlet implementation class M_applyRemoveServlet
 */
@WebServlet("/manager/m_apply_remove")
public class M_applyRemoveServlet extends HttpServlet {
>>>>>>> b3a7e139a4285fcf944c479c1a0ee6ade1760742:src/manager/apply/controller/M_applyRemoveServlet.java
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
<<<<<<< HEAD:src/mypage/controller/ModifyMemberServlet.java
    public ModifyMemberServlet() {
=======
    public M_applyRemoveServlet() {
>>>>>>> b3a7e139a4285fcf944c479c1a0ee6ade1760742:src/manager/apply/controller/M_applyRemoveServlet.java
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
<<<<<<< HEAD:src/mypage/controller/ModifyMemberServlet.java
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
=======
		int notiNo = Integer.parseInt(request.getParameter("notiNo"));
		int result = new M_applyService().deleteApply(notiNo);
		if(result > 0) {
			response.sendRedirect("/manager/m_apply_list");
		}else {
			request.getRequestDispatcher("/WEB-INF/manager/manager_fail/m_search_fail.jsp").forward(request, response);
		}
>>>>>>> b3a7e139a4285fcf944c479c1a0ee6ade1760742:src/manager/apply/controller/M_applyRemoveServlet.java
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
