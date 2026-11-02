import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public abstract class Customer {


    private String name;
    private int gallonsUsed;
    // private int customerType; //1 = Single Family and 2 = Duplex
    private double bill;

    final int TIER2_CUTOFF = 13000;
    final double GALLONS = 1000.0;

    double BASE;
    int TIER1;
    double TIER1_COST;
    int TIER2;
    double TIER2_COST;
    double TIER3_COST;

    static private ArrayList<Customer> allCustomers = new ArrayList<Customer>();


    public Customer(){
        System.out.println("customer");
        this.name = null;
        this.gallonsUsed = 0;
    }

    protected Customer(String name, int gallonsUsed, double base, int tier1, double tier1Cost, int tier2, double tier2Cost, double tier3Cost){
        setName(name);
        setGallonsUsed(gallonsUsed);

        this.BASE = base;
        this.TIER1 = tier1;
        this.TIER1_COST = tier1Cost;
        this.TIER2 = tier2;
        this.TIER2_COST = tier2Cost;
        this.TIER3_COST = tier3Cost;
    }

    protected Customer(double base, int tier1, double tier1Cost, int tier2, double tier2Cost, double tier3Cost){

        this.BASE = base;
        this.TIER1 = tier1;
        this.TIER1_COST = tier1Cost;
        this.TIER2 = tier2;
        this.TIER2_COST = tier2Cost;
        this.TIER3_COST = tier3Cost;
    }


    //GETTER - allow for classes to get information

    static public ArrayList<Customer> getAllCustomers() {
        return allCustomers;
    }

    public int getGallonsUsed(){
        return gallonsUsed;
    }

    public String getName() {
        return name;
    }

    /*public int getCustomerType() {
        return customerType;
    }*/

    public double getBill() {
        return bill;
    }
    //SETTER - allows for us to set a value
    public void setName(String name) {
        if (name.equals("") || name == null){
            System.out.println("Must have a name");
        }
        else {
            this.name = name;
        }
    }

    /*
    public void setCustomerType(int customerType) {
        this.customerType = customerType;
    }
    */

    public void setGallonsUsed(int gallonsUsed){
        if (gallonsUsed < 0 ){
            System.out.println("Gallons must be postive");
        }
        else{
            this.gallonsUsed = gallonsUsed;

        }
    }

    protected void registerCustomer(){
        allCustomers.add(this);
    }

    public void customerInput() {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try {
            System.out.print("Enter Customer Name: ");
            setName(bufferedReader.readLine());
            //System.out.print("Enter Customer Type (1: SingleFamily, 2: Duplex): ");
            //setCustomerType(Integer.parseInt(bufferedReader.readLine()));
            System.out.print("Enter gallons used: ");
            setGallonsUsed(Integer.parseInt(bufferedReader.readLine()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected double calculateBill(){
        if (getGallonsUsed() <= TIER1) {
            bill = BASE + getGallonsUsed() * (TIER1_COST / GALLONS);
        } else if (getGallonsUsed() <= TIER2_CUTOFF) {
            bill = BASE + TIER1 * (TIER1_COST / GALLONS)
                    + (getGallonsUsed() - TIER1) * (TIER2_COST /
                    GALLONS);
        } else {
            bill = BASE + TIER1 * (TIER1_COST / GALLONS)
                    + TIER2 * (TIER2_COST / GALLONS)
                    + (getGallonsUsed() - TIER2_CUTOFF) * (TIER3_COST /
                    GALLONS);
        }
        return bill;

    }


    protected double applyDiscount(double calculatedBill){
        return calculatedBill;
    }

    public void generateBill(){
        double calculated = calculateBill();
        double finalBill = applyDiscount(calculated);

        this.bill = finalBill;

        registerCustomer();
    }
    public void printBill() {
        System.out.println("The bill is " + bill);

    }

    @Override
    public String toString() {
        return "Name " + getName();
    }

    static public Customer getHighestCustomer(){
        //logic used for getting highest Customer
        return null;
    }

    
}


