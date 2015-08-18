/**
 * 
 * @Title RequestInfo.java
 * @Package tomcatServletExamples
 * @Description TODO(用一句话描述该文件做什么)
 * @author yan.liang
 * @date 2015年7月22日 下午10:32:03
 * @copyright USTCINFO
 */
package tomcatServletExamples;

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
public class RequestInfo extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<head>");
		out.println("<title>Request Information Example</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3>Request Information Example</h3>");
		out.println("Method: " + request.getMethod() + "</br>");
		out.println("Request URI: " + request.getRequestURI() + "</br>");
		out.println("Protocol: " + request.getProtocol() + "</br>");
		out.println("PathInfo: " + request.getPathInfo() + "</br>");
		out.println("Remote Address: " + request.getRemoteAddr() + "</br>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * We are going to perform the same operations for POST requests as for GET
	 * methods, so this method just sends the request to the doGet method.
	 */

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		doGet(request, response);
	}
}
