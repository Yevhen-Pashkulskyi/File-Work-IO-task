package v1_0_1.service.read;

import v1_0_1.utils.Constants;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReadService {
    public String readFile(String fileName) {
        try (BufferedReader reader =
                     new BufferedReader(new InputStreamReader(
                             new FileInputStream(Constants.PATH_SAVE_FILE + fileName)))) {
            String textMsg;
            StringBuilder stringBuilder = new StringBuilder();
            while ((textMsg = reader.readLine()) != null) {
                stringBuilder.append(textMsg).append("\n");
            }
            return stringBuilder.toString();
        } catch (IOException e) {
            return e.getMessage();
        }
    }
}
