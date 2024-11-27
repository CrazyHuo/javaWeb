package com.itheima.web;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")
public class FilterDemo implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {


    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("FilterDemo....");

        //放行
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("3.FilterDemo");


    }

    public void destroy() {

    }
}
