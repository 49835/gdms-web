package com.oracle.gdms.web.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class CharsetFilter
 */
@WebFilter("/admin/*")
public class CharsetFilter implements Filter {

	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// http://localhost:8080/gdms-web/admin/a/b/c/d/e
		HttpServletRequest req = (HttpServletRequest) request;
		String uri = req.getRequestURI();  // ��ǰ�����Ŀ����Դ
		System.out.println("��ǰ�����Ŀ����Դ=" + uri);
		req.setCharacterEncoding("UTF-8");
		chain.doFilter(request, response); // ����,����͵��ú�̨����Դ,���ý�������ص���һ�д�
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
