import java.util.Scanner;
public class Switch {
    public static String getColorname() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter color first letter: ");
            String name = scanner.nextLine().trim();
            if (name.length() <= 1) {
                return name;
            }
            System.out.println("Only first letter please. Try again.");
        }
    }

    public static String getColorSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give first letter");
            String calc = scanner.nextLine().trim().toUpperCase();
            switch (calc) {
                case "r": return "red";
                case "g": return "green";
                case "b": return "blue";
                case "y": return "yellow";
                default:
                    System.out.println("I know only few colors. Try different one.");
            }
        }
    }
}
