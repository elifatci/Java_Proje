package Proje1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giyim {
    /*

==================== WISE T127 MARKET ===================================

1 GİYİM ÜRÜNLERİ

*/

    static boolean urun = false;
    static int urunKodu;
    static double urunFiyati;
    static int urunMiktari;
    static int secim;
    static String urunAdi;
    static double toplam;
    static int sayac=0;

    static Scanner scanner = new Scanner(System.in);
    static List<String> sepet = new ArrayList<>();

    public static void main(String[] args) {
        giris();
    }

    public static void giris() {
        System.out.println("==================== WISE T127 MARKET ===================================");
        System.out.println("================== H O Ş G E L D İ N İ Z  =================================");
        System.out.println("Giyim reyonumuza gitmek icin 3'e basiniz");
        secim = scanner.nextInt();
        if (secim == 3) {
            giyim();
        } else {
            System.out.println("Yanlis giris yaptiniz! Giyim reyonumuza gitmek icin 3'e basiniz ");
        }
    }

    public static void giyim() {
        System.out.println("Giyim Reyonumuza ----- H O S G E L D İ N İ Z -----");
        System.out.println("Lütfen almak istediğiniz ürünün ürün kodunu giriniz!");
        System.out.println("Urun kodu:31 Cocuk Corabi Fiyatı:25₺ \nUrun kodu:32 Cocuk Camasiri Fiyatı:40₺ " +
                "\nUrun kodu:33 Bayan Pijama Fiyatı:115₺ \nUrun kodu:34 Erkek Pijama Fiyatı:100₺" +
                "\nUrun kodu:35 Sweatshirt Fiyati:100₺ \nUrun kodu:36 Canta Fiyati:150₺" +
                "\nUrun kodu:37 Bayan Pantolon Fiyatı: 150₺\nUrun kodu:38 Bayan Ayakkabi Fiyatı:100₺ " +
                "\nUrun kodu:39 Erkek Pantolon Fiyati:150₺ \nUrun kodu:40 Erkek Ayakkabi Fiyati:100₺");


        while (!urun) {
            urunKodu = scanner.nextInt();
            if (urunKodu > 30 && urunKodu < 41) {
                System.out.println("Kac adet alacaksiniz?");
                urunMiktari = scanner.nextInt();

                switch (urunKodu) {
                    case 31:
                        urunAdi = "Cocuk Corabi";
                        urunFiyati = 25;
                        System.out.println(urunMiktari + "tane " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 32:
                        urunAdi = "Cocuk Camasiri";
                        urunFiyati = 40;
                        System.out.println(urunMiktari + "tane " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 33:
                        urunAdi = "Bayan Pijama";
                        urunFiyati = 115;
                        System.out.println(urunMiktari + "tane " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 34:
                        urunAdi = "Erkek Pijama";
                        urunFiyati = 100;
                        System.out.println(urunMiktari + "tane " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 35:
                        urunAdi = "Sweatshirt";
                        urunFiyati = 100;
                        System.out.println(urunMiktari + "tane " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 36:
                        urunAdi = "Canta";
                        urunFiyati = 150;
                        System.out.println(urunMiktari + "tane" + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 37:
                        urunAdi = "Bayan Pantolon";
                        urunFiyati = 150;
                        System.out.println(urunMiktari + "tane " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 38:
                        urunAdi = "Bayan Ayakkabi";
                        urunFiyati = 100;
                        System.out.println(urunMiktari + "tane " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 39:
                        urunAdi = "Erkek Pantolon";
                        urunFiyati = 150;
                        System.out.println(urunMiktari + "tane " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 40:
                        urunAdi = "Erkek Ayakkabi";
                        urunFiyati = 100;
                        System.out.println(urunMiktari + "tane " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                }

                urunFiyati = urunMiktari * urunFiyati;
                toplam += urunFiyati;
                sepet.add((sepet.size() + 1) + ". urun: " + urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati + " Tl'dir");
                System.out.println("Aldiginiz urunlerin fiyati: " + toplam);
                System.out.println("Baska bir urun almak isterseniz lutfen kodunu giriniz. \nCikis yapmak icin 0'a basiniz");
                sayac++;
                for (int i = 0; i <sayac; i++) {
                    System.out.println("Giyim Reyonu sepetiniz: " + sepet.get(i));
                }
            } else if (urunKodu == 0) {
                cikis();

            } else {
                System.out.println("Yanlis giris yaptiniz! Lutfen tekrar deneyiniz");
            }

        }
    }

    public static void cikis() {
        System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz!");
        System.out.println("----------------Cikis Yapiliyor----------------");
        System.exit(0);
    }
}
