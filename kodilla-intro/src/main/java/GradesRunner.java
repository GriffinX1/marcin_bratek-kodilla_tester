import java.util.Arrays;

public class GradesRunner {
    public static void main(String[] args) {
        Grades g = new Grades();
        int[] grades = g.getGrades();
        g.add(4);
        g.add(5);
        g.add(2);
        g.add(4);
        g.add(5);
        g.add(5);
        g.add(6);
        g.add(6);
        g.add(4);
        g.lastGrade();

        System.out.println(Arrays.toString(grades));
        g.suma();
    }
}
