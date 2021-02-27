package phone;

public class PhoneClass extends PhoneParent implements SomeInterface {

    private String model;
    private int number;
    private int weight;


    public PhoneClass(String model, int number, int weight) {
        this(model, number);
        this.weight = weight;
    }

    public PhoneClass(String model, int number) {
        this.model = model;
        this.number = number;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, int number) {
        System.out.println("Звонит " + name + "(" + number + ")");
    }

    @Override
    void parentMethod() {
        System.out.println("java class override method");
    }

    @Override
    public String someInterfaceMethod() {
        return "fas";
    }
}

