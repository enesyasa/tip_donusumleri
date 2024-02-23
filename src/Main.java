import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner sınıfını kullanarak kullanıcıdan giriş alın
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan tam sayı girişini isteyin
        System.out.print("Lütfen bir tam sayı giriniz: ");
        int tamSayi = scanner.nextInt();

        // Kullanıcıdan ondalıklı sayı girişini isteyin
        System.out.print("Lütfen bir ondalıklı sayı giriniz: ");
        double ondalikliSayi = scanner.nextDouble();

        // Tip dönüşümlerini uygula
        double tamSayiToDouble = (double) tamSayi;
        int ondalikliSayiToInt = (int) ondalikliSayi;

        // Sonuçları ekrana yazdır
        System.out.println("Tam Sayı: " + tamSayi);
        System.out.println("Ondalıklı Sayı: " + ondalikliSayi);
        System.out.println("Tam Sayıyı Ondalıklı Sayıya Dönüştür: " + tamSayiToDouble);
        System.out.println("Ondalıklı Sayıyı Tam Sayıya Dönüştür: " + ondalikliSayiToInt);


    }
}
