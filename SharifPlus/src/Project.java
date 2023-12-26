import java.util.Objects;
import java.util.Scanner;
public class Project {

    static Scanner scanner = new Scanner(System.in);
    private static Throwable ex;

    public static void initialize() {

        System.out.println("if you hava an account please login and if you don't,feel free to sign up:)");
        System.out.println("1-Sign in" + "\n" + "2-Sign up");
        System.out.print("enter your number:");
        String signInOrSignUp = scanner.next();
        scanner.nextLine();
        System.out.println(".______________________________________________.");
        System.out.println();

        if (Integer.parseInt(signInOrSignUp) == 1) {
            User.signInUser();
        } else if (Integer.parseInt(signInOrSignUp) == 2) {
            User.addUser();
        } else if (signInOrSignUp.equalsIgnoreCase("exit")) {
            System.out.println();
            System.out.println("Hava a good time");
            System.out.println(".______________________________________________.");
            System.out.println();
            WriteToFile.exit(User.signedInUser.get(0).getUserName());
            System.exit(0);
        } else if (signInOrSignUp.equalsIgnoreCase("help")) {
            help();
        } else if (signInOrSignUp.equalsIgnoreCase("home")) {
            initialize();
            return;
        } else {
            System.out.println("error!!!");
            initialize();
        }

        if(User.signedInUser.get(0).getType().equals("Customer"))
            help();

        else if(User.signedInUser.get(0).getType().equals("Employee"))
            helpEmployee();

        System.out.println();

        for (int i = 0; i < 1000000000; i++) {

            goingToCafe();
            if(User.signedInUser.get(0).getType().equals("Customer")) {
                insideCafe();
                System.out.println();
                System.out.println("ENJOY YOUR MEAL (｡◕‿◕｡)");
                System.out.println();
            }


        }

    }

