public class Policy
// open the class
{
   
   // fields
   
   private int policyNum;
   private String providerName;
   private static int instanceCount = 0;
   private PolicyHolder policyholder; // instance of the policyholder class.
 
 
   // full-arg constructor
   public Policy(int num1, String name1, PolicyHolder policyhldr)
   {
      policyNum = num1;
      providerName = name1;
      policyholder = new PolicyHolder(policyhldr); // creates a copy of the policyholder object to minimize security holes.
      instanceCount++;
   } 
   
   
   /* getObjectCount method displays the number of instances
   */
   public static void getObjectCount()
   {
      System.out.println("There were " + instanceCount + " Policy objects created.\n");
   }
   
   
   /* 
      setPolicyNumber method sets the number of the policy.
      @param num1 - policy number.
   */
   public void setPolicyNumber(int num1)
   {
      policyNum = num1;
   }
   
   /*
      getPolicyNumber method returns the policy number.
      @return - The policy number
   */
   public int getPolicyNumber()
   {
      return policyNum;
   }
   
   /* 
      setProviderName method sets the name of the provider.
      @param name1 - provider name.
   */
   public void setProviderName(String name1)
   {
      providerName = name1;
   }
   
   /*
      getProviderName method returns the name of the provider.
      @return - The name of the provider.
   */
   public String getProviderName()
   {
      return providerName;
   } 
   
   /*
      getPolicyHolder method
      @return - a copy of the policyholder object.
   */
   
   public PolicyHolder getPolicyHolder()
   {
      return new PolicyHolder(policyholder); // returns a copy
   }
   
   
   /*
      toString method returns and displays policyNum and ProviderName properly.
      @return The proper display of policyNum and ProviderName.
   */
   public String toString()
   {
      String str = "\nPolicy Number: " + policyNum + "\nProvider Name: " + providerName;
      return str;
   }
   
   
}