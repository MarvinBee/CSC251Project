public class Policy
{
   private int policyNum;
   private String providerName;
   private static int instanceCount = 0;
 
 
   // no-arg constructor 
   public Policy()
   {
      policyNum = 0;
      providerName = "default";
      instanceCount++;
   }
   
   // full-arg constructor
   public Policy(int num1, String name1)
   {
      policyNum = num1;
      providerName = name1;
      instanceCount++;
   }
   
   
   /* 
      setPolicyNumber method sets the number of the policy.
      @param num1 The policy number.
   */
   public void setPolicyNumber(int num1)
   {
      policyNum = num1;
   }
   
   /*
      getPolicyNumber method returns the policy number.
      @return The policy number
   */
   public int getPolicyNumber()
   {
      return policyNum;
   }
   
   /* 
      setProviderName method sets the name of the provider.
      @param name1 The name of the provider.
   */
   public void setProviderName(String name1)
   {
      providerName = name1;
   }
   
   /*
      getProviderName method returns the name of the provider.
      @return The name of the provider.
   */
   public String getProviderName()
   {
      return providerName;
   } 
   
   /*
      toString method returns and displays policyNum and ProviderName properly.
      @return The proper display of policyNum and ProviderName.
   */
   public String toString()
   {
      String str = "Policy Number: " + policyNum + "\nProvider Name: " + providerName;
      return str;
   }
   
   
}