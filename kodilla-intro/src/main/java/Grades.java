public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public void lastGrade() {
        System.out.println(this.grades[this.size]);
    }

    public int[] getGrades() {
        return grades;
    }

    public void suma() {
        int suma = 0;
        for (int i = 0; i < this.size; i++) {
            suma += this.grades[i];

        }
        System.out.println(suma);
        System.out.println("Średnia: "+ suma/size);

    }

}





