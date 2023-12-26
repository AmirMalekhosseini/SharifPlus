import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFromFile {

    public static void readFile(){

        int counter = 1;

        try {
            File myObj = new File("username.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                User user = new User();
                for (int i = 0; i < 4; i++) {
                    String data = myReader.nextLine();
                    if(counter==1){
                        user.setUserName(data);
                        counter++;
                    }
                    else if(counter==2){
                        user.setPassword(data);
                        counter++;
                    } else if (counter == 3) {
                        user.setType(data);
                        counter++;
                    }
                    else if(counter==4){
                        user.savePassword = data.equalsIgnoreCase("true");
                        counter = 1;
                        User.userList.add(user);
                    }
                }

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
