public class Policy {

public static void main(String[] args) {}

    // Object fields
    private int policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;

    // class no-arg constructor
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

    // constructor with arguments
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

    // Getters accessers
    public int getPolicyNumber() {
        return policyNumber;
    }

    public String getProviderName() {
        return providerName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getSmokingStatus() {
        return smokingStatus;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    // Setters mutators
    public void setPolicyNumber(int pNumber) {
        policyNumber = pNumber;
    }

    public void setProviderName(String pProviderName) {
        providerName = pProviderName;
    }

    public void setFirstName(String pFirstName) {
        firstName = pFirstName;
    }

    public void setLastName(String pLastName) {
        lastName = pLastName;
    }

    public void setAge(int pAge) {
        age = pAge;
    }

    public void setSmokingStatus(String pSmokingStatus) {
        smokingStatus = pSmokingStatus;
    }

    public void setHeight(double pHeight) {
        height = pHeight;
    }

    public void setWeight(double pWeight) {
        weight = pWeight;
    }

    //  BMI calculator method
    public double calculateBMI() {
        return (weight * 703) / (height * height);
    }

    //  Policy Price calculator
    public double calculatePolicyPrice() {
        double price = 600;

        if (age > 50) {
            price += 75;
        }

        if (smokingStatus.equalsIgnoreCase("smoker")) {
            price += 100;
        }

        double bmi = calculateBMI();

        if (bmi > 35) {
            price += (bmi - 35) * 20;
        }

        return price;
    }
}
