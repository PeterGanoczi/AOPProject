package sk.itsovy.ganoczi.pointcutdeclarations.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

    @Before("execution(* sk.itsovy.ganoczi.pointcutexpressions.dao.*.*(..))")
    public void beforeAddAccountAdvice(){
        System.out.println("\n===>>> Executing @before advice on addAccount()");
    }
}
