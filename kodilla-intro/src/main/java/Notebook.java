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
        } else if (this.price > 600 && this.price < 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }

    }

    public void checkWeight() {
        if (this.weight < 700) {
            System.out.println("This notebook is light.");
        } else if (this.weight > 700 && this.weight < 1900) {
            System.out.println("This notebook is not too heavy");
        } else {
            System.out.println("This notebook is very heavy");
        }
    }
    public void worthBuying() {
        if (this.price > 1000 && this.year < 2004) {
            System.out.println("This notebook is not worth to buy.");
        } else if (this.price < 1000 && this.year > 2005) {
            System.out.println("This notebook is worth to buy");
        } else {
            System.out.println("Think about buying it");
        }
    }

}