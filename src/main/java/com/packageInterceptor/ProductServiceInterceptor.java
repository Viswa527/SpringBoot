package com.packageInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class ProductServiceInterceptor implements HandlerInterceptor {
	
		@Override
	    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
	      System.out.println("Pre-Handle method is called ");
	      return true;
	   }
		
	   @Override
	   public void postHandle(HttpServletRequest request, HttpServletResponse response, 
	      Object handler, ModelAndView modelAndView) throws Exception {
	      
	      System.out.println("Post-Handle method is Called");
	   }
	   
	   @Override
	   public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception exception) throws Exception {   
	      System.out.println("Request and Response is completed");
	   }
}
