<<<<<<< HEAD
<<<<<<< HEAD:src/manager/apply/controller/M_applyReplyRemove.java
package manager.apply.controller;
=======
package mypage.controller;
>>>>>>> 648d74181ee17f888af35bf2c751770dfec6a2c3:src/mypage/controller/ModifyMemberServlet.java
=======
package manager.apply.controller;
>>>>>>> origin/stitchkang

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import manager.apply.model.service.M_applyService;

/**
<<<<<<< HEAD
<<<<<<< HEAD:src/manager/apply/controller/M_applyReplyRemove.java
=======
>>>>>>> origin/stitchkang
 * Servlet implementation class M_applyReplyRemove
 */
@WebServlet("/manager/m_apply_reply_remove")
public class M_applyReplyRemove extends HttpServlet {
<<<<<<< HEAD
=======
 * Servlet implementation class ModifyMemberServlet
 */
@WebServlet(name = "ModifyMemberInfoServlet", urlPatterns = { "/mypage/modify" })
public class ModifyMemberServlet extends HttpServlet {
>>>>>>> 648d74181ee17f888af35bf2c751770dfec6a2c3:src/mypage/controller/ModifyMemberServlet.java
=======
>>>>>>> origin/stitchkang
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
<<<<<<< HEAD
<<<<<<< HEAD:src/manager/apply/controller/M_applyReplyRemove.java
    public M_applyReplyRemove() {
=======
    public ModifyMemberServlet() {
>>>>>>> 648d74181ee17f888af35bf2c751770dfec6a2c3:src/mypage/controller/ModifyMemberServlet.java
=======
    public M_applyReplyRemove() {
>>>>>>> origin/stitchkang
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
<<<<<<< HEAD
<<<<<<< HEAD:src/manager/apply/controller/M_applyReplyRemove.java
=======
>>>>>>> origin/stitchkang
		int notiNo = Integer.parseInt(request.getParameter("notiNo"));
		int replyNo = Integer.parseInt(request.getParameter("apReNo"));
		int result = new M_applyService().removeReplyOne(replyNo);
		if(result > 0) {
			response.sendRedirect("/manager/m_apply_detail?noticeNo="+notiNo);
		}else {
			request.getRequestDispatcher("/WEB-INF/manager/manager_fail/m_search_fail.jsp").forward(request, response);
		}
		
<<<<<<< HEAD
=======
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
>>>>>>> 648d74181ee17f888af35bf2c751770dfec6a2c3:src/mypage/controller/ModifyMemberServlet.java
=======
>>>>>>> origin/stitchkang
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
