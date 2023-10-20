import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        t9ActualTest();
        // T9NumberTest();
        // T9Test();
        //test();
        t9SpecificTest("hej");
    }

    public static void test() {
        String toAdd = "lol";
        while (toAdd.length() > 0) {
            System.out.println(toAdd);
            System.out.println(toAdd.length());
            String nextString = toAdd.substring(1);
            
            toAdd = nextString;
        }

    }

    public static void t9SpecificTest(String string) {
        System.out.println(string + " = " + StringToCode("hej"));

        T9 t9 = new T9();
        t9.T9AddEveryWord();
        List validList = t9.returnValidStringForInput(StringToCode(string));
        for (Object object : validList) {
            System.out.println("\t Valid " + object);
        }
    }

    public static void t9ActualTest() {

        T9 t9 = new T9();
        t9.T9AddEveryWord();
        String file = "src\\kelly.txt";
        List<String> list1 = new LinkedList<String>();
        BufferedReader reader;
        try {
            reader = new BufferedReader((new InputStreamReader(new FileInputStream(file), "UTF-8")));
            String line = reader.readLine();

            while (line != null) {
                list1.add(line);
                line = reader.readLine();
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String string : list1) {

            List validList = t9.returnValidStringForInput(StringToCode(string));
            if (validList.contains(string) == false) {
                System.out.println("Missing String " + string);
            }
            /*System.out.println(string);
            for (Object object : validList) {
                System.out.println("\t Valid " + object);
            }*/
        }
    }

    public static String StringToCode(String string) {

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
