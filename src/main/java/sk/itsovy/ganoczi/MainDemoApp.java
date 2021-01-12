package sk.itsovy.ganoczi;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sk.itsovy.ganoczi.dao.AccountDAO;

public class MainDemoApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(DemoConfig.class);

        AccountDAO accountDAO=context.getBean("accountDAO", AccountDAO.class);

        accountDAO.addAccount();


        System.out.println("\n Call it again!\n");

        accountDAO.addAccount();
        
        context.close();
    }
}
