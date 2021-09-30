package apply.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import apply.model.service.ApplyNoticeService;
import apply.model.vo.ApplyNotice;

/**
 * Servlet implementation class ApplyContentsServlet
 */
@WebServlet("/Notice/Apply/ApplyContents")
public class ApplyContentsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApplyContentsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int applyNoticeNo = Integer.parseInt(request.getParameter("noticeNo"));
		ApplyNotice aOne = new ApplyNoticeService().printOneByNo(applyNoticeNo);
		if(aOne != null) {
			request.setAttribute("aOne", aOne);
			// NoticeReply setAttribute 해줌
			request.getRequestDispatcher("/WEB-INF/views/Notice/Apply/ApplyContents.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("/WEB-INF/views/Notice/ApplyError.jsp").forward(request, response);
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
