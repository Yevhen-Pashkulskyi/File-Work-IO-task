package v1_0_1.view;

public class ShowMenu {
    public String showMenu() {
        System.out.println("Select a task!\n");
        return "1) Create package.\n" +
                "2) Create a file with the extension \"txt\".\n" +
                "3) Write to a file.\n" +
                "4) Read from a file.\n" +
                "0) Close program.";
    }
}
