package sk.itsovy.ganoczi.pointcutexpressions.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopExpressions {

    @Pointcut("execution(* sk.itsovy.ganoczi.pointcutexpressions.dao.*.*(..))")
    private void forDaoPackage(){}

    @Pointcut("execution(* sk.itsovy.ganoczi.pointcutexpressions.dao.*.get*(..))")
    private void getter(){}


    @Pointcut("execution(* sk.itsovy.ganoczi.pointcutexpressions.dao.*.set*(..))")
    private void setter(){}

    @Pointcut("forDaoPackage() && !(getter() || setter())")
    private void forDaoPackageNoGetterSetter(){

    }


}
