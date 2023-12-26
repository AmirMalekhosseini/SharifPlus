import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Razm {
    static Scanner scanner = new Scanner(System.in);
    private static Throwable ex;

    public static void playingGame() {

        System.out.println();
        System.out.println("Do you want to enter the game? (yes/no)");
        String enter = scanner.nextLine();
        enter = enter.toLowerCase().replaceAll(" ", "");

        if(enter.contains("showbalance")){
            User.showBalance();
            playingGame();
        }

        else if(enter.contains("addbalance")){
            User.addBalance();
            playingGame();
        }

        else if(enter.contains("help")){
            gameHelp();
            playingGame();
        }

        else if(enter.contains("back")){
            Project.goingToCafe();
        }

        else if(enter.contains("home")){
            Project.initialize();
        }

        else if(enter.contains("exit")){
            System.out.println("Hava a good time");
            System.out.println(".______________________________________________.");
            System.out.println();
            WriteToFile.exit(User.signedInUser.get(0).getUserName());
            System.exit(0);
        }

        else if (enter.equalsIgnoreCase("no")) {
            System.out.println("Hava a good time");
            System.out.println(".______________________________________________.");
            System.out.println();
        }

        else {
            WriteToFile.startGameRazm(User.signedInUser.get(0).getUserName());
            long hp = 100;
            long ap = 20;
            long ap1 = ap;
            long hp1 = hp;
            long hd = getRandomNumber(100, 250);
            long hd1 = hd;
            long ad = getRandomNumber(10, 30);
            System.out.print("Enter amount of money you want to spend: ");
            long m = scanner.nextLong();
            scanner.nextLine();
            System.out.println();

            if (User.signedInUser.get(0).getBalance() < m) {
                System.out.println("Your balance is not enough ");
                System.out.println("Do you want to add to your account's balance? (yes/no)");
                String addBalanceOrNot = scanner.next();
                scanner.nextLine();

                if (addBalanceOrNot.equalsIgnoreCase("yes")) {
                    User.addBalance();
                    playingGame();
                    return;
                }
                else{
                    User.showBalance();
                    playingGame();
                    return;
                }
            }
            long balance = User.signedInUser.get(0).getBalance();
            User.signedInUser.get(0).setBalance(balance - m);
            long x = 1;
            long y = 1;
            long a, h;
            long d, p;
            long counter = 0;
            for (a = m; a >= 0; a--) {
                hd = hd1;
                hp = hp1;
                ap = ap1;
                h = m - a;
                ap = ap + (a * x);
                hp = hp + (h * y);
                d = (hp + ad - 1) / ad;
                p = (hd + ap - 1) / ap;
                counter++;
                if (p <= d) {
                    System.out.println();
                    System.out.print("LOADING");
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException ie) {
                        ex.printStackTrace();
                    }
                    System.out.print(".");
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException ie) {
                        ex.printStackTrace();
                    }
                    System.out.print(".");
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException ie) {
                        ex.printStackTrace();
                    }
                    System.out.print(".");

                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException ie) {
                        ex.printStackTrace();
                    }

                    System.out.println();
                    System.out.println("YOU WON  ヘ( ^o^)ノ＼(^_^ )");
                    System.out.println();
                    System.out.println(".______________________________________________.");
                    System.out.println();
                    WriteToFile.winGameRazm(User.signedInUser.get(0).getUserName());
                    System.out.print("LOADING DRAW");
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException ie) {
                        ex.printStackTrace();
                    }
                    System.out.print(".");
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException ie) {
                        ex.printStackTrace();
                    }
                    System.out.print(".");
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException ie) {
                        ex.printStackTrace();
                    }
                    System.out.print(".");

                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException ie) {
                        ex.printStackTrace();
                    }

                    System.out.println();
                    int draw = draw();
                    System.out.println("Congratulations!!You won " + draw + "$");
                    long balance1 = User.signedInUser.get(0).getBalance();
                    User.signedInUser.get(0).setBalance(balance1 + draw);
                    User.showBalance();
                    WriteToFile.fundWon(User.signedInUser.get(0).getUserName(), draw);
                    break;
                } else {
                    if (counter == m + 1) {
                        System.out.println();
                        System.out.print("LOADING");
                        try {
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException ie) {
                            ex.printStackTrace();
                        }
                        System.out.print(".");
                        try {
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException ie) {
                            ex.printStackTrace();
                        }
                        System.out.print(".");
                        try {
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException ie) {
                            ex.printStackTrace();
                        }
                        System.out.print(".");

                        try {
                            TimeUnit.SECONDS.sleep(2);
                        } catch (InterruptedException ie) {
                            ex.printStackTrace();
                        }
                        System.out.println();
                        System.out.println("YOU LOST ಠ_ಠ");
                        System.out.println();
                        System.out.print(".______________________________________________.");
                        WriteToFile.looseGameRazm(User.signedInUser.get(0).getUserName());
                        break;
                    }
                }
            }

            playingGame();
        }
    }

    public static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    public static int draw(){
        int percent = getRandomNumber(0, 100);

        if(percent>=95)
            return 50;

        else if(percent>90)
            return 40;

        else if(percent>85)
            return 30;

        else if(percent>65)
            return 25;

        else if(percent>55)
            return 20;

        else if(percent>25)
            return 10;

        else
            return 5;
    }

    public static void gameHelp(){
        System.out.println();
        System.out.println("""
                You are going to fight with our AI  ｡^‿^｡
                
                This is how the game works:
                
                You and AI have a specific attack power and a health.
                At first your attack power is "20" and your health is "200"
                But you can buy "1" more with every "1$" .It uses your account's balance
                AI's power is a random number between "10" and "30" and its health is a random number between "100" and "250"
                
                You take your shot one by one and the person who survived is the winner (｡◕‿◕｡) 
                
                If you won, amount of money between "5$" to "50$" will be added to your account 
                
                "add balance" : add to balance of your account
                "show balance" : show balance of your account
                "exit" : exit the program
                "home" : go to home page
                "back" : go to previous page
                "help" : game's guide
                
                GOOD LUCK └(＾＾)┐
                
                """);
    }
}
