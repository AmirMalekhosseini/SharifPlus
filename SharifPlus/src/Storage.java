import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Storage {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static ArrayList<Integer> storage = new ArrayList<>();


    public Storage(){

        for (int i = 0; i <=16 ; i++) {

            int rand ;
            do {
                rand = random.nextInt(11);
            } while (rand == 0);
            storage.add(i, rand);
        }
         /*
    Flour=0, Cheese=1, Meat=2, Bread=3, Vegetable=4, Chicken=5,
     Potato=6, Coffee=7, Beans=8, Tea=9, Chocolate=10, Soda=11,
      Icecream=12, Egg=13, Vanilla=14,water=15 , Sugar=16
     */
    }

    public static void addAll(int number){
        for (int i = 0; i <storage.size() ; i++) {
            storage.set(i, storage.get(i) + number);
        }
        WriteToFile.addAll(number);
    }

    public static void minusAll(int number){
        for (int i = 0; i < storage.size(); i++) {
            if (storage.get(i) < number) {
                storage.set(i, 0);
            }
            else{
                storage.set(i, storage.get(i) - number);
            }
        }
        WriteToFile.minusAll(number);
    }

    public static void addFlour(){
        System.out.print("enter number of flour you want to add:");
        int number = scanner.nextInt();
        scanner.nextLine();
        int a = storage.get(0);
        storage.set(0, a + number);
        System.out.println();
        System.out.println("Done ;)");
        System.out.println();
        WriteToFile.addFlour(number);
    }

    public static void addCheese(){
        System.out.print("enter number of cheese you want to add:");
        int number = scanner.nextInt();
        scanner.nextLine();
        int a = storage.get(1);
        storage.set(1, a + number);
        System.out.println();
        System.out.println("Done ;)");
        System.out.println();
        WriteToFile.addCheese(number);
    }

    public static void addMeat(){
        System.out.print("enter number of meat you want to add:");
        int number = scanner.nextInt();
        scanner.nextLine();
        int a = storage.get(2);
        storage.set(2, a + number);
        System.out.println();
        System.out.println("Done ;)");
        System.out.println();
        WriteToFile.addMeat(number);
    }

    public static void addBread(){
        System.out.print("enter number of bread you want to add:");
        int number = scanner.nextInt();
        scanner.nextLine();
        int a = storage.get(3);
        storage.set(3, a + number);
        System.out.println();
        System.out.println("Done ;)");
        System.out.println();
        WriteToFile.addBread(number);
    }

    public static void addVegetable(){
        System.out.print("enter number of vegetable you want to add:");
        int number = scanner.nextInt();
        scanner.nextLine();
        int a = storage.get(4);
        storage.set(4, a + number);
        System.out.println();
        System.out.println("Done ;)");
        System.out.println();
        WriteToFile.addVegetable(number);
    }

    public static void addChicken(){
        System.out.print("enter number of chicken you want to add:");
        int number = scanner.nextInt();
        scanner.nextLine();
        int a = storage.get(5);
        storage.set(5, a + number);
        System.out.println();
        System.out.println("Done ;)");
        System.out.println();
        WriteToFile.addChicken(number);
    }

    public static void addPotato(){
        System.out.print("enter number of potato you want to add:");
        int number = scanner.nextInt();
        scanner.nextLine();
        int a = storage.get(6);
        storage.set(6, a + number);
        System.out.println();
        System.out.println("Done ;)");
        System.out.println();
        WriteToFile.addPotato(number);
    }

    public static void addCoffee(){
        System.out.print("enter number of coffee you want to add:");
        int number = scanner.nextInt();
        scanner.nextLine();
        int a = storage.get(7);
        storage.set(7, a + number);
        System.out.println();
        System.out.println("Done ;)");
        System.out.println();
        WriteToFile.addCoffee(number);
    }

    public static void addBeans(){
        System.out.print("enter number of bean you want to add:");
        int number = scanner.nextInt();
        scanner.nextLine();
        int a = storage.get(8);
        storage.set(8, a + number);
        System.out.println();
        System.out.println("Done ;)");
        System.out.println();
        WriteToFile.addBeans(number);
    }

    public static void addTea(){
        System.out.print("enter number of tea you want to add:");
        int number = scanner.nextInt();
        scanner.nextLine();
        int a = storage.get(9);
        storage.set(9, a + number);
        System.out.println();
        System.out.println("Done ;)");
        System.out.println();
        WriteToFile.addTea(number);
    }

    public static void addChocolate(){
        System.out.print("enter number of chocolate you want to add:");
        int number = scanner.nextInt();
        scanner.nextLine();
        int a = storage.get(10);
        storage.set(10, a + number);
        System.out.println();
        System.out.println("Done ;)");
        System.out.println();
        WriteToFile.addChocolate(number);
    }

    public static void addSoda(){
        System.out.print("enter number of soda you want to add:");
        int number = scanner.nextInt();
        scanner.nextLine();
        int a = storage.get(11);
        storage.set(11, a + number);
        System.out.println();
        System.out.println("Done ;)");
        System.out.println();
        WriteToFile.addSoda(number);
    }

    public static void addIceCream(){
        System.out.print("enter number of icecream you want to add:");
        int number = scanner.nextInt();
        scanner.nextLine();
        int a = storage.get(12);
        storage.set(12, a + number);
        System.out.println();
        System.out.println("Done ;)");
        System.out.println();
        WriteToFile.addIceCream(number);
    }

    public static void addEgg(){
        System.out.print("enter number of egg you want to add:");
        int number = scanner.nextInt();
        scanner.nextLine();
        int a = storage.get(13);
        storage.set(13, a + number);
        System.out.println();
        System.out.println("Done ;)");
        System.out.println();
        WriteToFile.addEgg(number);
    }

    public static void addVanilla(){
        System.out.print("enter number of vanilla you want to add:");
        int number = scanner.nextInt();
        scanner.nextLine();
        int a = storage.get(14);
        storage.set(14, a + number);
        System.out.println();
        System.out.println("Done ;)");
        System.out.println();
        WriteToFile.addVanilla(number);
    }

    public static void addWater(){
        System.out.print("enter number of water you want to add:");
        int number = scanner.nextInt();
        scanner.nextLine();
        int a = storage.get(15);
        storage.set(15, a + number);
        System.out.println();
        System.out.println("Done ;)");
        System.out.println();
        WriteToFile.addWater(number);
    }

    public static void addSugar(){
        System.out.print("enter number of sugar you want to add:");
        int number = scanner.nextInt();
        scanner.nextLine();
        int a = storage.get(16);
        System.out.println();
        storage.set(16, a + number);
        System.out.println();
        WriteToFile.addSugar(number);
    }


    public static void minusFlour(){
        System.out.print("enter number of flour you want to decrease:");
        int number = scanner.nextInt();
        scanner.nextLine();
        int a = storage.get(0);
        storage.set(0, a - number);
        System.out.println();
        System.out.println("Done ;)");
        System.out.println();
        WriteToFile.minusFlour(number);
    }

    public static void minusCheese(){
        System.out.print("enter number of cheese you want to decrease:");
        int number = scanner.nextInt();
        scanner.nextLine();
        int a = storage.get(1);
        storage.set(1, a - number);
        System.out.println();
        System.out.println("Done ;)");
        System.out.println();
        WriteToFile.minusCheese(number);
    }

    public static void minusMeat(){
        System.out.print("enter number of meat you want to decrease:");
        int number = scanner.nextInt();
        scanner.nextLine();
        int a = storage.get(2);
        storage.set(2, a - number);
        System.out.println();
        System.out.println("Done ;)");
        System.out.println();
        WriteToFile.minusMeat(number);
    }

    public static void minusBread(){
        System.out.print("enter number of bread you want to decrease:");
        int number = scanner.nextInt();
        scanner.nextLine();
        int a = storage.get(3);
        storage.set(3, a - number);
        System.out.println();
        System.out.println("Done ;)");
        System.out.println();
        WriteToFile.minusBread(number);
    }

    public static void minusVegetable(){
        System.out.print("enter number of vegetable you want to decrease:");
        int number = scanner.nextInt();
        scanner.nextLine();
        int a = storage.get(4);
        storage.set(4, a - number);
        System.out.println();
        System.out.println("Done ;)");
        System.out.println();
        WriteToFile.minusVegetable(number);
    }

    public static void minusChicken(){
        System.out.print("enter number of chicken you want to decrease:");
        int number = scanner.nextInt();
        scanner.nextLine();
        int a = storage.get(5);
        storage.set(5, a - number);
        System.out.println();
        System.out.println("Done ;)");
        System.out.println();
        WriteToFile.minusChicken(number);
    }

    public static void minusPotato(){
        System.out.print("enter number of potato you want to decrease:");
        int number = scanner.nextInt();
        scanner.nextLine();
        int a = storage.get(6);
        storage.set(6, a - number);
        System.out.println();
        System.out.println("Done ;)");
        System.out.println();
        WriteToFile.minusPotato(number);
    }

    public static void minusCoffee(){
        System.out.print("enter number of coffee you want to decrease:");
        int number = scanner.nextInt();
        scanner.nextLine();
        int a = storage.get(7);
        storage.set(7, a - number);
        System.out.println();
        System.out.println("Done ;)");
        System.out.println();
        WriteToFile.minusCoffee(number);
    }

    public static void minusBeans(){
        System.out.print("enter number of bean you want to decrease:");
        int number = scanner.nextInt();
        scanner.nextLine();
        int a = storage.get(8);
        storage.set(8, a - number);
        System.out.println();
        System.out.println("Done ;)");
        System.out.println();
        WriteToFile.minusBeans(number);
    }

    public static void minusTea(){
        System.out.print("enter number of tea you want to decrease:");
        int number = scanner.nextInt();
        scanner.nextLine();
        int a = storage.get(9);
        storage.set(9, a - number);
        System.out.println();
        System.out.println("Done ;)");
        System.out.println();
        WriteToFile.minusTea(number);
    }

    public static void minuschocolate(){
        System.out.print("enter number of chocolate you want to decrease:");
        int number = scanner.nextInt();
        scanner.nextLine();
        int a = storage.get(10);
        storage.set(10, a - number);
        System.out.println();
        System.out.println("Done ;)");
        System.out.println();
        WriteToFile.minusChocolate(number);
    }

    public static void minusSoda(){
        System.out.print("enter number of soda you want to decrease:");
        int number = scanner.nextInt();
        scanner.nextLine();
        int a = storage.get(11);
        storage.set(11, a - number);
        System.out.println();
        System.out.println("Done ;)");
        System.out.println();
        WriteToFile.minusSoda(number);
    }

    public static void minusIceCream(){
        System.out.print("enter number of icecream you want to decrease:");
        int number = scanner.nextInt();
        scanner.nextLine();
        int a = storage.get(12);
        storage.set(12, a - number);
        System.out.println();
        System.out.println("Done ;)");
        System.out.println();
        WriteToFile.minusIceCream(number);
    }

    public static void minusEgg(){
        System.out.print("enter number of egg you want to decrease:");
        int number = scanner.nextInt();
        scanner.nextLine();
        int a = storage.get(13);
        storage.set(13, a - number);
        System.out.println();
        System.out.println("Done ;)");
        System.out.println();
        WriteToFile.minusEgg(number);
    }

    public static void minusVanilla(){
        System.out.print("enter number of vanilla you want to decrease:");
        int number = scanner.nextInt();
        scanner.nextLine();
        int a = storage.get(14);
        storage.set(14, a - number);
        System.out.println();
        System.out.println("Done ;)");
        System.out.println();
        WriteToFile.minusVanilla(number);
    }

    public static void minusWater(){
        System.out.print("enter number of water you want to decrease:");
        int number = scanner.nextInt();
        scanner.nextLine();
        int a = storage.get(15);
        storage.set(15, a - number);
        System.out.println();
        System.out.println("Done ;)");
        System.out.println();
        WriteToFile.minusWater(number);
    }

    public static void minusSugar(){
        System.out.print("enter number of sugar you want to decrease:");
        int number = scanner.nextInt();
        scanner.nextLine();
        int a = storage.get(16);
        System.out.println();
        storage.set(16, a - number);
        System.out.println();
        WriteToFile.minusSugar(number);
    }

    public static void checkStorage() {
        System.out.println("Flour:" + storage.get(0) + "x" + "\n" +
                "Cheese:" + storage.get(1) + "x" + "\n" +
                "Meat:" + storage.get(2) + "x" + "\n" +
                "Bread:" + storage.get(3) + "x" + "\n" +
                "Vegetable:" + storage.get(4) + "x" + "\n" +
                "Chicken:" + storage.get(5) + "x" + "\n" +
                "Potato:" + storage.get(6) + "x" + "\n" +
                "Coffee:" + storage.get(7) + "x" + "\n" +
                "Beans:" + storage.get(8) + "x" + "\n" +
                "Tea:" + storage.get(9) + "x" + "\n" +
                "Chocolate:" + storage.get(10) + "x" + "\n" +
                "Soda:" + storage.get(11) + "x" + "\n" +
                "IceCream:" + storage.get(12) + "x" + "\n" +
                "Egg:" + storage.get(13) + "x" + "\n" +
                "Vanilla:" + storage.get(14) + "x" + "\n" +
                "Water:" + storage.get(15) + "x" + "\n" +
                "Sugar:" + storage.get(16) + "x" + "\n");
        System.out.println();
        System.out.println("press enter to continue");
        scanner.nextLine();
        System.out.println(".______________________________________________.");
        System.out.println();
    }

    public static void backToStorage(Order order){
        for (int i = 0; i < order.orderList.size(); i++) {

            if (order.orderList.get(i).type == 1 && order.orderList.get(i).finalType == 1){
                Storage.storage.set(1, Storage.storage.get(1) + 1);
                Storage.storage.set(2, Storage.storage.get(2) + 1);
                Storage.storage.set(3, Storage.storage.get(3) + 1);
                Storage.storage.set(4, Storage.storage.get(4) + 1);
            }

            else if (order.orderList.get(i).type == 1 && order.orderList.get(i).finalType == 2){
                Storage.storage.set(2, Storage.storage.get(2) + 1);
                Storage.storage.set(3, Storage.storage.get(3) + 2);
            }

            else if (order.orderList.get(i).type == 1 && order.orderList.get(i).finalType == 3){
                Storage.storage.set(2, Storage.storage.get(2) + 3);
                Storage.storage.set(4, Storage.storage.get(4) + 2);
                Storage.storage.set(6, Storage.storage.get(6) + 1);
            }

            else if (order.orderList.get(i).type == 1 && order.orderList.get(i).finalType == 4){
                Storage.storage.set(3, Storage.storage.get(3) + 2);
                Storage.storage.set(5, Storage.storage.get(5) + 3);
                Storage.storage.set(13, Storage.storage.get(13) + 2);
            }

            else if (order.orderList.get(i).type == 2 && order.orderList.get(i).finalType == 1){
                Storage.storage.set(7, Storage.storage.get(7) + 1);
            }

            else if (order.orderList.get(i).type == 2 && order.orderList.get(i).finalType == 2){
                Storage.storage.set(9, Storage.storage.get(9) + 1);
            }

            else if (order.orderList.get(i).type == 2 && order.orderList.get(i).finalType == 3){
                Storage.storage.set(7, Storage.storage.get(7) + 1);
                Storage.storage.set(10, Storage.storage.get(10) + 1);
            }

            else if (order.orderList.get(i).type == 2 && order.orderList.get(i).finalType == 4){
                Storage.storage.set(15, Storage.storage.get(15) + 1);
            }

            else if (order.orderList.get(i).type == 2 && order.orderList.get(i).finalType == 5){
                Storage.storage.set(11, Storage.storage.get(11) + 1);
            }

            else if (order.orderList.get(i).type == 3 && order.orderList.get(i).finalType == 1){
                Storage.storage.set(0, Storage.storage.get(0) + 1);
                Storage.storage.set(10, Storage.storage.get(10) + 3);
                Storage.storage.set(13, Storage.storage.get(13) + 3);
            }

            else if (order.orderList.get(i).type == 3 && order.orderList.get(i).finalType == 2){
                Storage.storage.set(0, Storage.storage.get(0) + 1);
                Storage.storage.set(13, Storage.storage.get(13) + 3);
                Storage.storage.set(14, Storage.storage.get(14) + 3);
            }

            else if (order.orderList.get(i).type == 3 && order.orderList.get(i).finalType == 3){
                Storage.storage.set(12, Storage.storage.get(12) + 3);
            }

            else if (order.orderList.get(i).type == 4 && order.orderList.get(i).finalType == 1){
                Storage.storage.set(4, Storage.storage.get(4) + 4);
            }

            else if (order.orderList.get(i).type == 4 && order.orderList.get(i).finalType == 2){
                Storage.storage.set(6, Storage.storage.get(6) + 3);
            }

        }
    }
}
