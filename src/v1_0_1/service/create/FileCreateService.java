package v1_0_1.service.create;

import v1_0_1.utils.Constants;

import java.io.File;
import java.io.IOException;

public class FileCreateService {

    public boolean createFolder(String folderName) {
      return new File(Constants.PATH_CREATE_FILE + folderName).mkdir();
    }

    public boolean createFile(String fileName) throws IOException {
        return new File(Constants.PATH_SAVE_FILE + fileName + ".txt").createNewFile();
    }
}
