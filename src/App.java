import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        t9ActualTest();
        // T9NumberTest();
        // T9Test();
        // test();
    }

    public static void test() {
        String toAdd = "lol";
        while (toAdd.length() > 0) {
            System.out.println(toAdd);
            String nextString = toAdd.substring(1);
            toAdd = nextString;
        }

    }

    public static void t9ActualTest() {

        T9 t9 = new T9();
        t9.T9AddEveryWord();
        String testString = "uniform";

        List list = t9.returnValidStringForInput(StringToCode(testString));
        for (Object object : list) {
            System.out.println("Valid " + object);
        }
    }

    public static String StringToCode(String string)
    {

        char testStringChar[] = string.toCharArray();
        String testCode = "";
        for (char c : testStringChar) {

            testCode += charToCode(c);
        }
        return testCode;
    }

    public static void T9NumberTest() {
        T9 t9 = new T9();
        t9.addString("lol".toLowerCase());
        t9.addString("aaa".toLowerCase());
        t9.addString("vov".toLowerCase());
        t9.addString("noo".toLowerCase());
        t9.addString("mom".toLowerCase());
        t9.addString("cat".toLowerCase());

        List list = t9.returnValidStringForInput("343");
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

    private static int charToCode(char w) {
        switch (w) {
            case 'a':
                return 0;
            case 'b':
                return 0;
            case 'c':
                return 0;
            case 'd':
                return 1;
            case 'e':
                return 1;
            case 'f':
                return 1;
            case 'g':
                return 2;
            case 'h':
                return 2;
            case 'i':
                return 2;
            case 'j':
                return 3;
            case 'k':
                return 3;
            case 'l':
                return 3;
            case 'm':
                return 4;
            case 'n':
                return 4;
            case 'o':
                return 4;
            case 'p':
                return 5;
            case 'r':
                return 5;
            case 's':
                return 5;
            case 't':
                return 6;
            case 'u':
                return 6;
            case 'v':
                return 6;
            case 'x':
                return 7;
            case 'y':
                return 7;
            case 'z':
                return 7;
            case 'å':
                return 8;
            case 'ä':
                return 8;
            case 'ö':
                return 8;
        }
        return -1;
    }
}
