package sk.itsovy.ganoczi.pointcutdeclarations;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("sk.itsovy.ganoczi")
public class DemoConfig {


}
