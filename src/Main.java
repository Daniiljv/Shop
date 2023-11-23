import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ElectronicShop electronicShop = new ElectronicShop(1299, 999, 299, 899);
        ClothingShop clothingShop = new ClothingShop(3, 5, 1, 12);

        int serialNumber; // Серийный номер товара
        double distance; // Как далеко находится клиент
        int answer; // Для ответа на вопрос о наличии промокода
        double priceWithShipping; // Цена товара с доставкой
        double finalPrice; // Цена товара со скидкой

        System.out.print("Hello. What what kind of the shop you need?" +
                "\n1.Electronic shop" +
                "\n2.Clothing shop" +
                "\nPut the serial number - ");
        int kindOfShop = scanner.nextInt();

        switch (kindOfShop){
            case 1:
                electronicShop.displayInfo();
                serialNumber = scanner.nextInt();

                electronicShop.isNotFreeShipping();
                System.out.print("\nSo, we need to know, how far are you?" +
                        "\nPut the distance - ");
                distance = scanner.nextInt();

                priceWithShipping = electronicShop.calculateShippingCost(distance,serialNumber);

                System.out.println("You need to pay - " + priceWithShipping + "$" +
                        "\nDo you know discount phrase?" +
                        "\n1.Yes" +
                        "\n2.No");
                answer = scanner.nextInt();
                switch (answer){
                    case 1:
                        System.out.print("Write the secret phrase - ");
                        String secretPhrase = scanner.next();
                        if (secretPhrase.equals("Discount") || secretPhrase.equals("discount")){
                            finalPrice = electronicShop.discountPrice(priceWithShipping);
                            System.out.println("Your final price with discount - " + finalPrice + "$" +
                                    "\nThank you for buying!");
                            break;
                        }
                        else {
                            System.out.println("You will not get a discount, you need to pay full sum - " +
                                    priceWithShipping + "$" +
                                    "\nThank you for buying!");
                            break;
                        }
                    case 2:
                        System.out.println("Okay, you need to pay - " + priceWithShipping + "$" +
                                "\nThank you for buying! " +
                                "\nBy the way, the secret phrase is (Discount or discount)");
                        break;
                }
                break;

            case 2:
                clothingShop.displayInfo();
                serialNumber = scanner.nextInt();

                clothingShop.isNotFreeShipping();
                System.out.print("\nSo, we need to know, how far are you?" +
                        "\nPut the distance - ");
                distance = scanner.nextInt();

                priceWithShipping = clothingShop.calculateShippingCost(distance,serialNumber);

                System.out.println("\nYou need to pay - " + priceWithShipping + "$" +
                        "\nDo you know discount phrase?" +
                        "\n1.Yes" +
                        "\n2.No");
                answer = scanner.nextInt();
                switch (answer){
                    case 1:
                        System.out.print("Write the secret phrase - ");
                        String secretPhrase = scanner.next();
                        if (secretPhrase.equals("Discount") || secretPhrase.equals("discount")){
                            finalPrice = clothingShop.discountPrice(priceWithShipping);
                            System.out.println("Your final price with discount - " + finalPrice + "$" +
                                    "\nThank you for buying!");
                            break;
                        }
                        else {
                            System.out.println("You will not get a discount, you need to pay full sum - " +
                                    priceWithShipping + "$ " +
                                    "\nThank you for buying!");
                            break;
                        }
                    case 2:
                        System.out.println("Okay, you need to pay - " + priceWithShipping + "$" +
                                "\nThank you for buying! " +
                                "\nBy the way, the secret phrase is (Discount or discount)");
                        break;
                }
                break;
            default:
                System.out.println("Wrong number of shop!");}
    }
}