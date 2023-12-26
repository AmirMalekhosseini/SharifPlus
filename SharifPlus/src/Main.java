public class Main {

    public static void main(String[] args) {
        ReadFromFile.readFile();
        WriteToFile.start();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("welcome to your cafe  ( o˘◡˘o) ┌iii┐ "+ "\n");
        User testUser = new User();
        Storage storage = new Storage();
        User.signedInUser.add(testUser);

        Project.initialize();
    }
}