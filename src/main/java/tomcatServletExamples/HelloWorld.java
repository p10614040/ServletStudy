/**
 * 
 * @Title HelloWorld.java
 * @Package tomcatServletExamples
 * @Description TODO(用一句话描述该文件做什么)
 * @author yan.liang
 * @date 2015年7月22日 下午10:26:58
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
 * 结论：Servlet 只会被实例化一次
 */
public class HelloWorld extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	static {
		System.out.println("HelloWorld 被加载");
	}

	{
		System.out.println("HelloWorld 被实例化");
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		Thread.currentThread().setName("HelloWorld Sevlet");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Hello World!</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Hello World!</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}
