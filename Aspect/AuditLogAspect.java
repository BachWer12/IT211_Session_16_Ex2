package org.example.ex2.Aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Aspect
@Component
public class AuditLogAspect {

    @After("execution(* org.example.ex2.Controller.EmployeeController.getEmployees(..))")
    public void logEmployeeAccess(JoinPoint joinPoint) {

        String methodName = joinPoint.getSignature().getName();

        Authentication authentication =
                SecurityContextHolder.getContext().getAuthentication();

        String username = authentication.getName();

        System.out.println(
                "[AUDIT LOG] Tài khoản '" +
                        username +
                        "' đã gọi hàm '" +
                        methodName +
                        "' vào lúc " +
                        LocalDateTime.now()
        );
    }
}