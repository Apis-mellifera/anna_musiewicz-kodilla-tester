public class Notebook {
    int weight;
    int price;
    int year;
    String weight2;

// to jest konstruktor

    public Notebook(int weight, int price, int year, String weight2) {
        this.weight = weight;
        this.price = price;
        this.year = year;
        this.weight2 = weight2;

    }

    //tu tworzymy metodę instrukcję warunkową

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap");
        } else if (this.price > 600 && this.price < 1000) {
            System.out.println("The price is good");
        } else {
            System.out.println("This notebook is expensive");
        }
    }

//metoda, ktra zwraca wartość weight, ale wyswietli ją gdy ja zapiszemy do zmiennej
    public String getWeight() {
        return this.weight2;
    }

    public void checkWeight() {
        if (this.weight < 650) {
            System.out.println("This notebook is light");
        } else if (this.weight > 650 && this.weight < 1250) {
            System.out.println("This notebook is not so heavy");
        } else {
            System.out.println("This notebook is very heavy");
        }
    }

    public void checkYearAndPrice() {
        if (this.year < 2011) {
            System.out.println("This notebook is very old");
        } else if ((this.year > 2011) && (this.price > 1000)) {
            System.out.println("This notebook is new and expensive");
        } else if ((this.year > 2011) && (this.price < 1000)) {
            System.out.println("This notebook is new and chip");
        } else {
            System.out.println("This notebook is new");
        }
    }




}
