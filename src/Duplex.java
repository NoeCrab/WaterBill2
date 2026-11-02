public class Duplex extends Customer{

    static final double BASE = 15.51;
    static final int TIER1 = 9000;
    static final double TIER1_COST = 1.97;
    static final int TIER2 = 4000;
    static final double TIER2_COST = 2.26;
    static final double TIER3_COST = 2.60;

    public Duplex(){
        super(BASE, TIER1, TIER1_COST, TIER2, TIER2_COST, TIER3_COST);
        System.out.println("duplex");
    }

    public Duplex(String name, int gallonsUsed){
        super(name, gallonsUsed,BASE, TIER1, TIER1_COST, TIER2, TIER2_COST, TIER3_COST);

    }

    /*
    @Override
    public double calculateBill() {

        double bill;
            if (getGallonsUsed() <= DUPLEX_TIER1) {
                bill = DUPLEX_BASE + getGallonsUsed() * (DUPLEX_TIER1_COST / GALLONS);
            } else if (getGallonsUsed() <= TIER2_CUTOFF) {
                bill = DUPLEX_BASE + DUPLEX_TIER1 * (DUPLEX_TIER1_COST / GALLONS)
                        + (getGallonsUsed() - DUPLEX_TIER1) * (DUPLEX_TIER2_COST /
                        GALLONS);
            } else {
                bill = DUPLEX_BASE + DUPLEX_TIER1 * (DUPLEX_TIER1_COST / GALLONS)
                        + DUPLEX_TIER2 * (DUPLEX_TIER2_COST / GALLONS)
                        + (getGallonsUsed() - TIER2_CUTOFF) * (DUPLEX_TIER3_COST /
                        GALLONS);
            }
            return bill;
        }
        */
}
