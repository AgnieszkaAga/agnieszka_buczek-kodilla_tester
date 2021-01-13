public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2020);
        System.out.println("weight: "+notebook.weight+"g"+" - price: "+notebook.price+"zł"+" "+notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.compareYearAndPrice();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2018);
        System.out.println("weight: "+heavyNotebook.weight+"g"+" - price: "+heavyNotebook.price+"zł"+" "+heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.compareYearAndPrice();

        Notebook oldNotebook = new Notebook(1200, 500, 2014);
        System.out.println("weight: "+oldNotebook.weight+"g"+" - price: "+oldNotebook.price+"zł"+" "+oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.compareYearAndPrice();

        Notebook specialNotebook = new Notebook(1500, 1600, 2012);
        System.out.println("weight: "+specialNotebook.weight+"g"+" - price: "+specialNotebook.price+"zł"+" "+specialNotebook.year);
        specialNotebook.checkPrice();
        specialNotebook.checkWeight();
        specialNotebook.compareYearAndPrice();

    }
}
