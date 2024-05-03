import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your 4 favorite colors? ");
        String[] colors = new String[4];

        for (int i = 0; i < colors.length; i++) {  // כדי לקלוט ולשמור מהמשתמש את איברי המערך
            colors[i] = scanner.next();

        }

        for (int i = 0; i < colors.length; i++) {  // כדי להדפיס את כל איברי המערך
            System.out.println(colors[i]);
        }




    }
}