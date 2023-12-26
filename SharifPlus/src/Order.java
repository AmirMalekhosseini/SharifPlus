import java.time.LocalTime;
import java.util.ArrayList;

public class Order {
    LocalTime id;

    int price = 0;

    public boolean cancelOrNot = false;

    ArrayList<Product> orderList = new ArrayList<>();
}
