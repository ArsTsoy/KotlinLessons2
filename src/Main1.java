public class Main1 {

    public static void main(String[] args) {
       String s = "Temirlan";
       if(s.equals("Temirlan")) {
           System.out.println("true");
       } else {
           System.out.println("not equal");
       }

       switch (s) {
           case "d": {
               System.out.println("fasf");
               break;
           }
       }



    }

    private static int method2() {
        int a = 1;
        int result = 0;

        if(a == 1) {
            result = 2;
        } else if(a == 2) {
            result = 3;
        } else {
            result = 4;
        }
        return result;
    }

    public static boolean method() {
        return true;
    }
}
