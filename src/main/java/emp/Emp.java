package emp;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
    private String empName;
    private List<String> empSubject;
    private Set<Integer> marks;
    private Map<String, Integer> marksheet;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public List<String> getEmpSubject() {
        return empSubject;
    }

    public void setEmpSubject(List<String> empSubject) {
        this.empSubject = empSubject;
    }

    public Set<Integer> getMarks() {
        return marks;
    }

    public void setMarks(Set<Integer> marks) {
        this.marks = marks;
    }

    public Map<String, Integer> getMarksheet() {
        return marksheet;
    }

    public void setMarksheet(Map<String, Integer> marksheet) {
        this.marksheet = marksheet;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empName='" + empName + '\'' +
                ", empSubject=" + empSubject +
                ", marks=" + marks +
                ", marksheet=" + marksheet +
                '}';
    }
}
