import java.util.*;
import java.io.*;

public class Project_doruk_ilkilic
{
   public static void main(String[] args)
   {
      try
      {
         File file = new File("PolicyInformation.txt");
         Scanner inputFile = new Scanner(file);

         int policyNumber, age;
         String providerName, firstName, lastName, smokingStatus, fileInput;
         double height, weight;

         int smokerCount = 0, nonSmokerCount = 0;

         ArrayList<Policy> policies = new ArrayList<Policy>();

         // READ FILE
         while(inputFile.hasNext())
         {
            policyNumber = Integer.parseInt(inputFile.nextLine());
            providerName = inputFile.nextLine();
            firstName = inputFile.nextLine();
            lastName = inputFile.nextLine();
            age = Integer.parseInt(inputFile.nextLine());
            smokingStatus = inputFile.nextLine();
            height = Double.parseDouble(inputFile.nextLine());
            weight = Double.parseDouble(inputFile.nextLine());

            if(inputFile.hasNext())
               inputFile.nextLine(); // skip blank line

            //  CLASS COLLABORATION
            PolicyHolder holder = new PolicyHolder(firstName, lastName, age,
                                                   smokingStatus, height, weight);

            Policy policy = new Policy(policyNumber, providerName, holder);

            policies.add(policy);
         }

         inputFile.close();

         //  IMPLICIT toString CALL
         for(Policy p : policies)
         {
            System.out.println(p); // calls toString automatically
            System.out.println();

            //  COUNT SMOKERS USING POLICYHOLDER
            if(p.getPolicyHolder().getSmokingStatus().equalsIgnoreCase("smoker"))
               smokerCount++;
            else
               nonSmokerCount++;
         }

         // FINAL SUMMARY OUTPUT
         System.out.println("Number of Policy objects created: " + Policy.getPolicyCount());
         System.out.println("Number of Policyholders that are smokers: " + smokerCount);
         System.out.println("Number of Policyholders that are non-smokers: " + nonSmokerCount);
      }
      catch(IOException ex)
      {
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }
   }
}