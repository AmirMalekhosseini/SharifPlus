import java.util.*;

abstract class Store {


    static Scanner scanner = new Scanner(System.in);

    static ArrayList<Order> allOrders = new ArrayList<>();


    public static void getMenu(){
        System.out.print("This is what we have:\n\n");
        Food food = new Food();
        Drinks drinks = new Drinks();
        Dessert dessert = new Dessert();
        Appetizer appetizer = new Appetizer();
    }

    public static void addOrder(){

    }

    public static void showAllOrders(Order order, int a) {
        ArrayList<String> list = null;
        if (allOrders.size() == 0) {
            System.out.println("order history is null :( ");
            System.out.println();
            System.out.println("Press enter to continue");
            scanner.nextLine();
            Project.goingToCafe();
        } else {
            list = new ArrayList<>();
            System.out.print(a + "- ");
            for (int i = 0; i < order.orderList.size(); i++) {

                if (order.orderList.get(i).type == 1 && order.orderList.get(i).finalType == 1)
                    list.add("Pizza");

                else if (order.orderList.get(i).type == 1 && order.orderList.get(i).finalType == 2)
                    list.add("Burger");

                else if (order.orderList.get(i).type == 1 && order.orderList.get(i).finalType == 3)
                    list.add("Steak");

                else if (order.orderList.get(i).type == 1 && order.orderList.get(i).finalType == 4)
                    list.add("Chicken");

                else if (order.orderList.get(i).type == 2 && order.orderList.get(i).finalType == 1)
                    list.add("Coffee");

                else if (order.orderList.get(i).type == 2 && order.orderList.get(i).finalType == 2)
                    list.add("Tea");

                else if (order.orderList.get(i).type == 2 && order.orderList.get(i).finalType == 3)
                    list.add("HotChocolate");

                else if (order.orderList.get(i).type == 2 && order.orderList.get(i).finalType == 4)
                    list.add("Water");

                else if (order.orderList.get(i).type == 2 && order.orderList.get(i).finalType == 5)
                    list.add("Soda");

                else if (order.orderList.get(i).type == 3 && order.orderList.get(i).finalType == 1)
                    list.add("ChocolateCake");

                else if (order.orderList.get(i).type == 3 && order.orderList.get(i).finalType == 2)
                    list.add("VanillaCake");

                else if (order.orderList.get(i).type == 3 && order.orderList.get(i).finalType == 3)
                    list.add("IceCream");

                else if (order.orderList.get(i).type == 4 && order.orderList.get(i).finalType == 1)
                    list.add("Salad");

                else if (order.orderList.get(i).type == 4 && order.orderList.get(i).finalType == 2)
                    list.add("French Fries");
            }
        }
        System.out.print(list);
        System.out.print("\tid: " + order.id);
        if (order.cancelOrNot) {
            System.out.println("\t (Canceled)");
        }
        System.out.println();
    }

