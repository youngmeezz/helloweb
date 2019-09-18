import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/join")
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//POST 방식의 문자열 엔코딩
		request.setCharacterEncoding("UTF-8");
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String birthYear = request.getParameter("birth-year");
		String gender = request.getParameter("gender");
		String[] hobbies = request.getParameterValues("hobby");
		String selfIntro = request.getParameter("self-intro");
		
		
		for(String hobby : hobbies) {
			System.out.println(hobby);
		}
		
		System.out.println(selfIntro);
		//응답 문자열 엔코딩
		
		response.setCharacterEncoding("text/html;charset=UTF-8");

		response.getWriter().println("안녕하세요");
		System.out.println(email + ":" + password + ":" + birthYear + ":"+ gender);
		
		response.getWriter().println("ok");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
