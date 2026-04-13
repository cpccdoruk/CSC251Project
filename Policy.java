/**
 * The Policy class stores information about an insurance policy.
 */
public class Policy {

    private int policyNumber;
    private String providerName;
    private PolicyHolder policyHolder;

    /* Step 3 — static counter */
    private static int policyCount = 0;

    /** No-arg constructor */
    public Policy() {
        policyNumber = 0;
        providerName = "";
        policyHolder = new PolicyHolder();
        policyCount++;
    }

    /** Constructor with parameters */
    public Policy(int number, String provider, PolicyHolder holder) {
        policyNumber = number;
        providerName = provider;

        /* Step 5  copy (security) */
        policyHolder = new PolicyHolder(holder);

        policyCount++;
    }

    /** Copy constructor (security) */
    public Policy(Policy obj) {
        policyNumber = obj.policyNumber;
        providerName = obj.providerName;
        policyHolder = new PolicyHolder(obj.policyHolder);
        policyCount++;
    }

    // Getters
    public int getPolicyNumber() { return policyNumber; }
    public String getProviderName() { return providerName; }

    /**  copy getter (security requirement) */
    public PolicyHolder getPolicyHolder() {
        return new PolicyHolder(policyHolder);
    }

    // Setters
    public void setPolicyNumber(int number) { policyNumber = number; }
    public void setProviderName(String provider) { providerName = provider; }

    /** security copy setter */
    public void setPolicyHolder(PolicyHolder holder) {
        policyHolder = new PolicyHolder(holder);
    }

    /** Static method to get count */
    public static int getPolicyCount() {
        return policyCount;
    }

    /** Calculate policy price using PolicyHolder object */
    public double calculatePolicyPrice() {
        double price = 600;

        if (policyHolder.getAge() > 50)
            price += 75;

        if (policyHolder.getSmokingStatus().equalsIgnoreCase("smoker"))
            price += 100;

        double bmi = policyHolder.calculateBMI();

        if (bmi > 35)
            price += (bmi - 35) * 20;

        return price;
    }

    /** toString method (Step 2) */
    public String toString() {
        return "Policy Number: " + policyNumber +
               "\nProvider Name: " + providerName +
               "\n" + policyHolder.toString() +
               String.format("\nPolicy Price: $%.2f", calculatePolicyPrice());
    }
}