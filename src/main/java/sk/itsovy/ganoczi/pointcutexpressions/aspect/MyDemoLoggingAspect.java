package sk.itsovy.ganoczi.pointcutexpressions.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import sk.itsovy.ganoczi.pointcutexpressions.Account;

import java.util.List;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {


    @AfterReturning(
            pointcut = "execution(* sk.itsovy.ganoczi.pointcutexpressions.dao.AccountDAO.findAccounts(..))",
            returning = "result")
    public void afterReturningFindAccountsAdvice(JoinPoint joinPoint, List<Account> result){

        String method=joinPoint.getSignature().toShortString();
        System.out.println("\n====>>> Executing @AfterReturning on method: "+method );
        System.out.println("\n====>>> result is: "+result );

        convertAccountNamesToUpperCase(result);
    }

    private void convertAccountNamesToUpperCase(List<Account> result) {

        for (Account tempAccount: result){
            String theUpperName=tempAccount.getName().toUpperCase();

            tempAccount.setName(theUpperName);
        }
    }


    @Before("sk.itsovy.ganoczi.pointcutexpressions.aspect.AopExpressions.forDaoPackageNoGetterSetter()")
    public void beforeAddAccountAdvice(JoinPoint joinPoint){

        System.out.println("\n===>>> Executing @before advice on addAccount()");

        MethodSignature methodSignature=(MethodSignature) joinPoint.getSignature();


        System.out.println("Method: "+methodSignature);

        Object[] args = joinPoint.getArgs();

        for (Object tempArg: args){

            System.out.println(tempArg);

            if (tempArg instanceof Account){

                Account account=(Account) tempArg;

                System.out.println("account name: "+account.getName());
                System.out.println("account level: "+account.getLevel());


            }
        }


    }




}