    public static void showOrderHistory(User user) {
        ArrayList<String> list = null;
        int j;
        if (user.orderHistory.size() == 0) {
            System.out.println("Your order history is null :( ");
            System.out.println();
            System.out.println("Press enter to continue");
            scanner.nextLine();
            Project.goingToCafe();
            return;
        } else {
            for (j = 0; j < user.orderHistory.size(); j++) {
                System.out.print(j + 1);
                System.out.print("- ");
                list = new ArrayList<>();
                for (int i = 0; i < user.orderHistory.get(j).orderList.size(); i++) {

                    if (user.orderHistory.get(j).orderList.get(i).type == 1 && user.orderHistory.get(j).orderList.get(i).finalType == 1)
                        list.add("Pizza");

                    else if (user.orderHistory.get(j).orderList.get(i).type == 1 && user.orderHistory.get(j).orderList.get(i).finalType == 2)
                        list.add("Burger");

                    else if (user.orderHistory.get(j).orderList.get(i).type == 1 && user.orderHistory.get(j).orderList.get(i).finalType == 3)
                        list.add("Steak");

                    else if (user.orderHistory.get(j).orderList.get(i).type == 1 && user.orderHistory.get(j).orderList.get(i).finalType == 4)
                        list.add("Chicken");

                    else if (user.orderHistory.get(j).orderList.get(i).type == 2 && user.orderHistory.get(j).orderList.get(i).finalType == 1)
                        list.add("Coffee");

                    else if (user.orderHistory.get(j).orderList.get(i).type == 2 && user.orderHistory.get(j).orderList.get(i).finalType == 2)
                        list.add("Tea");

                    else if (user.orderHistory.get(j).orderList.get(i).type == 2 && user.orderHistory.get(j).orderList.get(i).finalType == 3)
                        list.add("HotChocolate");

                    else if (user.orderHistory.get(j).orderList.get(i).type == 2 && user.orderHistory.get(j).orderList.get(i).finalType == 4)
                        list.add("Water");

                    else if (user.orderHistory.get(j).orderList.get(i).type == 2 && user.orderHistory.get(j).orderList.get(i).finalType == 5)
                        list.add("Soda");

                    else if (user.orderHistory.get(j).orderList.get(i).type == 3 && user.orderHistory.get(j).orderList.get(i).finalType == 1)
                        list.add("ChocolateCake");

                    else if (user.orderHistory.get(j).orderList.get(i).type == 3 && user.orderHistory.get(j).orderList.get(i).finalType == 2)
                        list.add("VanillaCake");

                    else if (user.orderHistory.get(j).orderList.get(i).type == 3 && user.orderHistory.get(j).orderList.get(i).finalType == 3)
                        list.add("IceCream");

                    else if (user.orderHistory.get(j).orderList.get(i).type == 4 && user.orderHistory.get(j).orderList.get(i).finalType == 1)
                        list.add("Salad");

                    else if (user.orderHistory.get(j).orderList.get(i).type == 4 && user.orderHistory.get(j).orderList.get(i).finalType == 2)
                        list.add("French Fries");

                }
                System.out.print(list);
                if (user.orderHistory.get(j).cancelOrNot)
                    System.out.println("\t (canceled)");
            }
        }

        System.out.println();
        System.out.println("Press enter to continue");
        scanner.nextLine();
        System.out.println();
        System.out.println(".______________________________________________.");
        System.out.println();
        Project.goingToCafe();
    }

    public static void showOrder(Order order) {
        ArrayList<String> list;
        if (order.orderList.size() == 0) {
            System.out.println("Your order is null :( ");
            System.out.println();
            System.out.println("Press enter to continue");
            scanner.nextLine();
            Project.goingToCafe();
            return;
        } else {
            list = new ArrayList<>();
            for (int i = 0; i < order.orderList.size(); i++) {

                if (order.orderList.get(i).type == 1 && order.orderList.get(i).finalType == 1)
                    list.add("Pizza");

                else if (order.orderList.get(i).type == 1 && order.orderList.get(i).finalType == 2)
                    list.add("Burger");

                else if (order.orderList.get(i).type == 1 && order.orderList.get(i).finalType == 3)
                    list.add("Steak");

                else if (order.orderList.get(i).type == 1 && order.orderList.get(i).finalType == 4)
                    list.add("Chicken");

                else if (order.orderList.get(i).type == 2 && order.orderList.get(i).finalType == 1)
                    list.add("Coffee");

                else if (order.orderList.get(i).type == 2 && order.orderList.get(i).finalType == 2)
                    list.add("Tea");

                else if (order.orderList.get(i).type == 2 && order.orderList.get(i).finalType == 3)
                    list.add("HotChocolate");

                else if (order.orderList.get(i).type == 2 && order.orderList.get(i).finalType == 4)
                    list.add("Water");

                else if (order.orderList.get(i).type == 2 && order.orderList.get(i).finalType == 5)
                    list.add("Soda");

                else if (order.orderList.get(i).type == 3 && order.orderList.get(i).finalType == 1)
                    list.add("ChocolateCake");

                else if (order.orderList.get(i).type == 3 && order.orderList.get(i).finalType == 2)
                    list.add("VanillaCake");

                else if (order.orderList.get(i).type == 3 && order.orderList.get(i).finalType == 3)
                    list.add("IceCream");

                else if (order.orderList.get(i).type == 4 && order.orderList.get(i).finalType == 1)
                    list.add("Salad");

                else if (order.orderList.get(i).type == 4 && order.orderList.get(i).finalType == 2)
                    list.add("French Fries");

            }
        }
        System.out.println(list);
        System.out.println();
        System.out.println("Press enter to continue");
        System.out.println();
        scanner.nextLine();
        System.out.println(".______________________________________________.");
        System.out.println();
        Project.goingToCafe();
    }