    public static void goingToCafe() {

        if (User.signedInUser.get(0).getType().equals("Employee")) {
            System.out.println();
            System.out.println("What do you want to do?");
            String whatToDo = scanner.nextLine();
            whatToDo = whatToDo.toLowerCase().replaceAll(" ", "");

            if (whatToDo.contains("addflour"))
                Storage.addFlour();

            if (whatToDo.contains("addcheese"))
                Storage.addCheese();

            if (whatToDo.contains("addmeat"))
                Storage.addMeat();

            if (whatToDo.contains("addbread"))
                Storage.addBread();

            if (whatToDo.contains("addvegetable"))
                Storage.addVegetable();

            if (whatToDo.contains("addchicken"))
                Storage.addChicken();

            if (whatToDo.contains("addpotato"))
                Storage.addPotato();

            if (whatToDo.contains("addcoffee"))
                Storage.addCoffee();

            if (whatToDo.contains("addbean"))
                Storage.addBeans();

            if (whatToDo.contains("addtea"))
                Storage.addTea();

            if (whatToDo.contains("addchocolate"))
                Storage.addChocolate();

            if (whatToDo.contains("addsoda"))
                Storage.addSoda();

            if (whatToDo.contains("addicecream"))
                Storage.addIceCream();

            if (whatToDo.contains("addegg"))
                Storage.addEgg();

            if (whatToDo.contains("addvanilla"))
                Storage.addVanilla();

            if (whatToDo.contains("addwater"))
                Storage.addWater();

            if (whatToDo.contains("addsugar"))
                Storage.addSugar();


            if (whatToDo.contains("minusflour"))
                Storage.minusFlour();

            if (whatToDo.contains("minuscheese"))
                Storage.minusCheese();

            if (whatToDo.contains("minusmeat"))
                Storage.minusMeat();

            if (whatToDo.contains("minusbread"))
                Storage.minusBread();

            if (whatToDo.contains("minusvegetable"))
                Storage.minusVegetable();

            if (whatToDo.contains("minuschicken"))
                Storage.minusChicken();

            if (whatToDo.contains("minuspotato"))
                Storage.minusPotato();

            if (whatToDo.contains("minuscoffee"))
                Storage.minusCoffee();

            if (whatToDo.contains("minusbean"))
                Storage.minusBeans();

            if (whatToDo.contains("minustea"))
                Storage.minusTea();

            if (whatToDo.contains("minuschocolate"))
                Storage.minuschocolate();

            if (whatToDo.contains("minussoda"))
                Storage.minusSoda();

            if (whatToDo.contains("minusicecream"))
                Storage.minusIceCream();

            if (whatToDo.contains("minusegg"))
                Storage.minusEgg();

            if (whatToDo.contains("minusvanilla"))
                Storage.minusVanilla();

            if (whatToDo.contains("minuswater"))
                Storage.minusWater();

            if (whatToDo.contains("minussugar"))
                Storage.minusSugar();

            else if (whatToDo.contains("showorder")) {
                int a = 1;
                for (int i = 0; i < Store.allOrders.size(); i++) {
                    Store.showAllOrders(Store.allOrders.get(i), a);
                    a++;
                }
                System.out.println();
                System.out.println("Press enter to continue");
                System.out.println();
                scanner.nextLine();
                System.out.println(".______________________________________________.");
                System.out.println();
                goingToCafe();
            } else if (whatToDo.contains("cancelorder")) {
                System.out.println();
                System.out.println("Orders ids are:");
                System.out.println();
                for (int i = 0; i < Store.allOrders.size(); i++) {
                    int a = i + 1;
                    System.out.println(a + "- " + Store.allOrders.get(i).id);
                }
                System.out.println(".______________________________________________.");
                System.out.println();
                System.out.println("enter id of the order you want to cancel:");
                String order = scanner.next();
                scanner.nextLine();

                /*
                ابتدا آن اوردر دلخواه را پیدا و از لییست کل اوردر ها پاک میکنیم
                سپس اوردر را از لیست سفارش مشتری ای که آن اوردر را ثبت کرده پاک میکنیم
                بدین صورت که ابتدا بر لیست کل یوزر ها فور میزنیم
                و سپس بر اوردر هیستوری هر کدام از یوزر های پیدا شده در فور بالا یک فور دیگر میزنیم
                و هر بار چک میکنیم که آیا اوردری با آن ایدی وجود دارد یا خیر
                و سپس آن اوردر دلخواه را پیدا میکنیم و از هیستوری و اوردر لیست مشتری حذف میکنیم
                 */

                for (int jy = 0; jy < Store.allOrders.size(); jy++) {
                    if (order.equals(String.valueOf(Store.allOrders.get(jy).id))) {
                        String order1 = String.valueOf(Store.allOrders.get(jy).id);
                        Store.allOrders.get(jy).cancelOrNot = true;
                        System.out.println();
                        for (int i = 0; i < User.userList.size(); i++) {
                            for (int j = 0; j < User.userList.get(i).orderHistory.size(); j++) {
                                if (User.userList.get(i).orderHistory.get(j).id.equals(order1)) {
                                    User.userList.get(i).orderHistory.get(j).cancelOrNot = true;
                                }
                            }
                        }
                        System.out.println("You have canceled the order with id: " + order1);
                        System.out.println();
                        System.out.println(".______________________________________________.");
                        System.out.println();
                        WriteToFile.cancelOrder(User.signedInUser.get(0).getUserName(),Store.allOrders.get(jy));
                        goingToCafe();
                    }
                }
            } else if (whatToDo.contains("addall")) {
                System.out.print("enter number you want to add:");
                int number = scanner.nextInt();
                scanner.nextLine();
                Storage.addAll(number);
                System.out.println();
                System.out.println("Done");
                System.out.println();
                System.out.println(".______________________________________________.");
                System.out.println();
                goingToCafe();
            }
                else if (whatToDo.contains("minusall")) {
                System.out.print("enter number you want to decrease:");
                int number = scanner.nextInt();
                scanner.nextLine();
                Storage.minusAll(number);
                System.out.println();
                System.out.println("Done");
                System.out.println();
                System.out.println(".______________________________________________.");
                System.out.println();
                goingToCafe();
                }
             else if (whatToDo.contains("checkstorage")) {
                Storage.checkStorage();
                System.out.println();
                goingToCafe();
            } else if (whatToDo.contains("showbalance")) {
                User.showBalance();
                goingToCafe();
            } else if (whatToDo.contains("addbalance")) {
                User.addBalance();
                goingToCafe();
            } else if (whatToDo.equalsIgnoreCase("back")) {
                User.signOut();
                System.out.println(".______________________________________________.");
                System.out.println();
                initialize();
            } else if (whatToDo.equalsIgnoreCase("home")) {
                User.signOut();
                System.out.println(".______________________________________________.");
                System.out.println();
                initialize();
            } else if (whatToDo.equalsIgnoreCase("exit")) {
                System.out.println();
                System.out.println("Hava a good time");
                System.out.println(".______________________________________________.");
                System.out.println();
                WriteToFile.exit(User.signedInUser.get(0).getUserName());
                System.exit(0);
            } else if (whatToDo.equalsIgnoreCase("help")) {
                System.out.println();
                goingToCafe();
            } else if (whatToDo.equalsIgnoreCase("signout")) {
                User.signOut();
            } else {
                System.out.println();
                System.out.println(".______________________________________________.");
                System.out.println();
                goingToCafe();
            }
        } else if (User.signedInUser.get(0).getType().equals("Customer")) {
            System.out.println();
            Store.getMenu();
            System.out.println("what do you want ?(cafe/restaurant)");
            String whatDoYouwant = scanner.nextLine();
            whatDoYouwant = whatDoYouwant.toLowerCase().replaceAll(" ", "");
            if (whatDoYouwant.equalsIgnoreCase("cafe")) {
                Cafe.addOrder();
                return;
            } else if (whatDoYouwant.equalsIgnoreCase("restaurant")) {
                Restaurant.addOrder();
                return;
            } else if (whatDoYouwant.equalsIgnoreCase("showbalance")) {
                User.showBalance();
                goingToCafe();
            } else if (whatDoYouwant.equalsIgnoreCase("addbalance")) {
                User.addBalance();
                goingToCafe();
            } else if (whatDoYouwant.equalsIgnoreCase("back")) {
                System.out.println(".______________________________________________.");
                System.out.println();
                initialize();
            } else if (whatDoYouwant.equalsIgnoreCase("home")) {
                User.signOut();
                System.out.println(".______________________________________________.");
                System.out.println();
                initialize();
            } else if (whatDoYouwant.equalsIgnoreCase("game")) {
                insideCafe();
            } else if (whatDoYouwant.equalsIgnoreCase("cancelorder")) {
                System.out.println();
                Storage.backToStorage(User.signedInUser.get(0).order);
                Order newOrder = new Order();
                User.signedInUser.get(0).order.cancelOrNot = true;
                System.out.println("Your order has been canceled");
                System.out.println();
                System.out.println("Press enter to continue");
                scanner.nextLine();
                System.out.println(".______________________________________________.");
                Project.goingToCafe();
            } else if (whatDoYouwant.equalsIgnoreCase("showorderhistory")) {
                Store.showOrderHistory(User.signedInUser.get(0));
            }
             else if (whatDoYouwant.equals("exit")) {
                System.out.println();
                System.out.println("Hava a good time");
                System.out.println(".______________________________________________.");
                System.out.println();
                WriteToFile.exit(User.signedInUser.get(0).getUserName());
                System.exit(0);
            } else if (whatDoYouwant.equals("help")) {
                System.out.println();
                goingToCafe();
            } else if (whatDoYouwant.equalsIgnoreCase("signout")) {
                User.signOut();
            } else {
                System.out.println("Error!!!");
                System.out.println(".______________________________________________.");
                goingToCafe();
            }
        }
    }

