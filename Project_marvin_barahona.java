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
      
      int policyNum, policyholderAge;
      String providerName, policyholderFirstN, policyholderLastN, policyholderIsSmoking;
      double policyholderHeight, policyholderWeight;
      
      // the loop that processes all the information of the file, and sets each list to its own object.
      while(inputFile.hasNext())
      {
         
         policyNum = inputFile.nextInt();
         providerName = inputFile.nextLine();
         policyholderFirstN = inputFile.nextLine();
         policyholderLastN = inputFile.nextLine();
         inputFile.nextLine(); // had problems here, maybe nextInt wasn't going down the line?
         policyholderAge = inputFile.nextInt();
         policyholderIsSmoking = inputFile.nextLine();
         inputFile.nextLine(); // same as above
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
      
      /* old demo program (saved for future use)
      System.out.println("Please enter the Policy Number: ");
      policyNum = input.nextInt();
      input.nextLine();
      
      System.out.println("Please enter the Provider Name: ");
      providerName = input.nextLine();
      
      System.out.println("Please enter the Policyholder's First Name: ");
      policyholderFirstN = input.nextLine();
      
      System.out.println("Please enter the Policyholder's Last Name: ");
      policyholderLastN = input.nextLine();
      
      System.out.println("Please enter the Policyholder's Age: ");
      policyholderAge = input.nextInt();
      input.nextLine();
      
      System.out.println("Please enter the Policyholder's smoking status (smoker/non-smoker): ");
      policyholderIsSmoking = input.nextLine();
      
      System.out.println("Please enter the Policyholder's height (in inches): ");
      policyholderHeight = input.nextDouble();
      input.nextLine();
      
      System.out.println("Please enter the Policyholder's Weight (in pounds): ");
      policyholderWeight = input.nextDouble();
      input.nextLine();
      
      Policy userPolicy = new Policy(policyNum, providerName, policyholderFirstN, policyholderLastN, policyholderAge, policyholderIsSmoking, policyholderHeight, policyholderWeight);
      
      System.out.println("----------------------------------------------------------------");
      System.out.println("Policy Number: " + userPolicy.getPolicyNumber());
      System.out.println("Provider Name: " + userPolicy.getProviderName());
      System.out.println("Policyholder's First Name: " + userPolicy.getPolicyholderFirstName());
      System.out.println("Policyholder's Last Name: " + userPolicy.getPolicyholderLastName());
      System.out.println("Policyholder's Age: " + userPolicy.getPolicyholderAge());
      System.out.println("Policyholder's Smoking Status: " + userPolicy.getPolicyholderIsSmoking());
      System.out.printf("Policyholder's Height: %.1f inches\n", userPolicy.getPolicyholderHeight());
      System.out.printf("Policyholder's Weight: %.1f pounds\n", userPolicy.getPolicyholderWeight());
      System.out.printf("Policyholder's BMI: %.2f\n", userPolicy.getBMI());
      System.out.printf("Policy Price: $%.2f", userPolicy.getPolicyPrice(userPolicy.getBMI()));
      
      */
      
   }
}
