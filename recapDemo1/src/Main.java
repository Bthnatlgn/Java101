public class Main {
    public static void main(String[] args) {

        int sayi1 = 25;
        int sayi2 = 100;
        int sayi3 = 31;
        int enBuyuk = sayi1;

        if (enBuyuk<sayi2){
            enBuyuk = sayi2;
        }

        if(enBuyuk<sayi3){
            enBuyuk = sayi3;
        }

        System.out.println("En büyük = "+enBuyuk);
    }
}