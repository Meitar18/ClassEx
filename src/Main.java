import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<ICustomer> customerList = new ArrayList<>();
        customerList.add(new StandartCustomer( 1,"cust1"));
        customerList.add(new StandartCustomer( 2,"cust1"));
        customerList.add(new GoldCustomer( 3,"cust1"));
        customerList.add(new StandartCustomer( 4,"cust1"));
        customerList.add(new StandartCustomer( 5,"cust1"));
        customerList.add(new SilverCustomer( 6,"cust1"));
        customerList.add(new StandartCustomer( 7,"cust1"));
        customerList.add(new StandartCustomer( 8,"cust1"));
        customerList.add(new StandartCustomer( 9,"cust1"));
        customerList.add(new StandartCustomer( 10,"cust1"));

        for (ICustomer customer : customerList) {
            System.out.println("Name: " + customer.getCustomerName() + " 300: " + customer.getPriceForProduct(300) + " 3800 " + customer.getPriceForProduct(3800) );
        }

    }
}