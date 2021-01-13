public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year){
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice(){
        if (this.price<600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price<=1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }
    public void checkWeight() {
        if (this.weight<650) {
            System.out.println("This device is light.");
        } else if (this.weight<1500) {
            System.out.println("This device is not very heavy.");
        } else {
            System.out.println("This device is heavy.");
        }
    }
    public void compareYearAndPrice() {
        if (this.price<1000 && this.year<2015) {
            System.out.println("This is good price for such old notebook.");
        } else if (this.price>1000 && this.year<2015) {
            System.out.println("This notebook is to old for such price.");
        } else if (this.price<=1000 && this.year>=2015) {
            System.out.println("That's real occasion!!! Buy it.");
        } else {
            System.out.println("That's the regular price.");
        }
    }
}
