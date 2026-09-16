import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello World");

        Customer charleeCustomer = new Customer();
        System.out.println(charleeCustomer.name);
        charleeCustomer.name = "Charlee";
        System.out.println(charleeCustomer.name);
        charleeCustomer.gallonsUsed = 8000;
        charleeCustomer.customerType = 1;
        charleeCustomer.calculateBill();



        Customer quinnCustomer = new Customer();
        quinnCustomer.name = "Quinn";
        System.out.println(quinnCustomer.name);
        System.out.println(quinnCustomer.gallonsUsed);
    }

}
