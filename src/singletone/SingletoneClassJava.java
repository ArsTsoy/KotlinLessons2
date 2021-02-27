package singletone;

public class SingletoneClassJava {
    
    private static SingletoneClassJava INSTANCE;
    
    private String name;
    private int age;
    
    private SingletoneClassJava(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public static SingletoneClassJava getInstance(String name, int age) {
        if(INSTANCE == null) {
            INSTANCE = new SingletoneClassJava(name, age);
        }
        return INSTANCE;
    }
    
    
}
