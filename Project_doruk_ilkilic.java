import java.util.*;
import java.io.*;

public class Project_doruk_ilkilic
{ // open class

   public static void main(String[] args)
   { // open main

      try
      {
         // Create file object
         File file = new File("PolicyInformation.txt");

         // Create Scanner for file
         Scanner inputFile = new Scanner(file);

         // Declare variables
         int policyNumber = 0, age = 0;
         String providerName = "", firstName = "", lastName = "", smokingStatus = "", fileInput = "";
         double height = 0.0, weight = 0.0;

         int smokerCount = 0, nonSmokerCount = 0;

         // Create ArrayList to store Policy objects
         ArrayList<Policy> policies = new ArrayList<Policy>();

         // Read file
         while(inputFile.hasNext())
         { // open loop

            // Read data
            fileInput = inputFile.nextLine();
            policyNumber = Integer.parseInt(fileInput);

            providerName = inputFile.nextLine();
            firstName = inputFile.nextLine();
            lastName = inputFile.nextLine();

            fileInput = inputFile.nextLine();
            age = Integer.parseInt(fileInput);

            smokingStatus = inputFile.nextLine();

            fileInput = inputFile.nextLine();
            height = Double.parseDouble(fileInput);

            fileInput = inputFile.nextLine();
            weight = Double.parseDouble(fileInput);

            // Skip blank line if not end of file
            if(inputFile.hasNext())
            {
               inputFile.nextLine();
            }

            // Create Policy object
            Policy p = new Policy(policyNumber, providerName, firstName,
                                  lastName, age, smokingStatus,
                                  height, weight);

            // Add to ArrayList
            policies.add(p);

         } // close loop

         inputFile.close();

         // Display data using indexed loop 
         for(int i = 0; i < policies.size(); i++)
         {
            System.out.println("\nPolicy Number: " + policies.get(i).getPolicyNumber());
            System.out.println("\nProvider Name: " + policies.get(i).getProviderName());
            System.out.println("\nPolicyholder’s First Name: " + policies.get(i).getFirstName());
            System.out.println("\nPolicyholder’s Last Name: " + policies.get(i).getLastName());
            System.out.println("\nPolicyholder’s Age: " + policies.get(i).getAge());
            System.out.println("\nPolicyholder’s Smoking Status (smoker/non-smoker): "
                                + policies.get(i).getSmokingStatus());
            System.out.println("\nPolicyholder’s Height: " + policies.get(i).getHeight() + " inches");
            System.out.println("\nPolicyholder’s Weight: " + policies.get(i).getWeight() + " pounds");

            System.out.printf("\nPolicyholder’s BMI: %.2f\n",
                              policies.get(i).calculateBMI());

            System.out.printf("\nPolicy Price: $%.2f\n",
                              policies.get(i).calculatePolicyPrice());

            System.out.println();

            // Count smokers
            if(policies.get(i).getSmokingStatus().equalsIgnoreCase("smoker"))
               smokerCount++;
            else
               nonSmokerCount++;
         }

         // Print output
         System.out.println("The number of policies with a smoker is: " + smokerCount);
         System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);

      } // close try

      catch(IOException ex)
      {
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }

   } // close main

} // close class