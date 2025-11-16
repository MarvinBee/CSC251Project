public class Policy
{
   private int policyNum;
   private String providerName;
   private String policyholderFirstN;
   private String policyholderLastN;
   private int policyholderAge;
   private String policyholderIsSmoking;
   private double policyholderHeight;
   private double policyholderWeight;
   
   
   // no-arg constructor 
   public Policy()
   {
      policyNum = 0;
      providerName = "default";
      policyholderFirstN = "default";
      policyholderLastN = "default";
      policyholderAge = 0;
      policyholderIsSmoking = "default";
      policyholderHeight = 0.0;
      policyholderWeight = 0.0;
   }
   
   // full-arg constructor
   public Policy(int num1, String name1, String name2, String name3, int num2, String isSmoker, double num3, double num4)
   {
      policyNum = num1;
      providerName = name1;
      policyholderFirstN = name2;
      policyholderLastN = name3;
      policyholderAge = num2;
      policyholderIsSmoking = isSmoker;
      policyholderHeight = num3;
      policyholderWeight = num4;
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
      setPolicyholderFirstName method sets the first name of the policyholder.
      @param name1 The first name of the policyholder.
   */
   public void setPolicyholderFirstName(String name1)
   {
      policyholderFirstN = name1;
   }
   
   /*
      getPolicyholderFirstName method returns the first name of the policyholder.
      @return The first name of the policyholder.
   */
   public String getPolicyholderFirstName()
   {
      return policyholderFirstN;
   }
   
   /* 
      setPolicyholderLastName method sets the last name of the policyholder.
      @param name1 The last name of the policyholder.
   */
   public void setPolicyholderLastName(String name1)
   {
      policyholderLastN = name1;
   }
   
   /*
      getPolicyholderLastName method returns the last name of the policyholder.
      @return The last name of the policyholder.
   */
   public String getPolicyholderLastName()
   {
      return policyholderLastN;
   }
   
   /* 
      setPolicyholderAge method sets the age of the policyholder.
      @param num1 The age of the policyholder.
   */
   public void setPolicyholderAge(int num1)
   {
      policyholderAge = num1;
   }
   
   /*
      getPolicyholderAge method returns the age of the policyholder.
      @return The age of the policyholder.
   */
   public int getPolicyholderAge()
   {
      return policyholderAge;
   }
   
   /* 
      setPolicyholderIsSmoking method sets the smoking status of the policyholder.
      @param isSmoker The smoking status of the policyholder. "smoker" or "non-smoker"
   */
   public void setPolicyholderIsSmoking(String isSmoker)
   {
      policyholderIsSmoking = isSmoker;
   }
   
   /*
      getPolicyholderIsSmoking method returns the smoking status of the policyholder.
      @return The smoking status of the policyholder. "smoker" or "non-smoker"
   */
   public String getPolicyholderIsSmoking()
   {
      return policyholderIsSmoking;
   }
   
   /* 
      setPolicyholderHeight method sets the height of the policyholder.
      @param num1 The height of the policyholder.
   */
   public void setPolicyholderHeight(double num1)
   {
      policyholderHeight = num1;
   }
   
   /*
      getPolicyholderHeight method returns the height of the policyholder.
      @return The height of the policyholder.
   */
   public double getPolicyholderHeight()
   {
      return policyholderHeight;
   }
   
   /* 
      setPolicyholderWeight method sets the weight of the policyholder.
      @param num1 The weight of the policyholder.
   */
   public void setPolicyholderWeight(double num1)
   {
      policyholderWeight = num1;
   }
   
   /*
      getPolicyholderWeight method returns the weight of the policyholder.
      @return The weight of the policyholder.
   */
   public double getPolicyholderWeight()
   {
      return policyholderWeight;
   }
   
   
   /* 
      getBMI method that calculates the bmi (Body Mass Index) of the policyholder.
      @return bmi The BMI (Body Mass Index) of the policyholder.
   */
   public double getBMI()
   {
      double bmi;
      bmi = (policyholderWeight * 703) / (Math.pow(policyholderHeight, 2));
      return bmi;
   }
   
   
   /* 
      getPolicyPrice method calculates the insurance price using policyholderAge, policyholderIsSmoking, and bmi.
      @param bmi The BMI of the policyholder.
      @return The insurance price.
   */
   public double getPolicyPrice(double bmi)
   {
      double price = 600;
      String smokerCheck = "smoker";
      if (policyholderAge > 50)
      {
         price = price + 75;
      }
      
      if (policyholderIsSmoking.equals(smokerCheck))
      {
         price = price + 100;
      }
      
      if (bmi > 35)
      {
         price = price + ((bmi - 35) * 20);
      }
      
      return price;
   }
}