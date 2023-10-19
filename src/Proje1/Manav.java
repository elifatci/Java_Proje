package Proje1;

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
    static double toplamFiyat = 0;
    static double toplam;


    static Scanner scanner = new Scanner(System.in);


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
                "\nUrun kodu:19 Kivi Fiyati:150₺ \nUrun Fiyati:20 Uzum Fiyati:60₺");

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
                        toplamFiyat += urunFiyati * urunMiktari;
                        System.out.println("Tekrar manav reyonunda islem yapmak istiyor musunuz? Evet:E/Hayir:H");
                        break;
                    case 12:
                        urunAdi = "Salatalik";
                        urunFiyati = 40;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        toplamFiyat += urunFiyati * urunMiktari;
                        System.out.println("Tekrar manav reyonunda islem yapmak istiyor musunuz? Evet:E/Hayir:H");
                        break;
                    case 13:
                        urunAdi = "Sogan";
                        urunFiyati = 15;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        toplamFiyat += urunFiyati * urunMiktari;
                        System.out.println("Tekrar manav reyonunda islem yapmak istiyor musunuz? Evet:E/Hayir:H");
                        break;
                    case 14:
                        urunAdi = "Biber";
                        urunFiyati = 50;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        toplamFiyat += urunFiyati * urunMiktari;
                        System.out.println("Tekrar manav reyonunda islem yapmak istiyor musunuz? Evet:E/Hayir:H");
                        break;
                    case 15:
                        urunAdi = "Pirasa";
                        urunFiyati = 35;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        toplamFiyat += urunFiyati * urunMiktari;
                        System.out.println("Tekrar manav reyonunda islem yapmak istiyor musunuz? Evet:E/Hayir:H");
                        break;
                    case 16:
                        urunAdi = "Havuc";
                        urunFiyati = 25;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        toplamFiyat += urunFiyati * urunMiktari;
                        System.out.println("Tekrar manav reyonunda islem yapmak istiyor musunuz? Evet:E/Hayir:H");
                        break;
                    case 17:
                        urunAdi = "Elma";
                        urunFiyati = 30;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        toplamFiyat += urunFiyati * urunMiktari;
                        System.out.println("Tekrar manav reyonunda islem yapmak istiyor musunuz? Evet:E/Hayir:H");
                        break;
                    case 18:
                        urunAdi = "Erik";
                        urunFiyati = 100;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        toplamFiyat += urunFiyati * urunMiktari;
                        System.out.println("Tekrar manav reyonunda islem yapmak istiyor musunuz? Evet:E/Hayir:H");
                        break;
                    case 19:
                        urunAdi = "Kivi";
                        urunFiyati = 150;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        toplamFiyat += urunFiyati * urunMiktari;
                        System.out.println("Tekrar manav reyonunda islem yapmak istiyor musunuz? Evet:E/Hayir:H");
                        break;
                    case 20:
                        urunAdi = "Uzum";
                        urunFiyati = 60;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        toplamFiyat += urunFiyati * urunMiktari;
                        System.out.println("Tekrar manav reyonunda islem yapmak istiyor musunuz? Evet:E/Hayir:H");
                        break;
                    default:
                        System.out.println("Tekrar manav reyonunda islem yapmak istiyor musunuz? Evet:E/Hayir:H");
                }

                char devam = scanner.next().toLowerCase().charAt(0);
                if (devam == 'e') {
                    manav();
                } else if (devam == 'h') {
                    urun = false;
                    toplam = toplamFiyat;
                    System.out.println("Aldiginiz urunlerin toplam fiyati: " + toplam + "₺ dir.Giris ekranina yonlendiriliyorsunuz");
                    giris();
                } else {
                    System.out.println("Lutfen Evet:E/Hayir:H olarak giris yapin");
                }


            } else {
                System.out.println("İstediginiz urun magazamizda yoktur. Giris ekranina donduruleceksiniz");
                giris();
            }

        }


    }
}
