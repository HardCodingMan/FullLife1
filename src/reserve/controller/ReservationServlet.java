package reserve.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Reservation
 */
@WebServlet("/reserve/reservation")
public class ReservationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReservationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String metroCity = request.getParameter("metro-city");
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f152e77a3ef574e6a4eb307c74533b8f2e1bc621
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
>>>>>>> origin/master
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
//		System.out.println(hospitalNo);
>>>>>>> 7f17ff42baf25563595b9152103373b9fc4b11f9
=======
=======
>>>>>>> origin/JaeWon
	<<<<<<< HEAD
	//		System.out.println(hospitalNo);
	=======
	>>>>>>> origin/Hyunseok
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> origin/JaeWon
=======
>>>>>>> cbeb7513c6a7aa4151cefce6d693fd4009b3b87b
>>>>>>> b3a7e139a4285fcf944c479c1a0ee6ade1760742
=======
>>>>>>> cbeb7513c6a7aa4151cefce6d693fd4009b3b87b
=======
>>>>>>> origin/JaeWon
>>>>>>> origin/master
>>>>>>> f152e77a3ef574e6a4eb307c74533b8f2e1bc621
=======
>>>>>>> origin/JaeWon
=======
>>>>>>> origin/Hyunseok
<<<<<<< HEAD
=======
>>>>>>> 90457858296a0648f3dbceba363a27581d912d19
=======
>>>>>>> origin/stitchkang
>>>>>>> f152e77a3ef574e6a4eb307c74533b8f2e1bc621
		request.setAttribute("metroCity", metroCity);
		request.getRequestDispatcher("/WEB-INF/views/reserve/reservation.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
