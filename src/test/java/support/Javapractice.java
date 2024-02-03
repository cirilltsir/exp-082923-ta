
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Javapractice {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<String>();
        stringList.add("New list member");
        stringList.add("Anothe list member");
        stringList.add("Portnov");

        for (var item : stringList) {
            System.out.println(item);
        }

        String[] strArray = {"1", "2", "3", "4"};

        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
    }
}
