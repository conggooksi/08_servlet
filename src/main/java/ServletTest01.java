import java.io.*;
//Exception 처리 : 파일 입출력, DB연결할 때, 웹으로 응답할 때, 채팅(NetWork)
//     <-- 데이터가 오고 갈 때는 Exception 처리를 한다
import javax.servlet.*;
import javax.servlet.http.*;
//  <-- 서블릿은 처음부터 나온게 아니라 나중에 추가된 기능이라 java'x'
public class ServletTest01 extends HttpServlet{

	//doGet():디폴트
	//doGet() 오버라이딩
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException{
		response.setContentType("text/html;charset=UTF-8");//클라이언트로 응답할 때 한글 처리
		PrintWriter out=response.getWriter();//응답하기 위한 out객체 생성
		
		//클라이언트로 응답
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>Hello World</h2>");
		out.println("<h2>안녕하세요</h2>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();//꼭 해줘야 한다!!!!!
		
		//ServletTest01를 web.xml에 등록 해 준다
		
	}//doGet()-end

}//class-end
