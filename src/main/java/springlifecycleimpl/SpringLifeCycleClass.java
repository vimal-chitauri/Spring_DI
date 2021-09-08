package springlifecycleimpl;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLifeCycleClass {
    public static void main(String[] args) {
        /**
         * there are 3 ways to create Spring lifecycle method
         * 1.xml way i.e to use AbstractApplicationContext and registerShutdownHook()
         * 2.interface way i.e to use InitializingBean, DisposableBean interface inside bean class
         * 3. Annotation way
         */
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("SpringLifeCycle.xml");
        Dish dish = (Dish) context.getBean("dish");
        System.out.println(dish);
        context.registerShutdownHook();
//   To use Destroy() for spring Lifecycle use AbstractApplicationContext class and context.registerShutdownHook();



    }
}
