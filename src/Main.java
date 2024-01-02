import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file name (without extension):");
        String fileName = scanner.nextLine();
        System.out.println("Action selection:");
        System.out.println("1. Create file / write file");
        System.out.println("2. Read file");
        int selected = scanner.nextInt();
        scanner.nextLine(); // consume newline left-over
        switch (selected) {
            case 1:
                System.out.println("enter your text:");
                String text = scanner.nextLine();
                FileWriteService.getWriteFile(fileName, text);
                System.out.println("file created and saved : + fileName");
                break;
            case 2:
                FileReadeService.fileRead(fileName);
                break;
            default:
                System.out.println("Wrong choice");
                break;
        }
        scanner.close();
    }

}
