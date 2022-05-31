public class Application {

    static String name;
    static double age;
    static double height;

    public Application(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }


    public static void main(String[] args) {
        Application adam = new Application("Adam", 40.5, 178);
        if (adam.age > 30 && height > 160) {
            System.out.println("User is older than 30 and taller than 160cm");
        } else {
            System.out.println("User is 30 (or younger) or 160cm (or shorter)");
        }
    }
}