    public static String showOrderString(ArrayList<Product> orderList) {
        for (int i = 0; i <orderList.size(); i++) {

            if (orderList.get(i).type == 1 && orderList.get(i).finalType == 1)
                return "Pizza,";

            else if (orderList.get(i).type == 1 && orderList.get(i).finalType == 2)
                return "Burger,";

            else if (orderList.get(i).type == 1 && orderList.get(i).finalType == 3)
                return "Steak,";

            else if (orderList.get(i).type == 1 && orderList.get(i).finalType == 4)
                return "Chicken,";

            else if (orderList.get(i).type == 2 && orderList.get(i).finalType == 1)
                return "Coffee,";

            else if (orderList.get(i).type == 2 && orderList.get(i).finalType == 2)
                return "Tea,";

            else if (orderList.get(i).type == 2 && orderList.get(i).finalType == 3)
                return "HotChocolate,";

            else if (orderList.get(i).type == 2 && orderList.get(i).finalType == 4)
                return "Water,";

            else if (orderList.get(i).type == 2 && orderList.get(i).finalType == 5)
                return "Soda,";

            else if (orderList.get(i).type == 3 && orderList.get(i).finalType == 1)
                return "ChocolateCake,";

            else if (orderList.get(i).type == 3 && orderList.get(i).finalType == 2)
                return "VanillaCake,";

            else if (orderList.get(i).type == 3 && orderList.get(i).finalType == 3)
                return "IceCream,";

            else if (orderList.get(i).type == 4 && orderList.get(i).finalType == 1)
                return "Salad,";

            else if (orderList.get(i).type == 4 && orderList.get(i).finalType == 2)
                return "FrenchFries,";

        }

        return ")";
    }
}

class Restaurant extends Store{


    public static void getMenu(){
        Food food = new Food();
        System.out.println("""
                Drinks:
                
                Cold: 
                
                 a-Water 1$    b-Soda 2$
                 
                """);
        Appetizer appetizer = new Appetizer();
    }

