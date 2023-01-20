import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws BinaryException {

        Scanner sc = new Scanner(System.in);
        int sayi = sc.nextInt();

        if(sayi % 10 == 0 || sayi % 10 == 1) {
            throw new BinaryException("Birler basamagi 0 veya 1");
        } else {
            System.out.println("Sayida sorun yok");
        }
    }
}

class BinaryException extends Exception {
    String hata;
    BinaryException(String hata){
        this.hata = hata;
    }
}