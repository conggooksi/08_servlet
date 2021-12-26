import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServletTest02 extends HttpServlet{
	
	//doGet() 오버라이딩
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	  throws IOException, ServletException{
		response.setContentType("text/html;charset=UTF-8");//웹으로 응답할 때 한글 처리
		PrintWriter out=response.getWriter();//응답하기 위해 out 객체 생성

		//클라이언트가 보내준 데이터 받기
		String name=request.getParameter("name");
		String addr=request.getParameter("addr");
		
		//처리하고, 웹으로 응답
		out.println("<html>");
		out.println("<body>");
		out.println("당신의 이름 : "+name+"<br>");
		out.println("당신의 주소 : "+addr+"<br>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
		
		//web.xml에 등록
	}//doGet()-end
}//class-end