    public static void addOrder(){

        System.out.println(".______________________________________________.");
        Restaurant.getMenu();
        Order newOrder = new Order();

        for (int i = 0; i < 1000000000; i++) {

            System.out.println();
            System.out.println("Please tell me what you want to order:");
            String order = scanner.nextLine();
            System.out.println();
            System.out.println(".______________________________________________.");
            System.out.println();
            order = order.toLowerCase().replaceAll(" ", "");


            if (order.contains("ingredientwater")) {
                Product.ingredient("water");
                System.out.println();
                System.out.println("press enter to continue");
                scanner.nextLine();
                addOrder();
                return;
            } else if (order.contains("water")) {
                Drinks.addWater(newOrder);
            }

            if (order.contains("ingredientsoda")) {
                Product.ingredient("soda");
                System.out.println();
                System.out.println("press enter to continue");
                scanner.nextLine();
                addOrder();
                return;
            } else if (order.contains("soda")) {
                Drinks.addSoda(newOrder);
            }

            if (order.contains("ingredientsalad")) {
                Product.ingredient("salad");
                System.out.println();
                System.out.println("press enter to continue");
                scanner.nextLine();
                addOrder();
                return;
            } else if (order.contains("salad")) {
                Appetizer.addSalad(newOrder);
            }

            if (order.contains("ingredientfrenchfries")) {
                Product.ingredient("frenchfries");
                System.out.println();
                System.out.println("press enter to continue");
                scanner.nextLine();
                addOrder();
                return;
            } else if (order.contains("frenchfries")) {
                Appetizer.addFrenchFries(newOrder);
            }

            if (order.contains("ingredientpizza")) {
                System.out.println();
                Product.ingredient("pizza");
                System.out.println();
                System.out.println("press enter to continue");
                scanner.nextLine();
                addOrder();
                return;
            } else if (order.contains("pizza")) {
                Food.addPizza(newOrder);
            }

            if (order.contains("ingredientburger")) {
                Product.ingredient("burger");
                System.out.println();
                System.out.println("press enter to continue");
                scanner.nextLine();
                addOrder();
                return;
            } else if (order.contains("burger")) {
                Food.addBurger(newOrder);
            }

            if (order.contains("ingredientsteak")) {
                Product.ingredient("steak");
                System.out.println();
                System.out.println("press enter to continue");
                scanner.nextLine();
                addOrder();
                return;
            } else if (order.contains("steak")) {
                Food.addSteak(newOrder);
            }

            if (order.contains("ingredientchicken")) {
                Product.ingredient("chicken");
                System.out.println();
                System.out.println("press enter to continue");
                scanner.nextLine();
                addOrder();
                return;
            } else if (order.contains("chicken")) {
                Food.addChicken(newOrder);
            } else if (order.contains("cancel")) {
                System.out.println();
                Storage.backToStorage(newOrder);
                newOrder.cancelOrNot = true;
                System.out.println("Your order has been canceled");
                System.out.println();
                System.out.println(".______________________________________________.");
                Project.goingToCafe();
                return;
            } else if (order.equalsIgnoreCase("showbalance")) {
                User.showBalance();
                Project.goingToCafe();
            } else if (order.equalsIgnoreCase("addbalance")) {
                User.addBalance();
                Project.goingToCafe();
            } else if (order.equalsIgnoreCase("game")) {
                Project.insideCafe();
                return;
            } else if (order.contains("back")) {
                System.out.println(".______________________________________________.");
                System.out.println();
                Project.goingToCafe();
                return;
            } else if (order.contains("home")) {
                User.signOut();
                Project.initialize();
                return;
            } else if (order.contains("help")) {
                System.out.println();
                Project.initialize();
                return;
            } else if (order.contains("signout")) {
                User.signOut();
            } else if (order.contains("showorderhistory")) {
                showOrderHistory(User.signedInUser.get(0));
                return;
            } else if (order.contains("showorder")) {
                showOrder(newOrder);
                return;
            } else if (order.contains("exit")) {
                System.out.println();
                System.out.println("Hava a good time");
                System.out.println(".______________________________________________.");
                System.out.println();
                WriteToFile.exit(User.signedInUser.get(0).getUserName());
                System.exit(0);
            }
            for (int j = 0; j < 1000000000; j++) {

            System.out.println("Done!" +
                    "\n" +
                    "anything else?");
            String anyThingElse = scanner.nextLine();
            anyThingElse = anyThingElse.toLowerCase().replaceAll(" ", "");

                if (anyThingElse.contains("no")) {

                    int price = 0;
                    for (int b = 0; b < newOrder.orderList.size(); b++) {
                        price = price + newOrder.orderList.get(b).price;
                    }
                    User.signedInUser.get(0).order.price = price;
                    if (User.signedInUser.get(0).getBalance() >= newOrder.price) {
                        System.out.println();
                        System.out.println("it will be ready as soon as possible");
                        newOrder.id = java.time.LocalTime.now();
                        User.signedInUser.get(0).orderHistory.add(newOrder);
                        long balance = User.signedInUser.get(0).getBalance();
                        User.signedInUser.get(0).setBalance(balance - price);
                        Store.allOrders.add(newOrder);
                        WriteToFile.order(User.signedInUser.get(0).getUserName(), newOrder);
                        System.out.println();
                        System.out.println(".______________________________________________.");
                        return;
                    } else {
                        System.out.println();
                        System.out.println("You don't have enough credit ");
                        System.out.println("Price of product is: " + newOrder.price);
                        System.out.println("Your balance is: " + User.signedInUser.get(0).getBalance());
                        System.out.println();
                        Storage.backToStorage(newOrder);
                        newOrder.price = 0;
                        System.out.println("Do you want to charge your account? (yes/no)");
                        String charge = scanner.next();
                        scanner.nextLine();
                        if (charge.equalsIgnoreCase("yes")) {
                            User.addBalance();
                        } else {
                            Project.goingToCafe();
                            return;
                        }
                    }
                } else if (anyThingElse.equalsIgnoreCase("game")) {
                    Project.insideCafe();
                    return;
                } else if (anyThingElse.contains("cancel")) {
                    System.out.println();
                    Storage.backToStorage(newOrder);
                    newOrder.cancelOrNot = true;
                    System.out.println("Your order has been canceled");
                    WriteToFile.cancelOrder(User.signedInUser.get(0).getUserName(), newOrder);
                    System.out.println();
                    System.out.println(".______________________________________________.");
                    Project.goingToCafe();
                    return;
                } else if (anyThingElse.contains("yes")) {
                    addOrder();
                    return;
                } else if (anyThingElse.contains("showorderhistory")) {
                    showOrderHistory(User.signedInUser.get(0));

                } else if (anyThingElse.contains("showorder")) {
                    showOrder(newOrder);

                } else if (anyThingElse.equalsIgnoreCase("showbalance")) {
                    User.showBalance();

                } else if (anyThingElse.equalsIgnoreCase("addbalance")) {
                    User.addBalance();

                } else if (anyThingElse.contains("back")) {
                    System.out.println(".______________________________________________.");
                    System.out.println();
                    Project.goingToCafe();
                    return;
                } else if (anyThingElse.contains("home")) {
                    User.signOut();
                    Project.initialize();
                    return;
                } else if (anyThingElse.contains("exit")) {
                    System.out.println();
                    System.out.println("Hava a good time");
                    System.out.println(".______________________________________________.");
                    System.out.println();
                    WriteToFile.exit(User.signedInUser.get(0).getUserName());
                    System.exit(0);
                } else if (anyThingElse.contains("help")) {
                    System.out.println();
                    Project.goingToCafe();
                    return;
                } else if (anyThingElse.contains("signout")) {
                    User.signOut();
                } else {
                    System.out.println();
                    System.out.println(".______________________________________________.");
                    System.out.println();
                }
            }
        }

    }

}

