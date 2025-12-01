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
         
         // creates a policyholder object
         PolicyHolder thisholder = new PolicyHolder(policyholderFirstN, policyholderLastN, policyholderAge, policyholderIsSmoking, policyholderHeight, policyholderWeight);
         
         // creates a policy object and adds it to the list.
         policyObjList.add (new Policy(policyNum, providerName, thisholder));
         
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
         PolicyHolder tempPolicyHldr; // temporary policyholder object
         
         // gets the object at the index and sets it to a new object.
         Policy policyObj = policyObjList.get(index);
         
         // creates a copy of the policyholder object
         tempPolicyHldr = policyObj.getPolicyHolder();
         
         // gets the number of smokers and non-smokers
         tempSmokerStatus = tempPolicyHldr.getPolicyHolderIsSmoking();
         if (tempSmokerStatus.equals(SMOKER))
         {
            totalSmokers++;
         }
         else if (tempSmokerStatus.equals(NONSMOKER))
         {
            totalNonSmokers++;
         }
         
         // displays the information
         System.out.println(policyObj);
         System.out.println(tempPolicyHldr);
      }
      
      
      
      // displays the number of instances
      Policy.getObjectCount();
      
      // displays the number of smokers and non-smokers.
      System.out.println("The number of policies with a smoker is: " + totalSmokers);
      System.out.println("The number of policies with a non-smoker is: " + totalNonSmokers);
      
      inputFile.close(); // close the file
   }
}
