package Proje1;

import java.util.Scanner;

import static Proje1.Manav.manav;

public class Sarkuteri {
    /*

==================== WISE T127 MARKET ===================================

1 SARKUTERİ ÜRÜNLERİ

*/

    static int secim;
    static boolean urun = false;
    static int urunKodu;
    static int urunMiktari;
    static String urunAdi;
    static double urunFiyati;
    static double toplamFiyat = 0;
    static double toplam;
    static String sepet;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        giris();
    }

    public static void giris() {
        System.out.println("==================== WISE T127 MARKET ===================================");
        System.out.println("================== H O Ş G E L D İ N İ Z  =================================");
        System.out.println("Sarkuteri reyonumuza gitmek icin 2'ye basiniz");
        int secim = scanner.nextInt();
        if (secim == 2) {
            sarkuteri();
        } else {
            System.out.println("Yanlis giris yaptiniz Lutfen sarkuteri reyonu icin 2'ye basiniz");
        }
    }

    public static void sarkuteri() {
        System.out.println("Sarkuteri reyonumuza ----- H O S G E L D İ N İ Z -----");
        System.out.println("Lütfen almak istediğiniz ürünün ürün kodunu giriniz!");
        System.out.println("Urun kodu:21 Peynir Fiyatı:55₺ \nUrun kodu:22 Zeytin Fiyatı:60₺ " +
                "\nUrun kodu:23 Sucuk Fiyatı:115₺ \nUrun kodu:24 Salam Fiyatı:70₺" +
                "\nUrun kodu:25 Kasar Fiyati:75₺ \nUrun kodu:26 Yumurta Fiyati:85₺" +
                "\nUrun kodu:27 Sut Fiyatı:80₺\nUrun kodu:28 Yogurt Fiyatı:100₺ " +
                "\nUrun kodu:29 Kiyma Fiyati:450₺ \nUrun kodu:30 Tavuk Fiyati:100₺");

        while (!urun) {
            urunKodu = scanner.nextInt();
            if (urunKodu > 20 && urunKodu < 31) {
                System.out.println("Kac adet/litre/kg alacaksiniz?");
                urunMiktari = scanner.nextInt();

                switch (urunKodu) {
                    case 21:
                        urunAdi = "Peynir";
                        urunFiyati = 55;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 22:
                        urunAdi = "Zeytin";
                        urunFiyati = 60;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 23:
                        urunAdi = "Sucuk";
                        urunFiyati = 115;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 24:
                        urunAdi = "Salam";
                        urunFiyati = 70;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 25:
                        urunAdi = "Kasar";
                        urunFiyati = 75;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 26:
                        urunAdi = "Yumurta";
                        urunFiyati = 85;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 27:
                        urunAdi = "Sut";
                        urunFiyati = 80;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 28:
                        urunAdi = "Yogurt";
                        urunFiyati = 100;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 29:
                        urunAdi = "Kiyma";
                        urunFiyati = 450;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 30:
                        urunAdi = "Tavuk";
                        urunFiyati = 100;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    default:
                }
                urunFiyati = urunMiktari * urunFiyati;
                toplam += urunFiyati;
                System.out.println("Olusan sepet tutari: " + toplam);
                System.out.println("Baska bir urun almak isterseniz lutfen kodunu giriniz. \nCikis yapmak icin 0'a basiniz");
            } else if (urunKodu == 0) {
                cikis();

            } else {
                System.out.println("Yanlis tusa bastiniz Ek urun icin urun kodunu tuslayin Cikis yapmak icin 0'a basin");

            }


        }

    }

    public static void cikis() {
        System.out.println("--------------------Cikis Yapiliyor--------------------");
        System.exit(0);
    }
}



