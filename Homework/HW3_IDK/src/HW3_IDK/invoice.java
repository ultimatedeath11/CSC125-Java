public class invoice
{
  private String partNum;
  private double quanpurcashed;
  private double invoiceamount;
  private double price;
  private String partinfo;

  public void setpartNumb(string partNum){
    this.name = partNum;
    //the above name may be incorrect
  }

  public String getpartNum(){
    return partNum;
  }

  public void setpartinfo(String){
    this.name = partinfo;
  }

  public String getpartinfo(){
    return partinfo;
  }

  public void setquanpurchased(double quanpurcashed){
    this.name = quanpurcashed;
  }

  public setquanpurcashed(){
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
