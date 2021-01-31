package sk.itsovy.ganoczi.pointcutexpressions;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sk.itsovy.ganoczi.pointcutexpressions.dao.AccountDAO;
import sk.itsovy.ganoczi.pointcutexpressions.dao.MembershipDAO;

import java.util.List;

public class AfterReturningDemoApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(DemoConfig.class);

        AccountDAO accountDAO=context.getBean("accountDAO", AccountDAO.class);

        List<Account> accounts=accountDAO.findAccounts();


        System.out.println("\n Main program: AfterReturningDEmoApp");
        System.out.println("----");
        System.out.println(accounts);


        context.close();

    }
}
