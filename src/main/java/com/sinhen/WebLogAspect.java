package com.sinhen;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WebLogAspect {
	@Pointcut("* *(..)")
    public void weblog(){}
	@Before("webLog()")
    public void doBefore(JoinPoint joinPoint){
		String a =joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName();
		System.out.println(a);
	}
}
