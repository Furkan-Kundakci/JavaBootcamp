public class Main {

    public static void main(String[] args) {
        int numberOne = 120, numberTwo = 284, totalOne = 0, totalTwo = 0;

        for (int i = 1; i < numberOne; i++) {
            if (numberOne % i == 0) {
                totalOne += i;
            }
        }

        for (int i = 1; i < numberTwo; i++) {
            if (numberTwo % i == 0) {
                totalTwo += i;
            }
        }

        if (totalOne == numberTwo && totalTwo == numberOne) {
            System.out.println("Bu sayılar arkadaş sayılardır.");
        } else {
            System.out.println("Bu sayılar arkdaş sayı degildir.");
        }
    }
}
