import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.util.*;

public class ServletTojsp extends HttpServlet{
	//doGet() 오버라이딩
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	  throws IOException, ServletException{
		
		response.setContentType("text/html;charset=UTF-8");//웹으로 응답할 때 한글 처리
		PrintWriter out=response.getWriter();//out객체 생성, 웹으로 응답 하기 위해
		
		//Map--HashMap
		String user="유재석";
		Map map=new HashMap();
		map.put("item1", "MBC연예대상");
		map.put("item2", "TVN연예대상");
		map.put("item3", "SBS연예대상");
		
		request.setAttribute("name", user);
		request.setAttribute("cast", map);
		
		//서블릿에서 JSP포워딩
		RequestDispatcher rd=getServletContext().getRequestDispatcher("/jsp/target.jsp");
		
		rd.forward(request, response);//jsp로 포워딩, 결과 출력은 jsp에서 한다
		
	}//doGet()-end
}//class-end
