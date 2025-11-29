public class Policy
{
   private int policyNum;
   private String providerName;
   
   
   
   // no-arg constructor 
   public Policy()
   {
      policyNum = 0;
      providerName = "default";
      /*
      policyholderFirstN = "default";
      policyholderLastN = "default";
      policyholderAge = 0;
      policyholderIsSmoking = "default";
      policyholderHeight = 0.0;
      policyholderWeight = 0.0;
      */
   }
   
   // full-arg constructor
   public Policy(int num1, String name1) // String name2, String name3, int num2, String isSmoker, double num3, double num4)
   {
      policyNum = num1;
      providerName = name1;
      /*
      policyholderFirstN = name2;
      policyholderLastN = name3;
      policyholderAge = num2;
      policyholderIsSmoking = isSmoker;
      policyholderHeight = num3;
      policyholderWeight = num4;
      */
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
}