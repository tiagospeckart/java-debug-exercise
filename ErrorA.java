import java.util.ArrayList;
import java.util.List;

public class ErrorA {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Mike");

        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            System.out.println("Name: " + name);
        }
    }
}
