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
   
   // policyNum methods
   public void setPolicyNumber(int num1)
   {
      policyNum = num1;
   }
   
   public int getPolicyNumber()
   {
      return policyNum;
   }
   
   // providerName methods
   public void setProviderName(String name1)
   {
      providerName = name1;
   }
   
   public String getProviderName()
   {
      return providerName;
   }
   
   // policyholderFirstN methods
   public void setPolicyholderFirstName(String name1)
   {
      policyholderFirstN = name1;
   }
   
   public String getPolicyholderFirstName()
   {
      return policyholderFirstN;
   }
   
   // policyholderLastN methods
   public void setPolicyholderLastName(String name1)
   {
      policyholderLastN = name1;
   }
   
   public String getPolicyholderLastName()
   {
      return policyholderLastN;
   }
   
   // policyholderAge methods
   public void setPolicyholderAge(int num1)
   {
      policyholderAge = num1;
   }
   
   public int getPolicyholderAge()
   {
      return policyholderAge;
   }
   
   // policyholderIsSmoking methods
   public void setPolicyholderIsSmoking(String isSmoker)
   {
      policyholderIsSmoking = isSmoker;
   }
   
   public String getPolicyholderIsSmoking()
   {
      return policyholderIsSmoking;
   }
   
   // policyholderHeight methods
   public void setPolicyholderHeight(double num1)
   {
      policyholderHeight = num1;
   }
   
   public double getPolicyholderHeight()
   {
      return policyholderHeight;
   }
   
   // policyholderWeight methods
   public void setPolicyholderWeight(double num1)
   {
      policyholderWeight = num1;
   }
   
   public double getPolicyholderWeight()
   {
      return policyholderWeight;
   }
   
   
   // BMI calculator method
   public double getBMI()
   {
      double bmi;
      bmi = (policyholderWeight * 703) / (Math.pow(policyholderHeight, 2));
      return bmi;
   }
   
   
   // insurance policy price calculator method
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