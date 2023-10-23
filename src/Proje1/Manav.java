package Proje1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manav {
    /*

==================== WISE T127 MARKET ===================================

1 MANAV ÜRÜNLERİ

*/
    static int secim;
    static boolean urun = true;
    static int urunKodu;
    static int urunMiktari;
    static String urunAdi;
    static double urunFiyati;
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
        System.out.println("Manav reyonumuza gitmek icin 1'e basiniz");
        int secim = scanner.nextInt();
        if (secim == 1) {
            manav();
        } else {
            System.out.println("Yanlis giris yaptiniz Lutfen manav reyonu icin 1'e basiniz");
        }
    }

    public static void manav() {
        System.out.println("Manav Reyonumuza ----- H O S G E L D İ N İ Z -----");
        System.out.println("Lütfen almak istediğiniz ürünün ürün kodunu giriniz!");
        System.out.println("Urun kodu:11 Domates Fiyatı:25₺ \nUrun kodu:12 Salatalik Fiyatı:40₺ " +
                "\nUrun kodu:13 Sogan Fiyatı:15₺ \nUrun kodu:14 Biber Fiyatı:50₺" +
                "\nUrun kodu:15 Pirasa Fiyati:35₺ \nUrun kodu:16 Havuc Fiyati:25₺" +
                "\nUrun kodu:17 Elma Fiyatı: 30₺\nUrun kodu:18 Erik Fiyatı:100₺ " +
                "\nUrun kodu:19 Kivi Fiyati:150₺ \nUrun kodu:20 Uzum Fiyati:60₺");

        while (urun) {
            urunKodu = scanner.nextInt();
            if (urunKodu >= 11 && urunKodu <= 20) {
                System.out.print("Kaç kg alacaksınız: ");
                urunMiktari = scanner.nextInt();
                switch (urunKodu) {
                    case 11:
                        urunAdi = "Domates";
                        urunFiyati = 25;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 12:
                        urunAdi = "Salatalik";
                        urunFiyati = 40;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 13:
                        urunAdi = "Sogan";
                        urunFiyati = 15;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 14:
                        urunAdi = "Biber";
                        urunFiyati = 50;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 15:
                        urunAdi = "Pirasa";
                        urunFiyati = 35;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 16:
                        urunAdi = "Havuc";
                        urunFiyati = 25;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 17:
                        urunAdi = "Elma";
                        urunFiyati = 30;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 18:
                        urunAdi = "Erik";
                        urunFiyati = 100;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 19:
                        urunAdi = "Kivi";
                        urunFiyati = 150;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 20:
                        urunAdi = "Uzum";
                        urunFiyati = 60;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    default:

                }

                urunFiyati = urunMiktari * urunFiyati;
                toplam += urunFiyati;
                sepet.add((sepet.size() + 1) + ". urun: " + urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati + " Tl'dir");
                System.out.println("Aldiginiz urunlerin fiyati: " + toplam);
                System.out.println("Baska bir urun almak isterseniz lutfen kodunu giriniz. \nCikis yapmak icin 0'a basiniz");
                sayac++;
                for (int i = 0; i < sayac; i++) {
                    System.out.println("Manav Reyonu sepetiniz: " + sepet.get(i));
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