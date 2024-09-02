package v1_0_1.controller;

import v1_0_1.service.create.FileCreateService;
import v1_0_1.utils.Constants;
import v1_0_1.utils.InputData;

import java.io.File;

public class AppController {
    FileCreateService fileCreateService;
    InputData inputData;

    public void run() {
        fileCreateService = new FileCreateService();
        inputData = new InputData();
//        fileCreateService.createFile("file");
        Path root = new File(Constants.PATH_SAVE_FILE)
    }
}
