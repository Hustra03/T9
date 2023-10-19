import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        T9Test();
    }

    public static void T9Test()
    {
        T9 t9 = new T9();
        t9.addString("lol");
        List list = t9.returnValidString();
        for (Object object : list) {
            System.out.println("Valid " + object);
        }
    }
}
