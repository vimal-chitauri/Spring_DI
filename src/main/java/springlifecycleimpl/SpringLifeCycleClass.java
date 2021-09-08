package springlifecycleimpl;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLifeCycleClass {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("SpringLifeCycle.xml");
        Dish dish= (Dish) context.getBean("dish");
        System.out.println(dish);
        context.registerShutdownHook();

//        To use Destroy() for spring Lifecycle use AbstractApplicationContext class and context.registerShutdownHook();
    }
}
