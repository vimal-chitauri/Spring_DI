package autowireusingxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Machine {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiredusingxml.xml");
        MachineBean machineBean= (MachineBean) context.getBean("machineBean");
        System.out.println(machineBean);
    }
}
