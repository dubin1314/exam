package exam.com.cn.filter;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class FrameworkFilter implements Filter {
	private static final Logger log = Logger.getLogger(FrameworkFilter.class);

	/**
	 * �����¼ҳ��
	 */
	public static final String LOGIN_PAGE = "/login.jsp";

	@Override
	public void destroy() {
		log.info("---------------------------����������-------------------------------");
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;

		// �ж�session���Ƿ����û���Ϣ��������У�������ת����½ҳ��
		HttpSession session = request.getSession();

		String privilege = (String) session.getAttribute("privilege");

		if (!StringUtils.isBlank(privilege)) {
			filterChain.doFilter(request, response);
		} else {
			response.sendRedirect(request.getContextPath() + LOGIN_PAGE);
		}
		return;
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		log.info("---------------------------��������ʼ-------------------------------");
	}

}
