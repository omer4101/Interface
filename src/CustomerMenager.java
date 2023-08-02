public class CustomerMenager {
    private ICustomerDal customerDal;
    public CustomerMenager(ICustomerDal customerDal){
        this.customerDal=customerDal;
    }

    void add(){
        customerDal.Add();
    };

}
