/**
 * product
 */
public class product {

    public static void main(String[] args) {
        int item_price=100,itemb=45, itemc=500;
        double price;

        price =((item_price*200 +itemb)+itemc*3);
        price=price -(0.1*price);
        price +=(.5*price);

        System.out.println(price);

         if(price>1000)
          System.out.println("congrats you have a 25% coupon");
        else
         System.out.println("Thanks for shopping with us");
    }
}