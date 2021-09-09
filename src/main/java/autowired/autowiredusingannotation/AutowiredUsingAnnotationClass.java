package autowired.autowiredusingannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredUsingAnnotationClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowireusingannotation.xml");
        AutowiredAnnotationBean autowiredAnnotationBean = (AutowiredAnnotationBean) context.getBean("autowiredAnnotationBean");
        System.out.println(autowiredAnnotationBean);
    }
}
