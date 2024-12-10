public class GoldCustomer extends Customer{
    public GoldCustomer(int id, String name) {
        super(id, name);
    }

    @Override
    public double getPriceForProduct(double fullprice) {
        return fullprice*0.8;
    }
}
