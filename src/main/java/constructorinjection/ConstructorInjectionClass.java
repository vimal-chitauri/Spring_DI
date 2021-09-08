package constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectionClass {
    public static void main(String[] args) {
//        Constructor injection with reference DI
        ApplicationContext context = new ClassPathXmlApplicationContext("ConstructorInjection.xml");
        Person person= (Person) context.getBean("person");
        System.out.println(person);
    }
}
