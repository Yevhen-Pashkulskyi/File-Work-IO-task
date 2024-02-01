import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteService {
    public void writeToFile(String fileName, String fileData) {
        try (FileOutputStream fileOutput = new FileOutputStream(fileName)) {
            fileOutput.write(fileData.getBytes());
            System.out.println("Файл '" + fileName + "' було успішно створено та записано.");
        } catch (IOException e) {
            System.out.println("Під час запису у файл сталася помилка: " + e.getMessage());
        }
    }
}
