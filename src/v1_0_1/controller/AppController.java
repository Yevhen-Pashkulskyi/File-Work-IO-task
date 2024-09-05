package v1_0_1.controller;

import v1_0_1.service.create.FileCreateService;
import v1_0_1.service.read.FileReadService;
import v1_0_1.service.write.FileWriteService;
import v1_0_1.utils.Constants;
import v1_0_1.utils.InputData;
import v1_0_1.utils.OutputData;
import v1_0_1.view.ShowMenu;

import java.io.IOException;

public class AppController {
    FileCreateService fileCreateService;
    InputData inputData;

    public void run() {
        fileCreateService = new FileCreateService();
        new ShowMenu().showMenu();
        inputData = new InputData();
        int choice;
        try {
            choice = choiceMenu(Integer.parseInt(inputData.input()));
        }
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
                    } else {
                        System.out.println("File already exists.\n");
                    }
                } catch (IOException e) {
                    System.out.print(e.getMessage());
                }
                run();
                break;
            case 3:
                FileWriteService fileWriteService = new FileWriteService();
                System.out.println("Input name file: ");
                String fileName = inputData.input() + ".txt";
                System.out.println("Input content file: ");
                new OutputData().outputData(
                        fileWriteService.writeFile(fileName, inputData.input()));
                run();
                break;
            case 4:
                FileReadService fileReadService = new FileReadService();
                System.out.println("Input name file: ");
                new OutputData().outputData(
                        fileReadService.readFile(inputData.input() + ".txt"));
                run();
            case 0:
                break;
        }

    }
}
