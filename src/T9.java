import java.util.LinkedList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class T9 {
    Node root;

    public T9() {
        this.root = new Node();
    }

    public void T9AddEveryWord() {
        String file = "src\\kelly.txt";
        BufferedReader reader;
        try {
            reader = new BufferedReader((new InputStreamReader(new FileInputStream(file), "UTF-8")));
            String line = reader.readLine();

            while (line != null) {
                root.addString(line);
                line = reader.readLine();
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addString(String toAdd) {
        root.addString(toAdd);
    }

    public List<String> returnValidString(int desiredLength) {
        List<String> list = new LinkedList<String>();

        list = root.returnValidString(list, "", 3, 0);
        return list;
    }

    public List<String> returnValidStringForInput(String code) {
        List<String> list = new LinkedList<String>();

        list = root.returnValidStringSpecificValue(list, code, "", code.length(), 0);
        return list;
    }
}
