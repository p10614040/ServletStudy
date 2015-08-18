/**
 * 
 * @Title UserFilter.java
 * @Package local.servletstudy
 * @Description TODO(用一句话描述该文件做什么)
 * @author yan.liang
 * @date 2015年7月10日 下午5:47:21
 * @copyright USTCINFO
 */
package local.servletstudy;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;

/**
 * @author YanLiang
 *
 */
public class UserFilter implements Filter {

	/* 
	 * Description: 
	 */
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	/* 
	 * Description: 
	 */
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpServletRequest = (HttpServletRequest)request;
		HttpServletResponse httpServletResponse = (HttpServletResponse)response;
		
		String userName = httpServletRequest.getParameter("userName");
		System.out.println(" filter userName : " + userName);
		System.out.println(httpServletRequest.getRemoteHost());

		chain.doFilter(httpServletRequest, httpServletResponse);
	}

	/* 
	 * Description: 
	 */
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
