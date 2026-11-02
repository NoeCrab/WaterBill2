import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        /*
        int[] test = new int[5];

        for(int i = 0;  i < test.length; i++){
            System.out.println(test[i]);
        }

        ArrayList<Integer> test2 = new ArrayList<Integer>();
        test2.add(4);
        */

         //Customer sf = new SingleFamily();
         //sf.customerInput();
         //sf.generateBill();
         //Duplex dup = new Duplex();
         //dup.customerInput();
         //dup.generateBill();

         Customer.getAllCustomers();
         Customer.getHighestCustomer();


         System.out.println(Customer.getAllCustomers());

         for(int i = 0; i < Customer.getAllCustomers().size(); i++){
             System.out.println(Customer.getAllCustomers().get(i));
         }

         //for(Data Type variable_name : collection)
        /*
        for(Customer c : Customer.getAllCustomers()){
            System.out.println(c);
        }
        */
    }

}
