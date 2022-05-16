public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else {
            if (this.price > 1000) {
                System.out.println("This notebook is expensive.");
            } else{
                    System.out.println("The price is good");
                }
            }
        }

        public void checkWeight() {
            if (this.weight < 700) {
                System.out.println("This notebook is light as a feather .");
            } else {
                if (this.weight > 1999) {
                    System.out.println("This notebook is heavy stuff.");
                } else {
                    System.out.println("The notebook is not too heavy ");
                }

            }
        }
            public void checkYear() {
                if (this.year < 1999) {
                    System.out.println("Notebook was made before Matrix - let it go");
                } else {
                    if (this.price < 1400) {
                        System.out.println("Notebook was made after Matrix and You can afford it");
                    }else {
                    System.out.println("Notebook was made after Matrix and You need more cash");
                }

                }

            }
        }


