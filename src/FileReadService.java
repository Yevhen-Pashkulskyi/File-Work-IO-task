import java.io.FileInputStream;
import java.io.IOException;

public class FileReadService {
    public String readFromFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try (FileInputStream fileInput = new FileInputStream(fileName)) {
            int character;
            while ((character = fileInput.read()) != -1) {
                content.append((char) character);
            }
        } catch (IOException e) {
            System.out.println("Під час читання з файлу сталася помилка: " + e.getMessage());
        }
        return content.toString();
    }
}
