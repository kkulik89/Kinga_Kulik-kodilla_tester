public class FirstClass {
    public static void main(String[] args) {


        Notebook notebook = new Notebook(600, 1000, 2005);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.worthBuying();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2003);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.worthBuying();

        Notebook oldNotebook = new Notebook(1600, 500, 2008);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.worthBuying();
    }
}
