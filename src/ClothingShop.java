public class ClothingShop implements Product{
    private double tShirt;
    private double jeans;
    private double underWear;
    private double coat;

    public ClothingShop(double tShirt, double jeans, double underWear, double coat) {
        this.tShirt = tShirt;
        this.jeans = jeans;
        this.underWear = underWear;
        this.coat = coat;
    }

    @Override
    public void displayInfo() {
        System.out.print("\nWelcome to the Clothing Shop!" +
                "\nHere is the price list of our items:" +
                "\n1.T-Shirt - " + tShirt +
                "\n2.Jeans - " + jeans +
                "\n3.Under Wear - " + underWear +
                "\n4.Coat - " + coat +
                "\nIf you'd like to order smth from the list, put the serial number of the item:");
    }

    @Override
    public double calculateShippingCost(double distance, int serialNumber) {
        switch (serialNumber){
            case 1:
                return tShirt + (distance / 100);
            case 2:
                return jeans + (distance / 100);
            case 3:
                return underWear + (distance / 100);
            case 4:
                return coat + (distance / 100);
            default:
                return 0;
        }
    }

    @Override
    public double discountPrice(double priceWithShipping) {
        return priceWithShipping - (priceWithShipping / 100 * 10);
    }
}
