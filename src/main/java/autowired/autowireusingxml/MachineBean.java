package autowired.autowireusingxml;

public class MachineBean {
    private ElectricMachine electricMachine;

    public ElectricMachine getElectricMachine() {
        return electricMachine;
    }

    public void setElectricMachine(ElectricMachine electricMachine) {
        this.electricMachine = electricMachine;
    }

    @Override
    public String toString() {
        return "MachineBean{" +
                "electricMachine=" + electricMachine +
                '}';
    }
}
