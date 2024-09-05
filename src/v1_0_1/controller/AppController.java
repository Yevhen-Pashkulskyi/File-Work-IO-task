package v1_0_1.controller;

import v1_0_1.service.create.FileCreateService;
import v1_0_1.utils.Constants;
import v1_0_1.utils.InputData;
import v1_0_1.view.ShowMenu;

import java.io.IOException;

public class AppController {
    FileCreateService fileCreateService;
    InputData inputData;

    public void run() {
        fileCreateService = new FileCreateService();
        new ShowMenu().showMenu();
        inputData = new InputData();
        choiceMenu(Integer.parseInt(inputData.input()));
    }

    private void choiceMenu(int choice) {
        switch (choice) {
            case 1:
                System.out.print("Input name package: ");
                if (fileCreateService.createFolder(inputData.input())) {
                    System.out.println("Created file successfully.");
                } else {
                    System.out.println("Failed to create file.");
                }
                run();
                break;
            case 2:
                try {
                    System.out.println("Input name file: ");
                    if (fileCreateService.createFile(inputData.input())) {
                        System.out.println("Created file successfully.");
                    }else {
                        System.out.println("File already exists.\n");
                    }
                } catch (IOException e) {
                    System.out.print(e.getMessage());
                }
                run();
                break;
            case 0:
                break;
        }

    }
}
