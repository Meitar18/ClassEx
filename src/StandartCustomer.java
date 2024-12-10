public class StandartCustomer extends Customer{

    public StandartCustomer(int id, String name) {
        super(id, name);
    }

    @Override
    public double getPriceForProduct(double fullprice) {
        return fullprice;
    }
}
