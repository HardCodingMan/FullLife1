<<<<<<< HEAD
package mypage.controller;
=======
<<<<<<< HEAD:src/manager/apply/controller/M_applyRemoveServlet.java
package manager.apply.controller;
=======
package mypage.controller;
>>>>>>> origin/master:src/mypage/controller/ModifyMemberServlet.java
>>>>>>> f152e77a3ef574e6a4eb307c74533b8f2e1bc621

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

<<<<<<< HEAD
/**
=======
import manager.apply.model.service.M_applyService;

/**
<<<<<<< HEAD:src/manager/apply/controller/M_applyRemoveServlet.java
 * Servlet implementation class M_applyRemoveServlet
 */
@WebServlet("/manager/m_apply_remove")
public class M_applyRemoveServlet extends HttpServlet {
=======
>>>>>>> f152e77a3ef574e6a4eb307c74533b8f2e1bc621
 * Servlet implementation class ModifyMemberServlet
 */
@WebServlet(name = "ModifyMemberInfoServlet", urlPatterns = { "/mypage/modify" })
public class ModifyMemberServlet extends HttpServlet {
<<<<<<< HEAD
=======
>>>>>>> origin/master:src/mypage/controller/ModifyMemberServlet.java
>>>>>>> f152e77a3ef574e6a4eb307c74533b8f2e1bc621
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
<<<<<<< HEAD
    public ModifyMemberServlet() {
=======
<<<<<<< HEAD:src/manager/apply/controller/M_applyRemoveServlet.java
    public M_applyRemoveServlet() {
=======
    public ModifyMemberServlet() {
>>>>>>> origin/master:src/mypage/controller/ModifyMemberServlet.java
>>>>>>> f152e77a3ef574e6a4eb307c74533b8f2e1bc621
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
<<<<<<< HEAD
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
=======
<<<<<<< HEAD:src/manager/apply/controller/M_applyRemoveServlet.java
		int notiNo = Integer.parseInt(request.getParameter("notiNo"));
		int result = new M_applyService().deleteApply(notiNo);
		if(result > 0) {
			response.sendRedirect("/manager/m_apply_list");
		}else {
			request.getRequestDispatcher("/WEB-INF/manager/manager_fail/m_search_fail.jsp").forward(request, response);
		}
=======
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
>>>>>>> origin/master:src/mypage/controller/ModifyMemberServlet.java
>>>>>>> f152e77a3ef574e6a4eb307c74533b8f2e1bc621
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
