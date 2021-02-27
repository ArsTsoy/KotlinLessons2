package classes;

public class CarJava {

    private String model;//Nullable
    private int age;//Nullable
    private int power;//Nullable

    public CarJava(String model, int age, int power) {
        this.model = model;
        this.age = age;
        this.power = power;
    }

    public CarJava(String model, int age) {
        this.model = model;
        this.age = age;
    }

    public CarJava(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAge() {
        return age;
    }


    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
