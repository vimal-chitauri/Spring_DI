package autowired.autowiredusingannotation;

public class AutowiredAnnotationParent {
    private String nameofMachine;
    private String workingOfMachine;

    @Override
    public String toString() {
        return "ElectricMachine{" +
                "nameofMachine='" + nameofMachine + '\'' +
                ", workingOfMachine='" + workingOfMachine + '\'' +
                '}';
    }

    public String getNameofMachine() {
        return nameofMachine;
    }

    public void setNameofMachine(String nameofMachine) {
        this.nameofMachine = nameofMachine;
    }

    public String getWorkingOfMachine() {
        return workingOfMachine;
    }

    public void setWorkingOfMachine(String workingOfMachine) {
        this.workingOfMachine = workingOfMachine;
    }
}
