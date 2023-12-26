import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WriteToFile {

    static DateTimeFormatter time = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    public static void addUser(String username){
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) +": "+ "\"" + username + "\"" + " has been created\n ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void signInUser(String username){
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) +": "+ "\"" + username + "\"" + " has signed in\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void signOutUser(String username) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) +": "+ "\"" + username + "\"" + " has signed out\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void order(String username , Order order){
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) + ": "+ "\"" + username + "\"" + " has ordered:  (" + Store.showOrderString(order.orderList) +")\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void addFund(int fund) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) + ":  " +fund + "$ has been added to Cafe's account\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void addFundToAccount(String username, int fund) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) + ": "  + "\"" + username + "\"" + " has added "+ fund + "$ to his account \n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void cancelOrder(String username,Order order ) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) + ": " + "\"" + username + "\"" + " has canceled order with id: " + order.id + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void startGameRazm(String username) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) +": "+ "\"" + username + "\"" + " has started the game " + "\"Razm\"" + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void winGameRazm(String username) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) +": "+ "\"" + username + "\"" + " has won the game " + "\"Razm\"" + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void looseGameRazm(String username) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) + ": " + "\"" + username + "\"" + " has lost the game " + "\"Razm\"" + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void startGameCamera(String username) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) +": "+ "\"" + username + "\"" + " has started the game " + "\"Camera\"" + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void winGameCamera(String username) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) +": "+ "\"" + username + "\"" + " has won the game " + "\"Camera\"" + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void looseGameCamera(String username) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) + ": " + "\"" + username + "\"" + " has lost the game " + "\"Camera\"" + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void fundWon(String username,int won) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) +": "+ "\"" + username + "\"" + " has won " + won+"$\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void addCheese(int num) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) +": "+ "\"" + num + "\"" + " Cheese has been added to storage\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void addFlour(int num) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) +": " + "\"" + num + "\"" + " Flour has been added to storage\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void addMeat(int num) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) + ": " + "\"" + num + "\"" + " Meat has been added to storage\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void addBread(int num) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) + ": " + "\"" + num + "\"" + " Bread has been added to storage\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void addVegetable(int num) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) + ": " + "\"" + num + "\"" + " Vegetable has been added to storage\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void addChicken(int num) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) + ": " + "\"" + num + "\"" + " Chicken has been added to storage\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void addPotato(int num) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) + ": " + "\"" + num + "\"" + " Potato has been added to storage\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void addCoffee(int num) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) + ": " + "\"" + num + "\"" + " Coffee has been added to storage\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void addBeans(int num) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) + ": " + "\"" + num + "\"" + " Beans has been added to storage\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void addTea(int num) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) + ": " + "\"" + num + "\"" + " Tea has been added to storage\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void addChocolate(int num) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) + ": " + "\"" + num + "\"" + " Chocolate has been added to storage\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void addSoda(int num) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) + ": " + "\"" + num + "\"" + " Soda has been added to storage\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void addIceCream(int num) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) + ": " + "\"" + num + "\"" + " IceCream has been added to storage\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void addVanilla(int num) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) + ": " + "\"" + num + "\"" + " Vanilla has been added to storage\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void addWater(int num) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) + ": " + "\"" + num + "\"" + " Water has been added to storage\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void addSugar(int num) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) + ": " + "\"" + num + "\"" + " Sugar has been added to storage\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void addEgg(int num) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) + ": " + "\"" + num + "\"" + " Egg has been added to storage\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void minusCheese(int num) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) +": "+ "\"" + num + "\"" + " Cheese has been decreased from storage\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void minusFlour(int num) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) +": " + "\"" + num + "\"" + " Flour has been decreased from storage\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void minusMeat(int num) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) + ": " + "\"" + num + "\"" + " Meat has been decreased from storage\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void minusBread(int num) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) + ": " + "\"" + num + "\"" + " Bread has been decreased from storage\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void minusVegetable(int num) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) + ": " + "\"" + num + "\"" + " Vegetable has been decreased from storage\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void minusChicken(int num) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) + ": " + "\"" + num + "\"" + " Chicken has been decreased from storage\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void minusPotato(int num) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) + ": " + "\"" + num + "\"" + " Potato has been decreased from storage\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void minusCoffee(int num) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) + ": " + "\"" + num + "\"" + " Coffee has been decreased from storage\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void minusBeans(int num) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) + ": " + "\"" + num + "\"" + " Beans has been decreased from storage\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void minusTea(int num) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) + ": " + "\"" + num + "\"" + " Tea has been decreased from storage\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void minusChocolate(int num) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) + ": " + "\"" + num + "\"" + " Chocolate has been decreased from storage\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void minusSoda(int num) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) + ": " + "\"" + num + "\"" + " Soda has been decreased from storage\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void minusIceCream(int num) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) + ": " + "\"" + num + "\"" + " IceCream has been decreased from storage\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void minusVanilla(int num) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) + ": " + "\"" + num + "\"" + " Vanilla has been decreased from storage\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void minusWater(int num) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) + ": " + "\"" + num + "\"" + " Water has been decreased from storage\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void minusSugar(int num) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) + ": " + "\"" + num + "\"" + " Sugar has been decreased from storage\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void minusEgg(int num) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) + ": " + "\"" + num + "\"" + " Egg has been decreased from storage\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void addAll(int num) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) + ": amount " + "\"" + num + "\"" + " has been added to all ingredients in the storage\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void minusAll(int num) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) + ": amount " + "\"" + num + "\"" + " has been decreased from all ingredients in the storage  \n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void exit(String username) {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n at " + time.format(now) +": "+ "\"" + username + "\"" + " has closed the program\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void start() {
        LocalDateTime now = LocalDateTime.now();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.write("\n\n at " + time.format(now) +": program has been started\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
