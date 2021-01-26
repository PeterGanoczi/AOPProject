package sk.itsovy.ganoczi.pointcutdeclarations;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sk.itsovy.ganoczi.pointcutdeclarations.dao.AccountDAO;
import sk.itsovy.ganoczi.pointcutdeclarations.dao.MembershipDAO;

public class MainDemoApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(DemoConfig.class);

        AccountDAO accountDAO=context.getBean("accountDAO", AccountDAO.class);

        MembershipDAO membershipDAO=context.getBean("membershipDAO", MembershipDAO.class);

        Account account=new Account();

        accountDAO.addAccount(account, true);
        accountDAO.doWork();

        membershipDAO.addAccount();
        membershipDAO.goToSleep();


        context.close();

    }
}
