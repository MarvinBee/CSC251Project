import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;


public class Project_marvin_barahona
{
   public static void main(String[] args) throws IOException
   {
      
      // creates the list of policy objects.
      var policyObjList = new ArrayList<Policy>();
      
      // opens and processes the policyinformation.txt file
      File policyInfo = new File("PolicyInformation.txt");
      
      Scanner inputFile = new Scanner(policyInfo); // "open"
      
      int policyNum, policyholderAge, totalSmokers = 0, totalNonSmokers = 0;
      String providerName, policyholderFirstN, policyholderLastN, policyholderIsSmoking;
      double policyholderHeight, policyholderWeight;
      
      // the loop that processes all the information of the file, and sets each list to its own object.
      while(inputFile.hasNext())
      {
         
         policyNum = inputFile.nextInt();
         inputFile.nextLine();
         providerName = inputFile.nextLine();
         policyholderFirstN = inputFile.nextLine();
         policyholderLastN = inputFile.nextLine();
         policyholderAge = inputFile.nextInt();
         inputFile.nextLine();
         policyholderIsSmoking = inputFile.nextLine();
         policyholderHeight = inputFile.nextDouble();
         policyholderWeight = inputFile.nextDouble();
         
         // creates an object and adds it to the list.
         policyObjList.add (new Policy(policyNum, providerName, policyholderFirstN, policyholderLastN, policyholderAge, policyholderIsSmoking, policyholderHeight, policyholderWeight));
         
         // checks if theirs more space
         if(inputFile.hasNext())
            inputFile.nextLine(); // clear the newline
         if(inputFile.hasNext())
            inputFile.nextLine(); // skip the blank
                  
      }
      
      // for loop that goes through each policy object in the list.
      for (int index = 0; index < policyObjList.size(); index++)
      {
         String tempSmokerStatus;
         final String SMOKER = "smoker";
         final String NONSMOKER = "non-smoker";
         
         // gets the object at the index and sets it to a new object.
         Policy policyObj = policyObjList.get(index);
         
         // gets the number of smokers and non-smokers
         tempSmokerStatus = policyObj.getPolicyholderIsSmoking();
         if (tempSmokerStatus.equals(SMOKER))
         {
            totalSmokers++;
         }
         else if (tempSmokerStatus.equals(NONSMOKER))
         {
            totalNonSmokers++;
         }
         
         // displays the information
         System.out.println("Policy Number: " + policyObj.getPolicyNumber());
         System.out.println("Provider Name: " + policyObj.getProviderName());
         System.out.println("Policyholder's First Name: " + policyObj.getPolicyholderFirstName());
         System.out.println("Policyholder's Last Name: " + policyObj.getPolicyholderLastName());
         System.out.println("Policyholder's Age: " + policyObj.getPolicyholderAge());
         System.out.println("Policyholder's Smoking Status: " + policyObj.getPolicyholderIsSmoking());
         System.out.printf("Policyholder's Height: %.1f inches\n", policyObj.getPolicyholderHeight());
         System.out.printf("Policyholder's Weight: %.1f pounds\n", policyObj.getPolicyholderWeight());
         System.out.printf("Policyholder's BMI: %.2f\n", policyObj.getBMI());
         System.out.printf("Policy Price: $%.2f\n\n", policyObj.getPolicyPrice(policyObj.getBMI()));
      
      }
      
      // displays the number of smokers and non-smokers.
      System.out.println("The number of policies with a smoker is: " + totalSmokers);
      System.out.println("The number of policies with a non-smoker is: " + totalNonSmokers);
      
      inputFile.close(); // close the file
   }
}
