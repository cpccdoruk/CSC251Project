

import java.util.Scanner;

public class  Project_doruk_ilkilic {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter the Policy Number: ");
        int policyNumber = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("\nPlease enter the Provider Name: ");
        String providerName = keyboard.nextLine();

        System.out.print("\nPlease enter the Policyholder’s First Name: ");
        String firstName = keyboard.nextLine();

        System.out.print("\nPlease enter the Policyholder’s Last Name: ");
        String lastName = keyboard.nextLine();

        System.out.print("\nPlease enter the Policyholder’s Age: ");
        int age = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("\nPlease enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
        String smokingStatus = keyboard.nextLine();

        System.out.print("\nPlease enter the Policyholder’s Height (in inches): ");
        double height = keyboard.nextDouble();

        System.out.print("\nPlease enter the Policyholder’s Weight (in pounds): ");
        double weight = keyboard.nextDouble();

        Policy policy = new Policy(policyNumber, providerName, firstName,
                                   lastName, age, smokingStatus,
                                   height, weight);

        System.out.println("\nPolicy Number: " + policy.getPolicyNumber());
        System.out.println("\nProvider Name: " + policy.getProviderName());
        System.out.println("\nPolicyholder’s First Name: " + policy.getFirstName());
        System.out.println("\nPolicyholder’s Last Name: " + policy.getLastName());
        System.out.println("\nPolicyholder’s Age: " + policy.getAge());
        System.out.println("\nPolicyholder’s Smoking Status: " + policy.getSmokingStatus());
        System.out.println("\nPolicyholder’s Height: " + policy.getHeight() + " inches");
        System.out.println("\nPolicyholder’s Weight: " + policy.getWeight() + " pounds");
        System.out.printf("\nPolicyholder’s BMI: %.2f\n", policy.calculateBMI());
        System.out.printf("\nPolicy Price: $%.2f\n", policy.calculatePolicyPrice());

        keyboard.close();
    }
}