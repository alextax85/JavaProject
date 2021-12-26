public class main {
    public static void main(String[] args) {
        int bonus ;
        int discount = 15;
        int purchaseItem = 5;
        int limit = 3;
        bonus = purchaseItem > limit ? discount : 0;
        System.out.println("Your discount is " + bonus + "");
    }
}
