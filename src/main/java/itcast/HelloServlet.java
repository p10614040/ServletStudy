/**
 * 
 * @Title HelloServlet.java
 * @Package itcast
 * @Description TODO(用一句话描述该文件做什么)
 * @author yan.liang
 * @date 2015年7月22日 下午10:17:05
 * @copyright USTCINFO
 */
package itcast;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author YanLiang
 *
 */
public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println("<font>Hello World!");
		out.println("</font>");
		out.println("<marquee>"+new java.util.Date()+"</marquee>");
		out.println("</html>");
	}
	
	


	
}
