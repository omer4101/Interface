public class OracleCustomerDal implements ICustomerDal,IRepository{
    @Override
    public void Add() {
        System.out.println("OracleCustomerDal Added.");
    }
    public void Update(){
        System.out.println("OracleCustomerDal Updated.");
    };

}
