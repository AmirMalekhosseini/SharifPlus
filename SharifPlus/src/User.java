import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class User {
    static Scanner scanner = new Scanner(System.in);

    static ArrayList<User> userList = new ArrayList<>();

    static ArrayList<User> signedInUser = new ArrayList<>();


    ArrayList<Order> orderHistory = new ArrayList<>();

    Order order = new Order();

    private String password,userName,type;

    private long balance = 0;

    public boolean savePassword = false;


    public void setBalance(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public static void signInUser() {
        System.out.print("enter your username to sign in:");
        String username = scanner.next();
        scanner.nextLine();
        System.out.println();
        int counter = 0;
        if(userList.size()==0){
            System.out.println("error!!"+"\n"+"you don't hava an account. please sign up");
            System.out.println(".______________________________________________.");
            addUser();
            return;
        }

        L1:
        for (int j = 0; j < userList.size(); j++) {
            counter++;
            if (userList.get(j).getUserName().equals(username)) {

                for (int i = 0; i < 1000000000; i++) {
                    System.out.print("enter your password:");
                    if(userList.get(j).savePassword){
                        String password = userList.get(j).getPassword();
                        for (int q = 0; q < password.length() ; q++) {
                            System.out.print('*');
                        }
                        System.out.println();
                        System.out.println();
                        System.out.println("Signed in successfully");
                        System.out.println();
                        System.out.println(".______________________________________________.");
                        signedInUser.set(0, userList.get(j));
                        WriteToFile.signInUser(signedInUser.get(0).userName);
                        showBalance();
                        System.out.println("Do you want to increase your account balance? (yes/no)");
                        String increaseAccountBalance = scanner.next();
                        scanner.nextLine();
                        if(increaseAccountBalance.equalsIgnoreCase("yes")){
                            addBalance();
                            break L1;
                        }
                        break L1;
                    }
                    else {
                        String password = scanner.next();
                        scanner.nextLine();
                        System.out.println();
                        if (!Objects.equals(userList.get(j).getPassword(), password)) {
                            System.out.println("your password is incorrect");
                            System.out.println();
                        } else {
                            System.out.println("Signed in successfully");
                            System.out.println();
                            System.out.println(".______________________________________________.");
                            signedInUser.set(0, userList.get(j));
                            WriteToFile.signInUser(signedInUser.get(0).userName);
                            showBalance();
                            System.out.println("Do you want to increase your account balance? (yes/no)");
                            String increaseAccountBalance = scanner.next();
                            scanner.nextLine();
                            if(increaseAccountBalance.equalsIgnoreCase("yes")){
                                addBalance();
                                break L1;
                            }
                            break L1;
                        }
                    }
                }
            } else if(counter== userList.size()) {
                System.out.println("Username is incorrect");
                System.out.println();
                for (int i = 0; i < 1000000000; i++) {
                    System.out.println("Do you want to sign up?(yes/no)");
                    String signUpOrNot = scanner.next();
                    scanner.nextLine();
                    System.out.println();
                    if (signUpOrNot.equalsIgnoreCase("yes")) {
                        addUser();
                        break L1;
                    } else if (signUpOrNot.equalsIgnoreCase("no")) {
                        signInUser();
                        break L1;
                    } else {
                        System.out.print("error 404 \t");
                        System.out.println("""
                                ¯\\_(ツ)_/¯
                                """);
                        System.out.println(".______________________________________________.");
                    }
                }
            }
        }
    }
    public static void addUser() {
        System.out.println("choose your account type:");
        System.out.println("1-Employee");
        System.out.println("2-Customer");
        System.out.print("enter your number:");
        String chooseType = scanner.next();
        scanner.nextLine();
        System.out.println(".______________________________________________.");

        if (Integer.parseInt(chooseType) == 1) {
            User newEmployee = new User();
            User testEmployee = new User();
            userList.add(testEmployee);
            System.out.print("enter your username:");
            L2:
            for (int j = 0; j < 1000000000; j++) {
                String userName = scanner.next();
                scanner.nextLine();
                System.out.println();
                int counter = 0;
                for (int i = 0; i < 100000000; i++) {
                    if (!Objects.equals(userList.get(i).getUserName(), userName)) {
                        counter++;
                        if (counter == userList.size()) {
                            newEmployee.setUserName(userName);
                            int b = userList.size() - 1;
                            userList.set(b, newEmployee);
                            break L2;
                        }
                    }
                    else {
                        System.out.println("The username is not available !!");
                        System.out.print("please enter a valid username:");
                        continue L2;
                    }
                }
            }
            System.out.print("enter a password:");
            int a = userList.size() - 1;
            userList.get(a).setPassword(scanner.next());
            scanner.nextLine();
            System.out.println();

            System.out.println("Save password? (yes/no)");
            String savePasswordYesOrNo = scanner.next();
            scanner.nextLine();
            if (savePasswordYesOrNo.equalsIgnoreCase("yes")) {
                userList.get(a).savePassword = true;
            }
            userList.get(a).setType("Employee");
        }

        else if (Integer.parseInt(chooseType) == 2) {
            User newEmployee = new User();
            User testEmployee = new User();
            userList.add(testEmployee);
            System.out.print("enter your username:");
            L2:
            for (int j = 0; j < 1000000000; j++) {
                String userName = scanner.next();
                scanner.nextLine();
                System.out.println();
                int counter = 0;
                for (int i = 0; i < 100000000; i++) {
                    if (!Objects.equals(userList.get(i).getUserName(), userName)) {
                        counter++;
                        if (counter == userList.size()) {
                            newEmployee.setUserName(userName);
                            int b = userList.size() - 1;
                            userList.set(b, newEmployee);
                            break L2;
                        }
                    }
                    else {
                        System.out.println("The username is not available !!");
                        System.out.println();
                        System.out.print("please enter a valid username:");
                        continue L2;
                    }
                }
            }
            System.out.print("enter a password:");
            int a = userList.size() - 1;
            userList.get(a).setPassword(scanner.next());
            scanner.nextLine();
            System.out.println();

            System.out.println("Save password? (yes/no)");
            String savePasswordYesOrNo = scanner.next();
            scanner.nextLine();
            if (savePasswordYesOrNo.equalsIgnoreCase("yes")) {
                userList.get(a).savePassword = true;
            }
            userList.get(a).setType("Customer");
        }
        else{
            System.out.println("""
                    error!!!
                    please enter a valid number
                    """);
            System.out.println(".______________________________________________.");
            addUser();
            return;
        }
        System.out.println();
        System.out.println("your account has been created successfully");
        int a = userList.size() - 1;
        WriteToFile.addUser(userList.get(a).userName);
        System.out.println();
        System.out.println(".______________________________________________.");
        signInUser();
    }

    public static void signOut(){
        WriteToFile.signOutUser(signedInUser.get(0).userName);
        User newUser = new User();
        signedInUser.set(0, newUser);
        System.out.println("you hava been signed out");
        System.out.println(".______________________________________________.");
        System.out.println();
        Project.initialize();
    }

    public static void showBalance(){
        System.out.println();
        System.out.println("Your account balance is: "+ User.signedInUser.get(0).getBalance() + "$" );
        System.out.println();
        System.out.println(".______________________________________________.");
    }

    public static void addBalance(){
        System.out.println();
        System.out.print("Enter amount you want to add to your account: ");
        int amount = scanner.nextInt();
        WriteToFile.addFundToAccount(User.signedInUser.get(0).getUserName(), amount);
        WriteToFile.addFund(amount);
        scanner.nextLine();
        User.signedInUser.get(0).setBalance(User.signedInUser.get(0).getBalance() + amount);
        System.out.println();
        System.out.println("\t" + amount + "$ has been added to your account");
        System.out.println();
        System.out.println(".______________________________________________.");
        System.out.println();
        showBalance();
    }
}
