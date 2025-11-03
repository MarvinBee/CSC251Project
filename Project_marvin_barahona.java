import java.util.Scanner;

public class Project_marvin_barahona
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int policyNum, policyholderAge;
      String providerName, policyholderFirstN, policyholderLastN, policyholderIsSmoking;
      double policyholderHeight, policyholderWeight;
      
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
     
      
   }
}
