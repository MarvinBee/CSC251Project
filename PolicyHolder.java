

public class PolicyHolder
{
   private String policyholderFirstN;
   private String policyholderLastN;
   private int policyholderAge;
   private String policyholderIsSmoking;
   private double policyholderHeight;
   private double policyholderWeight;
   
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
   
   /*
      toString method returns and displays policyholderFirstN, policyholderLastN, policyholderAge, policyholderIsSmoking, policyholderHeight, and policyholderWeight properly.
      @return The proper display of all the fields in the PolicyHolder class.
   */
   public String toString()
   {
      String str = "Policyholder's First Name: " + policyholderFirstN + "\nPolicyholder's Last Name: " + policyholderLastN + "\nPolicyholder's Age:" + policyholderAge + "\nPolicyholder's Smoking Status (Y/N): " + policyholderIsSmoking + "\nPolicyholder's Height: " + policyholderHeight + "\nPolicyholder's Weight: " + policyholderWeight + "\nPolicyholder's BMI: " + this.getBMI() + "\nPolicy Price: $" + this.getPolicyPrice(this.getBMI());
      return str;
   }
}