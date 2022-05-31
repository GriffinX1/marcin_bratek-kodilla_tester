public class User {
    String name;
    int age;
    int average;


    public User(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        User starlord = new User("Star-Lord", 42);
        User gamora = new User("Gamora", 43);
        User drax = new User("Drax", 53);
        User groot = new User("Groot", 54);
        User rocket = new User("Rocket", 47);
        User nebula = new User("Nebula", 34);


        User[] users = {starlord, gamora, drax, groot, rocket, nebula};

        int result = 0;
        for (int i = 0; i < users.length; i++) {
            result = result + users[i].age;
        }
    }
}


