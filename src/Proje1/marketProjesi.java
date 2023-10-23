package Proje1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Proje1.Gida.gida;
import static Proje1.Giyim.giyim;
import static Proje1.Manav.manav;
import static Proje1.Sarkuteri.sarkuteri;
import static Proje1.Temizlik.temizlik;

public class marketProjesi {
    static int secim;
    static boolean urun = true;
    static int urunKodu;
    static int urunMiktari;
    static String urunAdi;
    static double urunFiyati;
    static double toplam;
    static String sepet = "";


    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        giris();
    }

    public static void giris() {
        System.out.println("==================== WISE T127 MARKET ===================================");
        System.out.println("================== H O Ş G E L D İ N İ Z  =================================");
        System.out.println("Reyonlarimizin katalogunu incelemek icin 1'e basiniz");
        int secim = scanner.nextInt();
        if (secim == 1) {
            urunlerinTamami();
        } else {
            System.out.println("Yanlis giris yaptiniz! Lutfen 1'e basiniz");
        }
    }

    public static void urunlerinTamami() {

        System.out.println("******** Manav Reyonu ********" +
                "\nUrun kodu:11 Domates Fiyatı:25₺ " +
                "\nUrun kodu:12 Salatalik Fiyatı:40₺ " +
                "\nUrun kodu:13 Sogan Fiyatı:15₺ " +
                "\nUrun kodu:14 Biber Fiyatı:50₺" +
                "\nUrun kodu:15 Pirasa Fiyati:35.99₺ " +
                "\nUrun kodu:16 Havuc Fiyati:25₺" +
                "\nUrun kodu:17 Elma Fiyatı: 30₺" +
                "\nUrun kodu:18 Erik Fiyatı:100₺ " +
                "\nUrun kodu:19 Kivi Fiyati:150₺ " +
                "\nUrun kodu:20 Uzum Fiyati:60₺" +
                "\n******** Sarkuteri Reyonu ********" +
                "\nUrun kodu:21 Peynir Fiyatı:55₺ " +
                "\nUrun kodu:22 Zeytin Fiyatı:60₺ " +
                "\nUrun kodu:23 Sucuk Fiyatı:115₺ " +
                "\nUrun kodu:24 Salam Fiyatı:70₺" +
                "\nUrun kodu:25 Kasar Fiyati:75₺ " +
                "\nUrun kodu:26 Yumurta Fiyati:85₺" +
                "\nUrun kodu:27 Sut Fiyatı:80₺" +
                "\nUrun kodu:28 Yogurt Fiyatı:100₺ " +
                "\nUrun kodu:29 Kiyma Fiyati:450₺ " +
                "\nUrun kodu:30 Tavuk Fiyati:100₺" +
                "\n******** Giyim Reyonu ********" +
                "\nUrun kodu:31 Cocuk Corabi Fiyatı:25₺ " +
                "\nUrun kodu:32 Cocuk Camasiri Fiyatı:40₺ " +
                "\nUrun kodu:33 Bayan Pijama Fiyatı:115₺ " +
                "\nUrun kodu:34 Erkek Pijama Fiyatı:100₺" +
                "\nUrun kodu:35 Sweatshirt Fiyati:100₺ " +
                "\nUrun kodu:36 Canta Fiyati:150₺" +
                "\nUrun kodu:37 Bayan Pantolon Fiyatı: 150₺" +
                "\nUrun kodu:38 Bayan Ayakkabi Fiyatı:100₺ " +
                "\nUrun kodu:39 Erkek Pantolon Fiyati:150₺ " +
                "\nUrun kodu:40 Erkek Ayakkabi Fiyati:100₺" +
                "\n******** Temizlik Reyonu ********" +
                "\nUrun kodu:41 Sivi Sabun Fiyatı:60₺ " +
                "\nUrun kodu:42 Camasir Suyu Fiyatı:50₺ " +
                "\nUrun kodu:43 Deterjan Fiyatı:150₺ " +
                "\nUrun kodu:44 Yumusatici Fiyatı:70₺" +
                "\nUrun kodu:45 Bulasik Deterjani Fiyati:70₺ " +
                "\nUrun kodu:46 Yuzey Temizleyici Fiyati:55₺" +
                "\nUrun kodu:47 Ahsap Temizleyici Fiyatı: 40₺" +
                "\nUrun kodu:48 Camsil Fiyatı:100₺ " +
                "\nUrun kodu:49 Cop Torbasi Fiyati:50₺ " +
                "\nUrun kodu:50 Temizlik Eldiveni Fiyati:60₺" +
                "\n******** Gida Reyonu ********" +
                "\nUrun kodu:51 Fasulye Fiyatı:75₺ " +
                "\nUrun kodu:52 Nohut Fiyatı:60₺ " +
                "\nUrun kodu:53 Makarna Fiyatı:30₺ " +
                "\nUrun kodu:54 Salca Fiyatı:55₺" +
                "\nUrun kodu:55 Tursu Fiyati:45₺ " +
                "\nUrun kodu:56 Cay Fiyati:85₺" +
                "\nUrun kodu:57 Seker Fiyatı:80₺" +
                "\nUrun kodu:58 Cikolata Fiyatı:100₺ ");
        System.out.println("Manav Reyonuna gitmek icin 1'e basiniz! \nSarkuteri Reyonuna gitmek icin 2'e basiniz! " +
                "\nGiyim Reyonuna gitmek icin 3'e basiniz! \nTemizlik Reyonuna gitmek icin 4'e basiniz " +
                "\nGida Reyonuna gitmek icin 5'e basiniz \nKasaya gitmek icin 6'a basiniz");
        secim = scanner.nextInt();

        if (!(secim >= 1 && secim <= 7)) {
            System.out.println("Yanlis giris yaptiniz! Tekrar deneyiniz");
        } else {
            switch (secim) {
                case 1:
                    manav();
                    break;
                case 2:
                    sarkuteri();
                    break;
                case 3:
                    giyim();
                    break;
                case 4:
                    temizlik();
                    break;
                case 5:
                    gida();
                    break;
                case 6:
                    kasa();
                    break;
                default:
            }


        }
    }

    public static void reyonlar() {
        System.out.println("Manav Reyonuna gitmek icin 1'e basiniz! " +
                "\nSarkuteri Reyonuna gitmek icin 2'e basiniz!" +
                "\nGiyim Reyonuna gitmek icin 3'e basiniz! " +
                "\nTemizlik Reyonuna gitmek icin 4'e basiniz! " +
                "\nGida Reyonuna gitmek icin 5'e basiniz!" +
                "\nKasaya gitmek icin 6'a basiniz!");
        int reyonlar = scanner.nextInt();
        if (!(reyonlar >= 1 && reyonlar <= 6)) {
            System.out.println("Yanlis giris yaptiniz!");
        } else {
            switch (reyonlar) {
                case 1:
                    manav();
                    break;
                case 2:
                    sarkuteri();
                    break;
                case 3:
                    giyim();
                    break;
                case 4:
                    temizlik();
                    break;
                case 5:
                    gida();
                    break;
                case 6:
                    kasa();
                    break;
                default:
            }
        }
    }

    public static void gida() {

        System.out.println("Gida Reyonumuza ----- H O S G E L D İ N İ Z -----");
        System.out.println("Lütfen almak istediğiniz ürünün ürün kodunu giriniz!");
        System.out.println("Urun kodu:51 Fasulye Fiyatı:75₺ \nUrun kodu:52 Nohut Fiyatı:60₺ " +
                "\nUrun kodu:53 Makarna Fiyatı:30₺ \nUrun kodu:54 Salca Fiyatı:55₺" +
                "\nUrun kodu:55 Tursu Fiyati:45₺ \nUrun kodu:56 Cay Fiyati:85₺" +
                "\nUrun kodu:57 Seker Fiyatı:80₺\nUrun kodu:58 Cikolata Fiyatı:100₺ ");

        while (urun) {
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
                sepet += urunAdi + " fiyatı:" + urunFiyati + "₺" + " ";
                System.out.println("Aldiginiz urunlerin fiyati: " + toplam);
                System.out.println("Baska bir urun almak isterseniz lutfen kodunu giriniz! " + "\nAna menuye donmek icin 0'a basiniz! ");

            } else if (urunKodu == 0) {
                reyonlar();
            }
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


        while (urun) {
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
                sepet += urunAdi + " fiyatı:" + urunFiyati + "₺" + " ";
                System.out.println("Aldiginiz urunlerin fiyati: " + toplam);
                System.out.println("Baska bir urun almak isterseniz lutfen kodunu giriniz! " + "\nAna menuye donmek icin 0'a basiniz! ");

            } else if (urunKodu == 0) {
                reyonlar();
            }
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
                sepet += urunAdi + " fiyatı:" + urunFiyati + "₺" + " ";
                System.out.println("Aldiginiz urunlerin fiyati: " + toplam);
                System.out.println("Baska bir urun almak isterseniz lutfen kodunu giriniz! " + "\nAna menuye donmek icin 0'a basiniz! ");

            } else if (urunKodu == 0) {
                reyonlar();
            }

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

        while (urun) {
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
                        System.out.println(urunMiktari + "koli " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 27:
                        urunAdi = "Sut";
                        urunFiyati = 80;
                        System.out.println(urunMiktari + "lt " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
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
                sepet += urunAdi + " fiyatı:" + urunFiyati + "₺" + " ";
                System.out.println("Aldiginiz urunlerin fiyati: " + toplam);
                System.out.println("Baska bir urun almak isterseniz lutfen kodunu giriniz! " + "\nAna menuye donmek icin 0'a basiniz! ");

            } else if (urunKodu == 0) {
                reyonlar();
            }

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

        while (urun) {
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
                sepet += urunAdi + " fiyatı:" + urunFiyati + "₺" + " ";
                System.out.println("Aldiginiz urunlerin fiyati: " + toplam);
                System.out.println("Baska bir urun almak isterseniz lutfen kodunu giriniz! " + "\nAna menuye donmek icin 0'a basiniz! ");

            } else if (urunKodu == 0) {
                reyonlar();
            }

        }
    }


    public static void kasa() {

        System.out.println("Aldiginiz urunlerin tamami: " + sepet + "\nToplam Fiyat: " + toplam);
        if (toplam >= 500) {
            System.out.println("500₺ uzeri kargo bedava !");
        } else {
            System.out.println((500 - toplam) + " daha alisveris yaparsaniz kargo bedava ! " +
                    "\nAlisverise devam etmek icin 0'a basiniz! " +
                    "\nAlisverisi tamamlamak icin 1'e basiniz! ");
        }
        secim = scanner.nextInt();
        if (secim == 0) {
            reyonlar();
        } else if (secim == 1) {
            System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz !");
            System.out.println("==================== GULE GULE ====================");
            System.exit(0);

        }


    }

}

