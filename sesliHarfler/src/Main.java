public class Main {

    public static void main(String[] args) {
        char character = 'E';
        char[] vowels = {'A','E','I','İ','O','Ö','U','Ü'};
        boolean check = false;

        for (char characterControl : vowels){
            if (characterControl == character){
                check = true;
            }
        }

        if (check){
            switch (character){
                case 'A':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println("Kalın sesli harfler");
                    break;
                default:
                    System.out.println("İnce sesli harfler");

            }
        }else{
            System.out.println("Geçersiz harf girişi.");
        }

    }
}
