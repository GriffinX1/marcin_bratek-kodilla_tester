public class SimpleArray {
    public static void main(String[] args) {
       String[] acdc = new String[5];
        acdc[0] = "Stiff upper lip";
        acdc[1] = "Ballbreaker";
        acdc[2] = "Dirty Deeds";
        acdc[3] = "Back in Black";
        acdc[4] = "Who Made Who";
System.out.println(acdc[2]);
int numberOfElements = acdc.length;
String odpowiedz = "Liczba elementów mojej tablicy to: "+ numberOfElements;
System.out.println(odpowiedz);

    }
}
