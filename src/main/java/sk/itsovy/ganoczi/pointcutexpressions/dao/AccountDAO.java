package sk.itsovy.ganoczi.pointcutexpressions.dao;


import org.springframework.stereotype.Component;
import sk.itsovy.ganoczi.pointcutexpressions.Account;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountDAO {

    private String name;
    private String serviceCode;

    public List<Account> findAccounts(){

        List<Account> myAccounts=new ArrayList<>();

        Account temp1=new Account("John", "Silver");
        Account temp2=new Account("Madhu", "Platinum");
        Account temp3=new Account("Luca", "Gold");

        myAccounts.add(temp1);
        myAccounts.add(temp2);
        myAccounts.add(temp3);

        return myAccounts;
    }

    public void addAccount(Account account, boolean vipFlag) {

        System.out.println(getClass()+ ": DOING MY DB WORK: Adding an account");
    }

    public boolean doWork(){
        System.out.println(getClass()+ ": doWork");
        return false;
    }

    public String getName() {
        System.out.println(getClass()+ ": getname");
        return name;
    }

    public void setName(String name) {
        System.out.println(getClass()+ ": setname");
        this.name = name;
    }

    public String getServiceCode() {
        System.out.println(getClass()+ ": getservice");
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        System.out.println(getClass()+ ": setservice");
        this.serviceCode = serviceCode;
    }
}
