/**
 * The PolicyHolder class stores personal information of a policyholder
 * and provides a method to calculate BMI.
 */
public class PolicyHolder {

    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;

    /** No-arg constructor */
    public PolicyHolder() {
        firstName = "";
        lastName = "";
        age = 0;
        smokingStatus = "";
        height = 0.0;
        weight = 0.0;
    }

    /** Constructor with parameters */
    public PolicyHolder(String fName, String lName, int pAge,
                        String smoke, double h, double w) {
        firstName = fName;
        lastName = lName;
        age = pAge;
        smokingStatus = smoke;
        height = h;
        weight = w;
    }

    /** Copy constructor for SECURITY */
    public PolicyHolder(PolicyHolder obj) {
        firstName = obj.firstName;
        lastName = obj.lastName;
        age = obj.age;
        smokingStatus = obj.smokingStatus;
        height = obj.height;
        weight = obj.weight;
    }

    // Getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getSmokingStatus() { return smokingStatus; }
    public double getHeight() { return height; }
    public double getWeight() { return weight; }

    // Setters
    public void setFirstName(String fName) { firstName = fName; }
    public void setLastName(String lName) { lastName = lName; }
    public void setAge(int pAge) { age = pAge; }
    public void setSmokingStatus(String smoke) { smokingStatus = smoke; }
    public void setHeight(double h) { height = h; }
    public void setWeight(double w) { weight = w; }

    /** Calculate BMI */
    public double calculateBMI() {
        return (weight * 703) / (height * height);
    }

    /** toString method  */
    public String toString() {
        return "Policyholder's First Name: " + firstName +
               "\nPolicyholder's Last Name: " + lastName +
               "\nPolicyholder's Age: " + age +
               "\nPolicyholder's Smoking Status (Y/N): " + smokingStatus +
               "\nPolicyholder's Height: " + height + " inches" +
               "\nPolicyholder's Weight: " + weight + " pounds" +
               String.format("\nPolicyholder's BMI: %.2f", calculateBMI());
    }
}