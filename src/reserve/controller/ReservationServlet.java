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
<<<<<<< HEAD
>>>>>>> 648d74181ee17f888af35bf2c751770dfec6a2c3
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> origin/stitchkang
=======
=======
>>>>>>> 3981585e63b4c0fc2d020bc1fa161f35001a535e
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> origin/master
=======
>>>>>>> origin/stitchkang
<<<<<<< HEAD
=======
>>>>>>> b3a7e139a4285fcf944c479c1a0ee6ade1760742
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
>>>>>>> cbeb7513c6a7aa4151cefce6d693fd4009b3b87b
=======
>>>>>>> origin/JaeWon
>>>>>>> origin/master
=======
>>>>>>> origin/JaeWon
=======
>>>>>>> cbeb7513c6a7aa4151cefce6d693fd4009b3b87b
>>>>>>> b3a7e139a4285fcf944c479c1a0ee6ade1760742
>>>>>>> origin/stitchkang
=======
>>>>>>> origin/JaeWon
=======
>>>>>>> origin/Hyunseok
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> origin/stitchkang
=======
=======
>>>>>>> 90457858296a0648f3dbceba363a27581d912d19
>>>>>>> 648d74181ee17f888af35bf2c751770dfec6a2c3
=======
=======
>>>>>>> 90457858296a0648f3dbceba363a27581d912d19
=======
>>>>>>> origin/stitchkang
>>>>>>> 3981585e63b4c0fc2d020bc1fa161f35001a535e
>>>>>>> origin/stitchkang
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
