public class Main {
    public static void main(String[] args) {
        int toplam = 0;
        for (int i =1; i <=20; i++) {
            if (i%2==0) {
                toplam += Math.pow(i, 3);
            }
        }
        System.out.println("1'den 20'ye kadar çift sayıların küpleri toplamı: " + toplam);
    }
}