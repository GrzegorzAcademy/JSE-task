
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;


public class Main {
    public static void main(String[] args) {
var namesfunction = getTable("ala","kasia");
        for (int i = 0; i < namesfunction.length; i++) {
            System.out.println(namesfunction[i]);
        }
    }

    public static String[] getTable(String... names) {
        String[] namesList= new String[names.length];
        for (int i = 0; i < namesList.length; i++) {
            namesList[i]=names[i];
        }
return namesList;
    }
}