    public static void insideCafe() {
        System.out.println();
        System.out.println("We designed a game for you in case you want to be entertained until your order is ready ｡^‿^｡\n" +
                "1- \"Razm\" \n" +
                "2- \"Camera\" ");
        System.out.print("enter a number to enter the game:");
        int num = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        if(num==1){
            Razm.gameHelp();
            Razm.playingGame();
        }
        else if(num==2){
            Camera.gameHelp();
            Camera.playingGame();
        }

        else{
            System.out.println("Error 404");
            insideCafe();
        }

    }


    public static void help() {
        System.out.println("""
                I'm here to help you  ｡^‿^｡
                                
                so whenever you want you can call me with keyword: "help"
                These are some keywords you can use plus keywords in parenthesis:
                                
                "exit" : exit the program
                "home" : go to home page
                "back" : go to previous page
                "game" : start a game
                "ingredient" plus a "product name": show the product's ingredient
                "cancel order" : cancel your order
                "show order" : show your order
                "show order history" : show your order history
                "add balance" : add to balance of your account
                "show balance" : show balance of your account
                "sign out" : sign out from your account
                (｡◕‿◕｡)
                """);
        System.out.println();
        System.out.println("Press enter to continue");
        scanner.nextLine();
        System.out.println(".______________________________________________.");
    }

    public static void helpEmployee() {
        System.out.println("""
                Hi Boss  ಠ_ಠ 
                I'm here to help you  ｡^‿^｡
                                
                so whenever you want you can call me with keyword: "help"
                These are some keywords you can use plus keywords in parenthesis:
                                
                "exit" : exit the program
                "home" : go to home page
                "back" : go to previous page
                "show order" : show all orders
                "cancel order" : cancel a order
                "check storage" : check the storage
                "add all" : add to all ingredients
                "minus all" : decrease all ingredients 
                "add" plus a "an ingredient name" : add to the ingredient
                "minus" plus a "an ingredient name" : decrease from the ingredient
                "add balance" : add to balance of your account
                "show balance" : show balance of your account
                "sign out" : sign out from your account
                (｡◕‿◕｡)
                """);
        System.out.println();
        System.out.println("Press enter to continue");
        scanner.nextLine();
        System.out.println(".______________________________________________.");
    }

}
