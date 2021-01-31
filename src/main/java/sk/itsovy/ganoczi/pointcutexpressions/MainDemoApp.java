package sk.itsovy.ganoczi.pointcutexpressions;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sk.itsovy.ganoczi.pointcutexpressions.dao.AccountDAO;
import sk.itsovy.ganoczi.pointcutexpressions.dao.MembershipDAO;


public class MainDemoApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(DemoConfig.class);

        AccountDAO accountDAO=context.getBean("accountDAO", AccountDAO.class);

        MembershipDAO membershipDAO=context.getBean("membershipDAO", MembershipDAO.class);

        Account account=new Account();
        account.setName("Madu");
        account.setLevel("Platinum");

        accountDAO.addAccount(account, true);
        accountDAO.doWork();

        accountDAO.setName("foobar");
        accountDAO.setServiceCode("silver");

        String name=accountDAO.getName();
        String code= accountDAO.getServiceCode();

        membershipDAO.addAccount();
        membershipDAO.goToSleep();


        context.close();

    }
}
