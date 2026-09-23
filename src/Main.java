import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){
      Customer c = new Customer();
      c.setName("");
      c.customerInput();
      c.calculateBill();
      c.printBill();
    }

}
