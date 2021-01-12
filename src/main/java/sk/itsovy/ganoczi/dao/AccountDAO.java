package sk.itsovy.ganoczi.dao;


import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    public void addAccount() {

        System.out.println(getClass()+ ": DOING MY DB WORK: Adding an account");
    }



}
