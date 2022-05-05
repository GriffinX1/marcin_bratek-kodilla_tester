public class LapYear {
    public static void main (String[] args) {
        boolean rokPrzestepny = true;
        boolean rokZwykly = false;
        int rok = 1998;
        if ((rok % 4 == 0 && rok % 100 != 0) || rok % 400 == 0) {
            System.out.println(rokPrzestepny);
        } else {
            System.out.println(rokZwykly);
        }
    }
}
