package v1_0_1.controller;

import v1_0_1.service.create.FileCreateService;
import v1_0_1.utils.InputData;
import v1_0_1.view.ShowMenu;

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
                if (fileCreateService.createFile(inputData.input())) {
                    System.out.println("Created file successfully.");
                } else {
                    System.out.println("Failed to create file.");
                }
                run();
                break;
        }

    }
}
