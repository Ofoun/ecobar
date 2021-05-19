package com.ofoun.ecobar.interceptor;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.servlet.support.RequestContextUtils;
 
@SuppressWarnings("deprecation")
public class UrlLocaleInterceptor extends HandlerInterceptorAdapter {
 
   @Override
   public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
           throws Exception {
 
       LocaleResolver localeResolver = RequestContextUtils.getLocaleResolver(request);
 
       if (localeResolver == null) {
           throw new IllegalStateException("No LocaleResolver found: not in a DispatcherServlet request?");
       }
 
       // Get Locale from LocaleResolver
       Locale locale = localeResolver.resolveLocale(request);
 
       localeResolver.setLocale(request, response, locale);
 
       return true;
   }

public void setParamName(String string) {
	// TODO Automatisch generierter Methodenstub
	
}
 
}