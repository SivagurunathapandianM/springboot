package filter.copy;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component
public class SimpleFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Remote Host:"+servletRequest.getRemoteHost());
        System.out.println("Remote Address:"+servletRequest.getRemoteAddr());
        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void destroy() {}


    public void init(FilterConfig filterconfig) throws ServletException {}
}