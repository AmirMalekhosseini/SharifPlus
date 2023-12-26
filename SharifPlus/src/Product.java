import java.util.*;
 class Product {
    int type;
    int finalType;
    int price;

    public Product(int type, int finalType , int price) {
        this.type = type;
        this.finalType = finalType;
        this.price = price;
    }

    public static void ingredient(String product){
        if(product.equalsIgnoreCase("pizza"))
            System.out.println("1x meat  1x vegetables  1x bread  1x cheese");

        else if(product.equalsIgnoreCase("burger"))
            System.out.println("1x meat  2x bread ");

        else if(product.equalsIgnoreCase("steak"))
            System.out.println("3x meat  2x vegetable  1x potato");

        else if(product.equalsIgnoreCase("chicken"))
            System.out.println("2x bread  3x chicken  2x eggs");

        else if(product.equalsIgnoreCase("coffee"))
            System.out.println("1x coffee");

        else if(product.equalsIgnoreCase("tea"))
            System.out.println("1x tea");

        else if(product.equalsIgnoreCase("hotchocolate"))
            System.out.println("1x coffee  1x chocolate");

        else if(product.equalsIgnoreCase("water"))
            System.out.println("2x H  1x O  ;))");

        else if(product.equalsIgnoreCase("soda"))
            System.out.println("1x soda");

        else if(product.equalsIgnoreCase("chocolatecake"))
            System.out.println("1x flour  3x chocolate  3x eggs");

        else if(product.equalsIgnoreCase("vanillacake"))
            System.out.println("1x flour  3x vanilla   3x eggs");

        else if(product.equalsIgnoreCase("icecream"))
            System.out.println("3x iceCream");

        else if(product.equalsIgnoreCase("salad"))
            System.out.println("4x vegetable");

        else if(product.equalsIgnoreCase("frenchfries"))
            System.out.println("3x potato");
    }
}

  class Food {

    public Food(){
        System.out.println("""
                Food:

                a-Pizza 15$     b-Burger 10$
                
                c-Steak 30$     d-Chicken 10$
                """);
        System.out.println();
        if(!pizzaYes())
            System.out.println("^^Pizza is not available right now");

        if(!burgerYes())
            System.out.println("^^Burger is not available right now");

        if(!steakYes())
            System.out.println("^^Steak is not available right now");

        if(!chickenYes())
            System.out.println("^^Chicken is not available right now");

        System.out.println();
        System.out.println(".______________________________________________.");
        System.out.println();

    }

    public static boolean pizzaYes(){
        return Storage.storage.get(2) >= 1 && Storage.storage.get(3) >= 1 && Storage.storage.get(4) >= 1 && Storage.storage.get(1) >= 1;
    }

    public static void addPizza(Order order){//1x meat  1x vegetables  1x bread 1x cheese
        if(pizzaYes()) {
            Product pizza = new Product(1, 1, 15);
            order.orderList.add(pizza);
            Storage.storage.set(1, Storage.storage.get(1) - 1);
            Storage.storage.set(2, Storage.storage.get(2) - 1);
            Storage.storage.set(3, Storage.storage.get(3) - 1);
            Storage.storage.set(4, Storage.storage.get(4) - 1);
        }

        else{
            System.out.println("""
                    Sorry!
                    Pizza is not available right now
                    """);
        }
    }

    public static boolean burgerYes(){
        return Storage.storage.get(2) >= 1 && Storage.storage.get(3) >= 2;
    }
    public static void addBurger(Order order){//1x meat 2x bread
        if(burgerYes()) {
            Product burger = new Product(1, 2, 10);
            order.orderList.add(burger);
            Storage.storage.set(2, Storage.storage.get(2) - 1);
            Storage.storage.set(3, Storage.storage.get(3) - 2);
        }

        else
            System.out.println("""
                    Sorry!
                    Burger is not available right now
                    """);
    }

    public static boolean steakYes(){
        return Storage.storage.get(2) >= 3 && Storage.storage.get(4) >= 2 && Storage.storage.get(6) >= 1;
    }

    public static void addSteak(Order order){// 3x meat 2x vegetable 1x potato
        if(steakYes()) {
            Product steak = new Product(1, 3, 30);
            order.orderList.add(steak);
            Storage.storage.set(2, Storage.storage.get(2) - 3);
            Storage.storage.set(4, Storage.storage.get(4) - 2);
            Storage.storage.set(6, Storage.storage.get(6) - 1);
        }

        else
            System.out.println("""
                    Sorry!
                    Steak is not available right now
                    """);
    }

    public static boolean chickenYes(){
        return Storage.storage.get(3) >= 2 && Storage.storage.get(5) >= 3 && Storage.storage.get(13) >= 2;
    }

    public static void addChicken(Order order){// 2x bread 3x chicken 2x eggs
        if(chickenYes()) {
            Product chicken = new Product(1, 4, 10);
            order.orderList.add(chicken);
            Storage.storage.set(3, Storage.storage.get(3) - 2);
            Storage.storage.set(5, Storage.storage.get(5) - 3);
            Storage.storage.set(13, Storage.storage.get(13) - 2);
        }

        else
            System.out.println("""
                    Sorry!
                    Chicken is not available right now
                    """);
    }

}

  class Drinks{

    public Drinks(){
        System.out.println("""
                Drinks:

                1.Hot:
                
                 a-Coffee 5$   b-Tea 3$  
                 
                 c-HotChocolate 7$

                2.Cold:
                
                 a-Water 1$    b-Soda 2$
                 """);
        System.out.println();

        if (!coffeeYes())
            System.out.println("^^Coffee is not available right now");

        if(!teaYes())
            System.out.println("^^Tea is not available right now");

        if(!waterYes())
            System.out.println("^^Water is not available right now");

        if(!sodaYes())
            System.out.println("^^Soda is not available right now");

        System.out.println();
        System.out.println(".______________________________________________.");
    }

    public static boolean coffeeYes(){
        return Storage.storage.get(7) >= 1;
    }

    public static void addCoffee(Order order){
        if(coffeeYes()) {
            Product coffee = new Product(2, 1 , 5);
            order.orderList.add(coffee);
            Storage.storage.set(7, Storage.storage.get(7) - 1);
        }

        else
            System.out.println("""
                    Sorry!
                    Coffee is not available right now
                    """);
    }

    public static boolean teaYes(){
        return Storage.storage.get(9) >= 1;
    }

      public static void addTea(Order order){
        if(teaYes()) {
            Product tea = new Product(2, 2, 3);
            order.orderList.add(tea);
            Storage.storage.set(9, Storage.storage.get(9) - 1);
        }

        else
            System.out.println("""
                    Sorry!
                    Tea is not available right now
                    """);
    }

    public static boolean hotChocolateYes(){
        return Storage.storage.get(7) >= 1 && Storage.storage.get(10) >= 1;
    }

    public static void addHotChocolate(Order order){
        if(hotChocolateYes()) {
            Product hotChocolate = new Product(2, 3, 7);
            order.orderList.add(hotChocolate);
            Storage.storage.set(7, Storage.storage.get(7) - 1);
            Storage.storage.set(10, Storage.storage.get(10) - 1);
        }

        else
            System.out.println("""
                    Sorry!
                    HotChocolate is not available right now
                    """);
    }

    public static boolean waterYes(){
        return Storage.storage.get(15) >= 1;
    }

    public static void addWater(Order order){
        if(waterYes()) {
            Product water = new Product(2, 4, 1);
            order.orderList.add(water);
            Storage.storage.set(15, Storage.storage.get(15) - 1);
        }

        else
            System.out.println("""
                    Sorry!
                    Water is not available right now
                    """);
    }

    public static boolean sodaYes(){
        return Storage.storage.get(11) >= 1;
    }

    public static void addSoda(Order order){
        if(sodaYes()) {
            Product soda = new Product(2, 5, 2);
            order.orderList.add(soda);
            Storage.storage.set(11, Storage.storage.get(11) - 1);
        }

        else{
            System.out.println("""
                    Sorry!
                    Soda is not available right now
                    """);
        }
    }

}

  class Dessert{

    public Dessert(){
        System.out.println("""
                Dessert:
                
                a-Chocolate cake 5$    b-Vanilla cake 5$
                
                c-Icecream 4$ """);
        System.out.println();

        if(!chocolateCakeYes())
            System.out.println("^^ChocolateCake is not available right now");

        if(!vanillaCakeYes())
            System.out.println("^^VanillaCake is not available right now");

        if(!iceCreamYes())
            System.out.println("^^IceCream is not available right now");

        System.out.println();
        System.out.println(".______________________________________________.");
    }

    public static boolean chocolateCakeYes(){
        return Storage.storage.get(0) >= 1 && Storage.storage.get(10) >= 3 && Storage.storage.get(13) >= 3;
    }

    public static void addChocolateCake(Order order){// 1x flour 3x chocolate 3x eggs
        if(chocolateCakeYes()) {
            Product chocolateCake = new Product(3, 1, 5);
            order.orderList.add(chocolateCake);
            Storage.storage.set(0, Storage.storage.get(0) - 1);
            Storage.storage.set(10, Storage.storage.get(10) - 3);
            Storage.storage.set(13, Storage.storage.get(13) - 3);
        }

        else{
            System.out.println("""
                    Sorry!
                    ChocolateCake is not available right now
                    """);
        }
    }

    public static boolean vanillaCakeYes(){
        return Storage.storage.get(0) >= 1 && Storage.storage.get(13) >= 3 && Storage.storage.get(14) >= 3;
    }

    public static void addVanillaCake(Order order){// 1x flour 3x vanilla  3x eggs
        if(vanillaCakeYes()) {
            Product vanillaCake = new Product(3, 2, 5);
            order.orderList.add(vanillaCake);
            Storage.storage.set(0, Storage.storage.get(0) - 1);
            Storage.storage.set(13, Storage.storage.get(13) - 3);
            Storage.storage.set(14, Storage.storage.get(14) - 3);
        }

        else{
            System.out.println("""
                    Sorry!
                    VanillaCake is not available right now
                    """);
        }
    }

    public static boolean iceCreamYes(){
        return Storage.storage.get(12) >= 3;
    }

    public static void addIcecream(Order order){// 3x icecream
        if(iceCreamYes()) {
            Product icecream = new Product(3, 3, 4);
            order.orderList.add(icecream);
            Storage.storage.set(12, Storage.storage.get(12) - 3);
        }

        else{
            System.out.println("""
                    Sorry!
                    IceCream is not available right now
                    """);
        }
    }

}
  class Appetizer{

    public Appetizer(){
        System.out.println("""
                Appetizer:
                
                a-Salad 3$    b-French fries 3$
                """);
        System.out.println();

        if(!saladYes())
            System.out.println("^^Salad is not available right now");

        if(!frenchFriesYes())
            System.out.println("^^FrenchFries is not available right now");

        System.out.println();
        System.out.println(".______________________________________________.");
    }

    public static boolean saladYes(){
        return Storage.storage.get(4) >= 4;
    }

    public static void addSalad(Order order){// 4x vegetable
        if(saladYes()) {
            Product salad = new Product(4, 1, 3);
            order.orderList.add(salad);
            Storage.storage.set(4, Storage.storage.get(4) - 4);
        }

        else{
            System.out.println("""
                    Sorry!
                    Salad is not available right now
                    """);
        }
    }

    public static boolean frenchFriesYes(){
        return Storage.storage.get(6) >= 3;
    }

    public static void addFrenchFries(Order order){// 3x potato
        if(frenchFriesYes()) {
            Product frenchFries = new Product(4, 2, 3);
            order.orderList.add(frenchFries);
            Storage.storage.set(6, Storage.storage.get(6) - 3);
        }

        else{
            System.out.println("""
                    Sorry!
                    FrenchFries is not available right now
                    """);
        }
    }
}
