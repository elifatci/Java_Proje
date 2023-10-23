package Proje1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Temizlik {
    static String urunAdi;
    static int urunMiktari;
    static double urunFiyati;
    static boolean urun = false;
    static double toplam;
    static int secim;
    static int sayac=0;
    static int urunKodu;

    static Scanner scanner = new Scanner(System.in);
    static List<String> sepet = new ArrayList<>();

    public static void main(String[] args) {
        giris();
    }

    public static void giris() {
        System.out.println("==================== WISE T127 MARKET ===================================");
        System.out.println("================== H O Ş G E L D İ N İ Z  =================================");
        System.out.println("Temizlik reyonumuza gitmek icin 4'e basiniz");
        secim = scanner.nextInt();
        if (secim == 4) {
            temizlik();
        } else {
            System.out.println("Yanlis giris yaptiniz! Lutfen tekrar deneyiniz");
        }

    }

    public static void temizlik() {
        System.out.println("Temizlik Reyonumuza ----- H O S G E L D İ N İ Z -----");
        System.out.println("Lütfen almak istediğiniz ürünün ürün kodunu giriniz!");
        System.out.println("Urun kodu:41 Sivi Sabun Fiyatı:60₺ \nUrun kodu:42 Camasir Suyu Fiyatı:50₺ " +
                "\nUrun kodu:43 Deterjan Fiyatı:150₺ \nUrun kodu:44 Yumusatici Fiyatı:70₺" +
                "\nUrun kodu:45 Bulasik Deterjani Fiyati:70₺ \nUrun kodu:46 Yuzey Temizleyici Fiyati:55₺" +
                "\nUrun kodu:47 Ahsap Temizleyici Fiyatı: 40₺\nUrun kodu:48 Camsil Fiyatı:100₺ " +
                "\nUrun kodu:49 Cop Torbasi Fiyati:50₺ \nUrun kodu:50 Temizlik Eldiveni Fiyati:60₺");

        while (!urun) {
            urunKodu = scanner.nextInt();
            if (urunKodu > 40 && urunKodu < 51) {
                System.out.println("Kac kg/adet/litre alacaksiniz?");
                urunMiktari = scanner.nextInt();
                switch (urunKodu) {
                    case 41:
                        urunAdi = "Sivi Sabun";
                        urunFiyati = 60;
                        System.out.println(urunMiktari + " kg " + urunAdi + " fiyati: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 42:
                        urunAdi = "Camasir Suyu";
                        urunFiyati = 50;
                        System.out.println(urunMiktari + " litre " + urunAdi + " fiyati: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 43:
                        urunAdi = "Deterjan";
                        urunFiyati = 150;
                        System.out.println(urunMiktari + " kg " + urunAdi + " fiyati: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 44:
                        urunAdi = "Yumusatici";
                        urunFiyati = 70;
                        System.out.println(urunMiktari + " litre " + urunAdi + " fiyati: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 45:
                        urunAdi = "Bulasik Deterjani";
                        urunFiyati = 60;
                        System.out.println(urunMiktari + " litre " + urunAdi + " fiyati: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 46:
                        urunAdi = "Yuzey Temizleyici";
                        urunFiyati = 55;
                        System.out.println(urunMiktari + " ml " + urunAdi + " fiyati: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 47:
                        urunAdi = "Ahsap Temizleyici";
                        urunFiyati = 40;
                        System.out.println(urunMiktari + " ml " + urunAdi + " fiyati: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 48:
                        urunAdi = "Camsil";
                        urunFiyati = 100;
                        System.out.println(urunMiktari + " ml " + urunAdi + " fiyati: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 49:
                        urunAdi = "Cop Torbasi";
                        urunFiyati = 50;
                        System.out.println(urunMiktari + " adet " + urunAdi + " fiyati: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 50:
                        urunAdi = "Temizlik Eldiveni";
                        urunFiyati = 60;
                        System.out.println(urunMiktari + " adet " + urunAdi + " fiyati: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    default:
                }
                urunFiyati = urunMiktari * urunFiyati;
                toplam += urunFiyati;
                sepet.add((sepet.size()+1)+". urun: "+urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati + " Tl'dir");
                System.out.println("Aldiginiz urunlerin fiyati: " + toplam);
                System.out.println("Baska bir urun almak isterseniz lutfen kodunu giriniz. \nCikis yapmak icin 0'a basiniz");
                sayac++;
                for (int i = 0; i <sayac; i++) {
                    System.out.println("Temizlik Reyonu sepetiniz: " + sepet.get(i));
                }
            } else if (urunKodu == 0) {
                cikis();
            } else {
                System.out.println("Yanlis giris yaptiniz! Tekrar deneyiniz");
            }
        }

    }

    public static void cikis() {
        System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz!");
        System.out.println("----------------Cikis Yapiliyor----------------");
        System.exit(0);
    }
}