class Cafe extends Store{

    public static void getMenu(){
        Drinks drinks = new Drinks();
        Dessert dessert = new Dessert();
        Appetizer appetizer = new Appetizer();
    }

    public static void addOrder() {
        System.out.println(".______________________________________________.");
        Cafe.getMenu();
        Order newOrder = new Order();

        for (int i = 0; i < 1000000000; i++) {

            System.out.println();
            System.out.println("Please tell me what you want to order:");
            String order = scanner.nextLine();
            System.out.println(".______________________________________________.");
            System.out.println();
            order = order.toLowerCase().replaceAll(" ", "");

            if (order.contains("ingredientcoffee")) {
                Product.ingredient("coffee");
                System.out.println();
                System.out.println("press enter to continue");
                scanner.nextLine();
                addOrder();
                return;
            } else if (order.contains("coffee")) {
                Drinks.addCoffee(newOrder);
            }

            if (order.contains("ingredienttea")) {
                Product.ingredient("tea");
                System.out.println();
                System.out.println("press enter to continue");
                scanner.nextLine();
                addOrder();
                return;
            } else if (order.contains("tea")) {
                Drinks.addTea(newOrder);
            }

            if (order.contains("ingredienthotchocolate")) {
                Product.ingredient("hotchocolate");
                System.out.println();
                System.out.println("press enter to continue");
                scanner.nextLine();
                addOrder();
                return;
            } else if (order.contains("hotchocolate")) {
                Drinks.addHotChocolate(newOrder);
            }

            if (order.contains("ingredientwater")) {
                Product.ingredient("water");
                System.out.println();
                System.out.println("press enter to continue");
                scanner.nextLine();
                addOrder();
                return;
            } else if (order.contains("water")) {
                Drinks.addWater(newOrder);
            }

            if (order.contains("ingredientsoda")) {
                Product.ingredient("soda");
                System.out.println();
                System.out.println("press enter to continue");
                scanner.nextLine();
                addOrder();
                return;
            } else if (order.contains("soda")) {
                Drinks.addSoda(newOrder);
            }

            if (order.contains("ingredientchocolatecake")) {
                Product.ingredient("chocolatecake");
                System.out.println();
                System.out.println("press enter to continue");
                scanner.nextLine();
                addOrder();
                return;
            } else if (order.contains("chocolatecake")) {
                Dessert.addChocolateCake(newOrder);
            }

            if (order.contains("ingredientvanillacake")) {
                Product.ingredient("vanillacake");
                System.out.println();
                System.out.println("press enter to continue");
                scanner.nextLine();
                addOrder();
                return;
            } else if (order.contains("vanillacake")) {
                Dessert.addVanillaCake(newOrder);
            }

            if (order.contains("ingredienticecream")) {
                Product.ingredient("icecream");
                System.out.println();
                System.out.println("press enter to continue");
                scanner.nextLine();
                addOrder();
                return;
            } else if (order.contains("icecream")) {
                Dessert.addIcecream(newOrder);
            }

            if (order.contains("ingredientsalad")) {
                Product.ingredient("salad");
                System.out.println();
                System.out.println("press enter to continue");
                scanner.nextLine();
                addOrder();
                return;
            } else if (order.contains("salad")) {
                Appetizer.addSalad(newOrder);
            }

            if (order.contains("ingredientfrenchfries")) {
                Product.ingredient("frenchfries");
                System.out.println();
                System.out.println("press enter to continue");
                scanner.nextLine();
                addOrder();
                return;
            } else if (order.contains("frenchfries")) {
                Appetizer.addFrenchFries(newOrder);
            } else if (order.contains("cancelorder")) {
                System.out.println();
                Storage.backToStorage(newOrder);
                newOrder.cancelOrNot = true;
                System.out.println("Your order has been canceled");
                WriteToFile.cancelOrder(User.signedInUser.get(0).getUserName(), newOrder);
                System.out.println();
                System.out.println(".______________________________________________.");
                Project.goingToCafe();
                return;
            } else if (order.equalsIgnoreCase("showbalance")) {
                User.showBalance();
                Project.goingToCafe();
                return;
            } else if (order.equalsIgnoreCase("addbalance")) {
                User.addBalance();
                Project.goingToCafe();
                return;
            } else if (order.equalsIgnoreCase("game")) {
                Project.insideCafe();
                return;
            } else if (order.contains("back")) {
                System.out.println(".______________________________________________.");
                System.out.println();
                Project.goingToCafe();
                return;
            } else if (order.contains("home")) {
                User.signOut();
                Project.initialize();
                return;
            } else if (order.contains("help")) {
                System.out.println();
                Project.goingToCafe();
                return;
            } else if (order.contains("showorderhistory")) {
                showOrderHistory(User.signedInUser.get(0));
                return;
            } else if (order.contains("showorder")) {
                showOrder(newOrder);
                return;
            } else if (order.contains("signout")) {
                User.signOut();
            } else if (order.contains("exit")) {
                System.out.println();
                System.out.println("Hava a good time");
                System.out.println(".______________________________________________.");
                System.out.println();
                WriteToFile.exit(User.signedInUser.get(0).getUserName());
                System.exit(0);
            }

            for (int j = 0; j < 1000000000; j++) {
            System.out.println("Done!" +
                    "\n" +
                    "anything else?");
            String anyThingElse = scanner.nextLine();
            anyThingElse = anyThingElse.toLowerCase().replaceAll(" ", "");


                if (anyThingElse.contains("no")) {

                    int price = 0;
                    for (int b = 0; b < newOrder.orderList.size(); b++) {
                        price = price + newOrder.orderList.get(b).price;
                    }
                    newOrder.price = price;
                    if (User.signedInUser.get(0).getBalance() >= newOrder.price) {
                        System.out.println();
                        System.out.println("it will be ready as soon as possible");
                        long balance = User.signedInUser.get(0).getBalance();
                        User.signedInUser.get(0).setBalance(balance - price);
                        newOrder.id = java.time.LocalTime.now();
                        User.signedInUser.get(0).orderHistory.add(newOrder);
                        Store.allOrders.add(newOrder);
                        WriteToFile.order(User.signedInUser.get(0).getUserName(), newOrder);
                        System.out.println();
                        System.out.println(".______________________________________________.");
                        return;
                    } else {
                        System.out.println();
                        System.out.println("You don't have enough credit ");
                        System.out.println("Price of product is: " + newOrder.price);
                        System.out.println("Your balance is: " + User.signedInUser.get(0).getBalance());
                        System.out.println();
                        newOrder.price = 0;
                        Storage.backToStorage(newOrder);
                        System.out.println("Do you want to charge your account? (yes/no)");
                        String charge = scanner.next();
                        scanner.nextLine();
                        if (charge.equalsIgnoreCase("yes")) {
                            User.addBalance();
                        } else {
                            Project.goingToCafe();
                            return;
                        }
                    }

                } else if (anyThingElse.contains("yes")) {
                    addOrder();
                    return;
                } else if (anyThingElse.equalsIgnoreCase("game")) {
                    Project.insideCafe();
                    return;
                } else if (anyThingElse.contains("cancel")) {
                    System.out.println();
                    Storage.backToStorage(newOrder);
                    newOrder.cancelOrNot = true;
                    System.out.println("Your order has been canceled");
                    System.out.println();
                    System.out.println(".______________________________________________.");
                    Project.goingToCafe();
                    return;
                } else if (anyThingElse.contains("back")) {
                    System.out.println(".______________________________________________.");
                    System.out.println();
                    Project.goingToCafe();
                    return;
                } else if (anyThingElse.contains("home")) {
                    User.signOut();
                    Project.initialize();
                    return;
                } else if (anyThingElse.equalsIgnoreCase("showbalance")) {
                    User.showBalance();
                    continue;

                } else if (anyThingElse.equalsIgnoreCase("addbalance")) {
                    User.addBalance();

                } else if (anyThingElse.contains("showorderhistory")) {
                    showOrderHistory(User.signedInUser.get(0));

                } else if (anyThingElse.contains("showorder")) {
                    showOrder(newOrder);

                } else if (anyThingElse.contains("exit")) {
                    System.out.println();
                    System.out.println("Hava a good time");
                    System.out.println(".______________________________________________.");
                    System.out.println();
                    WriteToFile.exit(User.signedInUser.get(0).getUserName());
                    System.exit(0);
                } else if (anyThingElse.contains("signout")) {
                    User.signOut();
                    return;
                } else if (anyThingElse.contains("help")) {
                    System.out.println();
                    Project.help();
                } else {
                    System.out.println();
                    System.out.println(".______________________________________________.");
                    System.out.println();
                }
            }
        }
    }
}
