
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;


public class Main {
    public static void main(String[] args) {
        String pathOfResources = "src/resources/plik.txt";
        String value = "default value";
        Path path = Path.of(pathOfResources);
        try {
            Files.writeString(path, value, StandardOpenOption.CREATE);
        } catch (IOException e) {
            System.out.println("wystapił błąd podczas zapisywania pliku");
        }
        try {
            String content = Files.readString(path);
            System.out.println(content);
        } catch (IOException e) {
            System.err.println("pład odczytu pliku ");
        }
    }
}

