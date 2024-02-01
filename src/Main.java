import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Виберіть дію:");
        System.out.println("1. Створення та запис у файл");
        System.out.println("2. Читати з файлу");
        System.out.print("Введіть свій вибір: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Введіть назву файлу (без розширення): ");
                String fileName = FilesUrl.FILE_URL + scanner.next() + ".txt";
                scanner.nextLine();
                System.out.print("Введіть вміст: ");
                String content = scanner.nextLine();

                FileWriteService fileWriteService = new FileWriteService();
                fileWriteService.writeToFile(fileName, content);
                break;
            case 2:
                System.out.print("Введіть назву файлу (без розширення): ");
                fileName = FilesUrl.FILE_URL + scanner.next() + ".txt";

                FileReadService fileReadService = new FileReadService();
                String fileData = fileReadService.readFromFile(fileName);
                System.out.println("Вміст файлу '" + fileName + "':");
                System.out.println(fileData);
                break;
            default:
                System.out.println("Невірний вибір!");
        }

        scanner.close();
    }
}
