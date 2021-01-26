package sk.itsovy.ganoczi.pointcutexpressions.dao;


import org.springframework.stereotype.Component;
import sk.itsovy.ganoczi.pointcutexpressions.Account;

@Component
public class AccountDAO {

    public void addAccount(Account account, boolean vipFlag) {

        System.out.println(getClass()+ ": DOING MY DB WORK: Adding an account");
    }

    public boolean doWork(){
        System.out.println(getClass()+ ": doWork");
        return false;
    }


}
