package sk.itsovy.ganoczi.pointcutexpressions.dao;


import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

    public void addAccount() {

        System.out.println(getClass()+ ": Doing stuff: adding membership account");
    }

    public void goToSleep(){
        System.out.println(getClass()+": going to sleep");
    }
}
