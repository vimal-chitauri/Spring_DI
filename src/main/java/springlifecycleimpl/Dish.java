package springlifecycleimpl;

public class Dish {
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

    public void init(){
        System.out.println("init method called");
    }

    public void destroy(){
        System.out.println("destroy mehtod called");
    }
}
