package pmj.dataset.datasetbankaccount;

public class DataSet{
   
    public DataSet()
   {
      sum = 0;
      count = 0;
      maximum = null;
   }

   public void add(BankAccount x) {
      sum = sum + x.getBalance();
      if (count == 0 || maximum.getBalance() < x.getBalance())
         maximum = x;
      count ++;
   }

   public BankAccount getMaximum() {
      return maximum;
   }
   public double getAverage()
   {
      if (count == 0) return 0;
      else return sum / count;
   }

   private double sum;
   private BankAccount maximum;
   private int count;

}
