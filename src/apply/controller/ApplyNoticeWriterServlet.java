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
 * Servlet implementation class ApplyNoticeWriterServlet
 */
@WebServlet("/Notice/Apply/ApplyNoticeWriter")
public class ApplyNoticeWriterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApplyNoticeWriterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/Notice/Apply/ApplyNoticeWriter.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");//한글인코딩
		String subject = request.getParameter("apply-notice-sub");
		String Contents = request.getParameter("apply-notice-contents");
		// 작성자 아이디는 로그인 서블렛에서 가져오기
		
		//ApplyNotice 객체에 정보 세팅
		ApplyNotice applyNotice = new ApplyNotice();
		applyNotice.setApplyTitle(subject);
		applyNotice.setApplyContents(Contents);
//		applyNotice.setUserId();
		int result = new ApplyNoticeService().noticeWrite(applyNotice);
		if(result > 0) {
			response.sendRedirect("/Notice/Apply/ApplyContents");
		}else {
			request.getRequestDispatcher("/WEB-INF/Notice/NoticeError.jsp").forward(request, response);
		}
		
	}

}
