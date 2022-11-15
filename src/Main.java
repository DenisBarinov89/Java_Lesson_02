import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();
        strings.add("Привет");
        strings.add("меня");
        strings.add("зовут");
        strings.add("массив");

        //поиск и удаление
        strings.remove("массив");

        for (String str : strings) {
            System.out.println(str);
        }



        LinkedList<String> linkedStrings = new LinkedList<>();
        linkedStrings.add("Привет");
        linkedStrings.add("меня");
        linkedStrings.add("зовут");
        linkedStrings.add("массив");

        //поиск и удаление
        linkedStrings.remove("массив");

        for (String str : linkedStrings) {
            System.out.println(str);
        }


    }

}
