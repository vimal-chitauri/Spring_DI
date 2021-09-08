package constructorinjection;

public class Person {
    private String personName;
    private int personId;
    private Animal personType;

    public Person(String personName, int personId, Animal personType) {
        this.personName = personName;
        this.personId = personId;
        this.personType = personType;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personName='" + personName + '\'' +
                ", personId=" + personId +
                ", animal=" + personType +
                '}';
    }
}
