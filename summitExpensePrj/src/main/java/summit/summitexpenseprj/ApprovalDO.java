package summit.summitexpenseprj;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ApprovalDO implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String name;
   private java.lang.String amount;
   private java.lang.String reason;
   private java.lang.String appPriority;

   public ApprovalDO()
   {
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public java.lang.String getAmount()
   {
      return this.amount;
   }

   public void setAmount(java.lang.String amount)
   {
      this.amount = amount;
   }

   public java.lang.String getReason()
   {
      return this.reason;
   }

   public void setReason(java.lang.String reason)
   {
      this.reason = reason;
   }

   public java.lang.String getAppPriority()
   {
      return this.appPriority;
   }

   public void setAppPriority(java.lang.String appPriority)
   {
      this.appPriority = appPriority;
   }

   public ApprovalDO(java.lang.String name, java.lang.String amount,
         java.lang.String reason, java.lang.String appPriority)
   {
      this.name = name;
      this.amount = amount;
      this.reason = reason;
      this.appPriority = appPriority;
   }

}