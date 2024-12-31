public class Dessert {

    int flavor;
    int price;

    static int numDesserts = 0;

    public static void main(String[] args){
        System.out.println("I love dessert!");
    }
    public Dessert(int flavor, int price){
        this.flavor = flavor;
        this.price = price;
        numDesserts += 1;
        printDessert();
    }

    public void printDessert(){
        System.out.println(this.flavor + " " + this.price + " " + numDesserts);
    }
}
