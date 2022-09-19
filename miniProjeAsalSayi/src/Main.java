public class Main {

    public static void main(String[] args) {
        int number = 1;
        boolean isPrime = true;
        if (number < 1) {
            System.out.println("Geçersiz sayı girişi");
        } else if (number == 1) {
            System.out.println("1 Sayısı asal degildir");
        } else {
            for (int i = 1; i < number; i++) {
                if (number % i == 0 && i != 1) {
                    isPrime = false;
                }
            }
            if (isPrime == false) {
                System.out.println(number + " Sayısı asal degildir.");
            } else {
                System.out.println(number + " Sayısı asaldır.");
            }
        }
    }
}
