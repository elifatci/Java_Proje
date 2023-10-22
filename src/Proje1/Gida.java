package Proje1;

import java.util.Scanner;

public class Gida {
      /*

==================== WISE T127 MARKET ===================================

1 GİDA ÜRÜNLERİ

*/

    static boolean urun = false;
    static int urunKodu;
    static double urunFiyati;
    static int urunMiktari;
    static int secim;
    static String urunAdi;
    static double toplam;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        giris();
    }

    public static void giris() {
        System.out.println("==================== WISE T127 MARKET ===================================");
        System.out.println("================== H O Ş G E L D İ N İ Z  =================================");
        System.out.println("Gida reyonumuza gitmek icin 5'e basiniz");
        secim = scanner.nextInt();
        if (secim == 5) {
            gida();
        } else {
            System.out.println("Yanlis giris yaptiniz! Giyim reyonumuza gitmek icin 3'e basiniz ");
        }
    }

    public static void gida() {
        System.out.println("Gida Reyonumuza ----- H O S G E L D İ N İ Z -----");
        System.out.println("Lütfen almak istediğiniz ürünün ürün kodunu giriniz!");
        System.out.println("Urun kodu:51 Fasulye Fiyatı:75₺ \nUrun kodu:52 Nohut Fiyatı:60₺ " +
                "\nUrun kodu:53 Makarna Fiyatı:30₺ \nUrun kodu:54 Salca Fiyatı:55₺" +
                "\nUrun kodu:55 Tursu Fiyati:45₺ \nUrun kodu:56 Cay Fiyati:85₺" +
                "\nUrun kodu:57 Seker Fiyatı:80₺\nUrun kodu:58 Cikolata Fiyatı:100₺ ");

        while (!urun) {
            urunKodu = scanner.nextInt();
            if (urunKodu >= 51 && urunKodu <= 58) {
                System.out.print("Kaç kg/adet alacaksınız: ");
                urunMiktari = scanner.nextInt();
                switch (urunKodu) {
                    case 51:
                        urunAdi = "Fasulye";
                        urunFiyati = 75;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 52:
                        urunAdi = "Nohut";
                        urunFiyati = 60;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 53:
                        urunAdi = "Makarna";
                        urunFiyati = 30;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 54:
                        urunAdi = "Salca";
                        urunFiyati = 55;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 55:
                        urunAdi = "Tursu";
                        urunFiyati = 45;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 56:
                        urunAdi = "Cay";
                        urunFiyati = 85;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 57:
                        urunAdi = "Seker";
                        urunFiyati = 80;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 58:
                        urunAdi = "Cikolata";
                        urunFiyati = 100;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    default:

                }
                urunFiyati = urunMiktari * urunFiyati;
                toplam += urunFiyati;
                System.out.println("Aldiginiz urunlerin fiyati: " + toplam);
                System.out.println("Baska bir urun almak isterseniz lutfen kodunu giriniz. \nCikis yapmak icin 0'a basiniz");
            } else if (urunKodu == 0) {
                cikis();

            } else {
                System.out.println("Yanlis giris yaptiniz! Lutfen tekrar deneyiniz");
            }
        }
    }
    public static void cikis(){
        System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz!");
        System.out.println("----------------Cikis Yapiliyor----------------");
        System.exit(0);
    }
}
