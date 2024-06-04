package lab2.problem1;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Nan","Shawng","2222");
        Customer customer2 = new Customer("Ja","Nan","2222");
        Customer customer3 = new Customer("Jumwu","Awng","2222");
        Address address1 = new Address("22","Chicago","Illinois","1011");
        Address address2 = new Address("22","New York","New York","1011");
        customer1.setBillingAddress(address1);
       // customer1.setShippingAddress(address1);
       // customer2.setBillingAddress(address1);
        customer2.setShippingAddress(address1);
        customer3.setBillingAddress(address2);
        customer3.setShippingAddress(address2);
        Customer[] customerArray = new Customer[3];
        customerArray[0] = customer1;
        customerArray[1] = customer2;
        customerArray[2] = customer3;
        for (Customer customer : customerArray){
            if (customer.getBillingAddress() != null &&
                    customer.getBillingAddress().getCity() != null &&
            customer.getBillingAddress().getCity().equals("Chicago")){
                System.out.println(customer);
            }
        }
    }
}
