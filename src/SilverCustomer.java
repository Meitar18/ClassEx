public class SilverCustomer extends Customer{

    public SilverCustomer(int id, String name) {
        super(id, name);
    }

    @Override
    public double getPriceForProduct(double fullprice) {
       if (fullprice>500) {
           return fullprice * 0.85;
       } else
               return fullprice;
       }
    }

