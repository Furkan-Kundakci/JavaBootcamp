public class Main {

    public static void main(String[] args) {
        int[] numbers = {1,4,2,7,3,9};
        int wanted = 9;
        boolean isThere = false;

        for (int number : numbers){
            if (number == wanted){
                isThere = true;
            }
        }

        if (isThere){
            System.out.println("Aranan deger mevcut");
        } else {
            System.out.println("Aranan deger bulunamadı");
        }
    }
}
