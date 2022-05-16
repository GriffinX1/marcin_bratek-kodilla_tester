public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 1000, 2020);
        System.out.println(notebook.weight + " g " + notebook.price + " USD");
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2010);
        System.out.println(heavyNotebook.weight + " g " + heavyNotebook.price + " USD");
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYear();

        Notebook oldNotebook = new Notebook(1600, 500,1996);
        System.out.println(oldNotebook.weight + " g " + oldNotebook.price + " USD");
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYear();

    }
}