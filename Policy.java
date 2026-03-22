/**
 * The Policy class stores information about insurance policy
 * and has methods to calculate BMI and policy price.
 */
public class Policy {

    public static void main(String[] args) {}

    // Object Fields
    private int policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;

    /**
     * No-arg constructor initializes fields to default values.
     */
    public Policy() {
        policyNumber = 0;
        providerName = "";
        firstName = "";
        lastName = "";
        age = 0;
        smokingStatus = "";
        height = 0.0;
        weight = 0.0;
    }

    /**
     * Constructor that initializes all fields.
     * @param pNumber policy number
     * @param pProviderName provider name
     * @param pFirstName first name
     * @param pLastName last name
     * @param pAge age
     * @param pSmokingStatus smoking status
     * @param pHeight height in inches
     * @param pWeight weight in pounds
     */
    public Policy(int pNumber, String pProviderName, String pFirstName,
                  String pLastName, int pAge, String pSmokingStatus,
                  double pHeight, double pWeight) {

        policyNumber = pNumber;
        providerName = pProviderName;
        firstName = pFirstName;
        lastName = pLastName;
        age = pAge;
        smokingStatus = pSmokingStatus;
        height = pHeight;
        weight = pWeight;
    }

    /** @return policy number */
    public int getPolicyNumber() { return policyNumber; }

    /** @return provider name */
    public String getProviderName() { return providerName; }

    /** @return first name */
    public String getFirstName() { return firstName; }

    /** @return last name */
    public String getLastName() { return lastName; }

    /** @return age */
    public int getAge() { return age; }

    /** @return smoking status */
    public String getSmokingStatus() { return smokingStatus; }

    /** @return height */
    public double getHeight() { return height; }

    /** @return weight */
    public double getWeight() { return weight; }

    /** @param pNumber policy number */
    public void setPolicyNumber(int pNumber) { policyNumber = pNumber; }

    /** @param pProviderName provider name */
    public void setProviderName(String pProviderName) { providerName = pProviderName; }

    /** @param pFirstName first name */
    public void setFirstName(String pFirstName) { firstName = pFirstName; }

    /** @param pLastName last name */
    public void setLastName(String pLastName) { lastName = pLastName; }

    /** @param pAge age */
    public void setAge(int pAge) { age = pAge; }

    /** @param pSmokingStatus smoking status */
    public void setSmokingStatus(String pSmokingStatus) { smokingStatus = pSmokingStatus; }

    /** @param pHeight height */
    public void setHeight(double pHeight) { height = pHeight; }

    /** @param pWeight weight */
    public void setWeight(double pWeight) { weight = pWeight; }

    /**
     * Calculates BMI.
     * @return BMI value
     */
    public double calculateBMI() {
        return (weight * 703) / (height * height);
    }

    /**
     * Calculates policy price.
     * @return policy price
     */
    public double calculatePolicyPrice() {
        double price = 600;

        if (age > 50)
            price += 75;

        if (smokingStatus.equalsIgnoreCase("smoker"))
            price += 100;

        double bmi = calculateBMI();

        if (bmi > 35)
            price += (bmi - 35) * 20;

        return price;
    }
}