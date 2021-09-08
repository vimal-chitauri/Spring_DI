package springlifecycleimpl;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Dish /*implements InitializingBean, DisposableBean*/ {
    private String dishName;

    @Override
    public String toString() {
        return "Dish{" +
                "dishName='" + dishName + '\'' +
                '}';
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    /**
     * used by XML Configuration Technique
     * @throws Exception
     */
    /*public void init(){
        System.out.println("init method called");
    }

    public void destroy(){
        System.out.println("destroy mehtod called");
    }*/

    /**
     * used by Interface Technique
     * @throws Exception
     */
   /* @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init method called from afterPropertiesSet()");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy method called from destroy() of DisposableBean");
    }*/

    /**
     * used by Annnotation Technique
     */
    @PostConstruct
    public void start() {
        System.out.println("start method called");
    }

    @PreDestroy
    public void end() {
        System.out.println("end mehtod called");
    }
}
