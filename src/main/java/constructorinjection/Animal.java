package constructorinjection;

public class Animal {
    private String animalType;

    public Animal(String animalType) {
        this.animalType = animalType;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalType='" + animalType + '\'' +
                '}';
    }
}
