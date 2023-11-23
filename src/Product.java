public interface Product {
    void displayInfo();
    double calculateShippingCost(double distance, int serialNumber);
    default void isNotFreeShipping(){
        System.out.println("\nOkay, but shipping is not free!");
    }
    double discountPrice(double priceWithShipping);


}
