import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SingleFamily extends Customer {
    static final double BASE = 13.21;
    static final int TIER1 = 7000;
    static final double TIER1_COST = 2.04;
    static final int TIER2 = 6000;
    static final double TIER2_COST = 2.35;
    static final double TIER3_COST = 2.70;

    public SingleFamily(){
        super(BASE, TIER1, TIER1_COST, TIER2, TIER2_COST, TIER3_COST);
        System.out.println("Single Family");
    }

    public SingleFamily(String name, int gallonsUsed){
        super(name, gallonsUsed,BASE, TIER1, TIER1_COST, TIER2, TIER2_COST, TIER3_COST);

    }

    private boolean lowIncome;

    public boolean isLowIncome() {
        return lowIncome;
    }

    public void setLowIncome(boolean lowIncome) {
        this.lowIncome = lowIncome;
    }

    @Override
    public void customerInput() {
        super.customerInput();
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try {
            System.out.print("Is the customer low income? (True/False: ");
            setLowIncome(Boolean.parseBoolean(bufferedReader.readLine()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /*
    @Override
    public double calculateBill() {
            double bill;
            if (getGallonsUsed() <= SINGLE_TIER1) {
                bill = SINGLE_BASE + getGallonsUsed() * (SINGLE_TIER1_COST / GALLONS);
            } else if (getGallonsUsed() <= TIER2_CUTOFF) {
                bill = SINGLE_BASE + SINGLE_TIER1 * (SINGLE_TIER1_COST / GALLONS)
                        + (getGallonsUsed() - SINGLE_TIER1) * (SINGLE_TIER2_COST /
                        GALLONS);
            } else {
                bill = SINGLE_BASE + SINGLE_TIER1 * (SINGLE_TIER1_COST / GALLONS)
                        + SINGLE_TIER2 * (SINGLE_TIER2_COST / GALLONS)
                        + (getGallonsUsed() - TIER2_CUTOFF) * (SINGLE_TIER3_COST /
                        GALLONS);
            }
            return bill;
    }
    */


    @Override
    public double applyDiscount(double bill){
        if(lowIncome){
            bill = bill * 0.9;
        }
        return bill;
    }


}
