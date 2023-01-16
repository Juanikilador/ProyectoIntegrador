package com.portfolio.Juan.Security.jwt;

import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class JwtEntryPoint implements AuthenticationEntryPoint{
    private final static Logger logger = LoggerFactory.getLogger(JwEntryPoint.class);
    
    @Override 
    public void commence (HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException{
        logger.error("Falló el método commence");
        response.sendError(HttpServletResponse.SC UNAUTHORILED);
    }
}
