package com.packageInterceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SuppressWarnings("deprecation")
@Component
public class ProductServiceInterceptorConfiguration extends WebMvcConfigurerAdapter{
	
	@Autowired
	   ProductServiceInterceptor productServiceInterceptor;

	   @Override
	   public void addInterceptors(InterceptorRegistry registry) {
	      registry.addInterceptor(productServiceInterceptor);
	   }
}
