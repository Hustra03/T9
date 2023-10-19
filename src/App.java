import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        T9NumberTest();
        //T9Test();
        //test();
    }

    public static void test() {
        String toAdd = "lol";
        while (toAdd.length() > 0) {
            System.out.println(toAdd);
            String nextString = toAdd.substring(1);
            char currentLetter = toAdd.charAt(0);
            toAdd=nextString;
        }

    }

    public static void T9NumberTest() {
        T9 t9 = new T9();
        t9.addString("lol".toLowerCase());
        t9.addString("aaa".toLowerCase());
        t9.addString("vov".toLowerCase());
        t9.addString("noo".toLowerCase());
        t9.addString("mom".toLowerCase());
        t9.addString("cat".toLowerCase());
        
        List list = t9.returnValidStringForInput("000");
        for (Object object : list) {
            System.out.println("Valid " + object);
        }
    }

    public static void T9Test() {
        T9 t9 = new T9();
        t9.addString("lol".toLowerCase());
        t9.addString("vov".toLowerCase());
        t9.addString("noo".toLowerCase());
        t9.addString("mom".toLowerCase());
        t9.addString("cat".toLowerCase());
        List list = t9.returnValidString(3);
        for (Object object : list) {
            System.out.println("Valid " + object);
        }
    }
}
