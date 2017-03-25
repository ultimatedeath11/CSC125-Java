public class Invoice
{
  private String partNum;
  private double quanpurcashed;
  private double invoiceamount;
  private double price;
  private String partinfo;

  public void setpartNumb(String partNum){
    this.partNum = partNum;
    //the above name may be incorrect
  }

  public String getpartNum(){
    return partNum;
  }

  public void setpartinfo(String partinfo){
    this.partinfo = partinfo;
  }

  public String getpartinfo(){
    return partinfo;
  }

  public void setquanpurchased(double quanpurcashed){
    this.name = quanpurcashed;
  }

  public double getquanpurcashed(){
    return quanpurcashed;
  }

  public void setprice(double price){
    this.name = price;
  }

  public void setinvoice(){
    invoiceamount = quanpurcashed * price;
  }
  public Double getinvoice(){
    return invoiceamount;
  }

}
