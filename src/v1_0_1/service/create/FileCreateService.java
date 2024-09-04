package v1_0_1.service.create;

import v1_0_1.utils.Constants;

import java.io.File;

public class FileCreateService {
    public void createFile(String fileName) {
        new File(Constants.PATH_CREATE_FILE + fileName).mkdir();
    }
}
