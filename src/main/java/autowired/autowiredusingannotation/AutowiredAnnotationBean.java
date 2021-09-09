package autowired.autowiredusingannotation;

import org.springframework.beans.factory.annotation.Autowired;

public class AutowiredAnnotationBean {

    /**
     * autowired annotation can be used in three way
     * 1. as property
     * 2. as setter
     * 3. as constructor
     *
     * @param autowiredAnnotationParent
     */
//    @Autowired
    public AutowiredAnnotationBean(AutowiredAnnotationParent autowiredAnnotationParent) {
        super();
    }

    @Autowired
    private AutowiredAnnotationParent autowiredAnnotationParent;

    public AutowiredAnnotationParent getElectricMachine() {
        return autowiredAnnotationParent;
    }

//    @Autowired
    public void setElectricMachine(AutowiredAnnotationParent autowiredAnnotationParent) {
        this.autowiredAnnotationParent = autowiredAnnotationParent;
    }

    @Override
    public String toString() {
        return "MachineBean{" +
                "electricMachine=" + autowiredAnnotationParent +
                '}';
    }
}
