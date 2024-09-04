package v1_0_1.service.write;

import v1_0_1.utils.Constants;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteService {
    public String writeFile(String fileName, String content) {
        try (FileOutputStream fOut = new FileOutputStream(Constants.PATH_SAVE_FILE + fileName)) {
            byte[] contentBytes = content.getBytes();
            fOut.write(contentBytes);
        }catch (IOException e) {
           return e.getMessage();
        }
        return "Success";
    }
}
