import java.util.LinkedList;
import java.util.List;

public class T9 {
    Node root;

    public T9() {
        this.root = new Node();
    }

    public void T9AddEveryWord()
    {

    }

    public void addString(String toAdd) {

        root.addString(toAdd);

    }
    

    public List<String> returnValidString(int desiredLength) {
        List<String> list = new LinkedList<String>();

        list= root.returnValidString(list, "",3,0);
        return list;
    }

    public List<String> returnValidStringForInput(String code)
    {
        List<String> list = new LinkedList<String>();

        list= root.returnValidStringSpecificValue(list,code, "",code.length(),0);
        return list;
    }
}
