<<<<<<< HEAD
<<<<<<< HEAD
package manager.apply.controller;
=======
<<<<<<< HEAD:src/mypage/controller/ModifyMemberServlet.java
package mypage.controller;
=======
package manager.apply.controller;
>>>>>>> b3a7e139a4285fcf944c479c1a0ee6ade1760742:src/manager/apply/controller/M_applyRemoveServlet.java
>>>>>>> origin/stitchkang
=======
<<<<<<< HEAD:src/apply/controller/ApplyLikeServlet.java
package apply.controller;
=======
package manager.apply.controller;
>>>>>>> b3a7e139a4285fcf944c479c1a0ee6ade1760742:src/manager/apply/controller/M_applyRemoveServlet.java
>>>>>>> 08230fdaf7261b175f5901d2ae79ffb1e3a548ae

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import apply.model.service.ApplyNoticeService;

import manager.apply.model.service.M_applyService;

/**
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD:src/mypage/controller/ModifyMemberServlet.java
 * Servlet implementation class ModifyMemberServlet
 */
@WebServlet(name = "ModifyMemberInfoServlet", urlPatterns = { "/mypage/modify" })
public class ModifyMemberServlet extends HttpServlet {
=======
>>>>>>> origin/stitchkang
=======
<<<<<<< HEAD:src/apply/controller/ApplyLikeServlet.java
 * Servlet implementation class ApplyLikeServlet
 */
@WebServlet("/Notice/Apply/ApplyLike")
public class ApplyLikeServlet extends HttpServlet {
=======
>>>>>>> 08230fdaf7261b175f5901d2ae79ffb1e3a548ae
 * Servlet implementation class M_applyRemoveServlet
 */
@WebServlet("/manager/m_apply_remove")
public class M_applyRemoveServlet extends HttpServlet {
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b3a7e139a4285fcf944c479c1a0ee6ade1760742:src/manager/apply/controller/M_applyRemoveServlet.java
>>>>>>> origin/stitchkang
=======
>>>>>>> b3a7e139a4285fcf944c479c1a0ee6ade1760742:src/manager/apply/controller/M_applyRemoveServlet.java
>>>>>>> 08230fdaf7261b175f5901d2ae79ffb1e3a548ae
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
<<<<<<< HEAD
<<<<<<< HEAD
    public M_applyRemoveServlet() {
=======
<<<<<<< HEAD:src/mypage/controller/ModifyMemberServlet.java
    public ModifyMemberServlet() {
=======
    public M_applyRemoveServlet() {
>>>>>>> b3a7e139a4285fcf944c479c1a0ee6ade1760742:src/manager/apply/controller/M_applyRemoveServlet.java
>>>>>>> origin/stitchkang
=======
<<<<<<< HEAD:src/apply/controller/ApplyLikeServlet.java
    public ApplyLikeServlet() {
=======
    public M_applyRemoveServlet() {
>>>>>>> b3a7e139a4285fcf944c479c1a0ee6ade1760742:src/manager/apply/controller/M_applyRemoveServlet.java
>>>>>>> 08230fdaf7261b175f5901d2ae79ffb1e3a548ae
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD:src/mypage/controller/ModifyMemberServlet.java
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
=======
>>>>>>> origin/stitchkang
=======
<<<<<<< HEAD:src/apply/controller/ApplyLikeServlet.java
=======
>>>>>>> 08230fdaf7261b175f5901d2ae79ffb1e3a548ae
		int notiNo = Integer.parseInt(request.getParameter("notiNo"));
		int result = new M_applyService().deleteApply(notiNo);
		if(result > 0) {
			response.sendRedirect("/manager/m_apply_list");
		}else {
			request.getRequestDispatcher("/WEB-INF/manager/manager_fail/m_search_fail.jsp").forward(request, response);
		}
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b3a7e139a4285fcf944c479c1a0ee6ade1760742:src/manager/apply/controller/M_applyRemoveServlet.java
>>>>>>> origin/stitchkang
=======
>>>>>>> b3a7e139a4285fcf944c479c1a0ee6ade1760742:src/manager/apply/controller/M_applyRemoveServlet.java
>>>>>>> 08230fdaf7261b175f5901d2ae79ffb1e3a548ae
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String userId = (String)session.getAttribute("userId"); 
		int noticeNo = Integer.parseInt(request.getParameter("noticeNo"));
		int result = new ApplyNoticeService().insertLike(userId, noticeNo);
		if(result > 0) {
			response.sendRedirect("/Notice/Apply/ApplyContents?noticeNo="+noticeNo);
		}else {
			request.getRequestDispatcher("/WEB-INF/views/Notice/ApplyError.jsp").forward(request, response);
		}
	}

}
