import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Camera {

    static Scanner scanner = new Scanner(System.in);

    private static Throwable ex;

    public static void playingGame() {

        System.out.println();
        System.out.println("Do you want to enter the game? (yes/no)");
        String enter = scanner.nextLine();
        enter = enter.toLowerCase().replaceAll(" ", "");

        if (enter.contains("showbalance")) {
            User.showBalance();
            playingGame();
        } else if (enter.contains("addbalance")) {
            User.addBalance();
            playingGame();
        } else if (enter.contains("help")) {
            gameHelp();
            playingGame();
        } else if (enter.contains("back")) {
            Project.goingToCafe();
        } else if (enter.contains("home")) {
            Project.initialize();
        } else if (enter.contains("exit")) {
            System.out.println("Hava a good time");
            System.out.println(".______________________________________________.");
            System.out.println();
            WriteToFile.exit(User.signedInUser.get(0).getUserName());
            System.exit(0);
        } else if (enter.equalsIgnoreCase("no")) {
            System.out.println("Hava a good time");
            System.out.println(".______________________________________________.");
            System.out.println();
        } else {
            WriteToFile.startGameCamera(User.signedInUser.get(0).getUserName());
            boolean winOrNot = false;
            int m = 5;
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

            for (int i = 0; i <1000000000 ; i++) {
                int counter = 0;
                System.out.print("enter length of your spot: ");
                int x = scanner.nextInt();
                scanner.nextLine();
                if (x > 10) {
                    System.out.println("please enter a number between 1 to 10");
                    continue;
                }
                System.out.println();
                System.out.print("enter width of your spot: ");
                int y = scanner.nextInt();
                scanner.nextLine();
                if (y > 10) {
                    System.out.println("please enter a number between 1 to 10");
                    continue;
                }
                int n = 2;//tedad camera
                int[] camera = new int[2 * n];
                for (int q = 0; q < camera.length; q++) {
                    camera[q] = Razm.getRandomNumber(0, 10);
                }

                for (int j = 0; j < 2; j++) {
                    if (Math.pow(x - camera[counter], 2) + Math.pow(y - camera[counter + 1], 2) - Math.pow(5, 2) > 0) {
                        counter += 2;
                        winOrNot = true;
                    }
                    else {
                        winOrNot = false;
                    }
                }
                break;
            }


            if (winOrNot) {//win

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
                WriteToFile.winGameCamera(User.signedInUser.get(0).getUserName());
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
                int draw = Razm.draw();
                System.out.println("Congratulations!!You won " + draw + "$");
                long balance1 = User.signedInUser.get(0).getBalance();
                User.signedInUser.get(0).setBalance(balance1 + draw);
                User.showBalance();
                WriteToFile.fundWon(User.signedInUser.get(0).getUserName(), draw);

            } else {//loose


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
                WriteToFile.looseGameCamera(User.signedInUser.get(0).getUserName());


            }
            playingGame();
        }
    }

    public static void gameHelp(){

        System.out.println("""
                You are going to fight with our AI  ｡^‿^｡
                
                This is how the game works:
                
                You pay 5$ to enter the game
                There is a 10x10 road and there are two cameras with raduis 5 and random coordinate
                if you choose a coordinate that is out if both cameras, you are the winner (｡◕‿◕｡)
                
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
