public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Interface");
        CustomerMenager customerMenager = new CustomerMenager(new MySqlCustomerDal());
        customerMenager.add();


    }
}