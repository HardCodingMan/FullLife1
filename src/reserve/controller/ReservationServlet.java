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
=======
>>>>>>> f152e77a3ef574e6a4eb307c74533b8f2e1bc621
>>>>>>> 08230fdaf7261b175f5901d2ae79ffb1e3a548ae
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
=======
>>>>>>> origin/stitchkang2
//		System.out.println(hospitalNo);
	//		System.out.println(hospitalNo);
<<<<<<< HEAD
	=======
	>>>>>>> origin/Hyunseok
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> origin/JaeWon
=======
>>>>>>> cbeb7513c6a7aa4151cefce6d693fd4009b3b87b
>>>>>>> b3a7e139a4285fcf944c479c1a0ee6ade1760742
=======
>>>>>>> 08230fdaf7261b175f5901d2ae79ffb1e3a548ae
>>>>>>> cbeb7513c6a7aa4151cefce6d693fd4009b3b87b
=======
>>>>>>> origin/JaeWon
>>>>>>> origin/master
>>>>>>> f152e77a3ef574e6a4eb307c74533b8f2e1bc621
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
<<<<<<< HEAD
>>>>>>> origin/stitchkang
=======
=======
>>>>>>> 90457858296a0648f3dbceba363a27581d912d19
>>>>>>> 648d74181ee17f888af35bf2c751770dfec6a2c3
=======
=======
>>>>>>> 08230fdaf7261b175f5901d2ae79ffb1e3a548ae
=======
>>>>>>> 90457858296a0648f3dbceba363a27581d912d19
=======
>>>>>>> origin/stitchkang
<<<<<<< HEAD
>>>>>>> 3981585e63b4c0fc2d020bc1fa161f35001a535e
>>>>>>> origin/stitchkang
=======
>>>>>>> origin/stitchkang2
=======
>>>>>>> f152e77a3ef574e6a4eb307c74533b8f2e1bc621
>>>>>>> 08230fdaf7261b175f5901d2ae79ffb1e3a548ae
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
