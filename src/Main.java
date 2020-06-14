import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        List<Hause> hauses = new ArrayList<>();
        Hause hause1 = new Hause();
        hause1.setMietkosten(30);
        hause1.setBisBeschaeftigt(new Date(2020, 07, 04));
        hause1.setVonBeschaeftigt(new Date(2020, 07, 01));
        hause1.setHausOrt("Köln");
        hause1.setAnzahleZimmer(3);
        hause1.setWohnKapazitaet(5);
        hauses.add(hause1);

        Hause hause2 = new Hause();
        hause2.setMietkosten(30);
        hause2.setBisBeschaeftigt(new Date(2020, 07, 15));
        hause2.setVonBeschaeftigt(new Date(2020, 07, 05));
        hause2.setHausOrt("Köln");
        hause2.setAnzahleZimmer(4);
        hause2.setWohnKapazitaet(6);

        hauses.add(hause2);


//Klaviyeden bilgi girisi ici scanner objesi olusturuyoruz.

       Date gt= girisTarihiAl();
       Date ct= cikisTariAl();
        String kn=konaklamaYeriAl();

        hauses.forEach((h)->{
        if(    evBosMu(h,gt,ct)){
            System.out.println("Bos ");
        }
        else{
            System.out.println("Dolu ");
        }
        });


    }

    //main classsin icirisinde tanimlama yaptigimiz icin ve main metodun icinde cagiracagimizdan dolayi main metodu statik oldugu icin
    //onun icerisinde cagiracagiz metodlarlar statik olmali.

    public static Date girisTarihiAl() {


        System.out.println("-----Giris bilgilerini giriniz----- ");

        System.out.print("Hangi yil giris yapmak istiyorsunuz :");
        int girisYil = Integer.valueOf(sc.nextLine());

        System.out.print("Hangi ay giris yapmak istiyorsunuz :");
        int girisAy = Integer.valueOf(sc.nextLine());

        System.out.print("Hangi gün giris yapmak istiyorsunu :");

        //klaviyen kullanici girisini bu sekilde okuyoruz.
        int girisGun = Integer.valueOf(sc.nextLine());

        Date girisTarihi = new Date(girisYil, girisAy, girisGun);

        return girisTarihi;


    }

    public static Date cikisTariAl() {


        System.out.println("-----Cikis bilgilerini giriniz----- ");

        System.out.print("Hangi yil cikis yapmak istiyorsunuz :");
        int cikisYil = Integer.valueOf(sc.nextLine());

        System.out.print("Hangi ay cikisyapmak istiyorsunuz :");
        int cikisAy = Integer.valueOf(sc.nextLine());

        System.out.print("Hangi gün cikis yapmak istiyorsunu :");
        //klaviyen kullanici girisini bu sekilde okuyoruz.
        int cikisGun = Integer.valueOf(sc.nextLine());

        Date cikisTarihi = new Date(cikisYil, cikisAy, cikisGun);
        return cikisTarihi;


    }

    public static String konaklamaYeriAl() {

        System.out.println("-----Konaklamak istediginiz Yeri giriniz----- ");
        System.out.print("Hangi Sehirde konaklamak istiyorsunuz :");
        String sehir = sc.nextLine();

        return sehir;


    }

    public static boolean evBosMu(Hause hause, Date girisTarihi ,Date cikisTarihi) {
        if (hause == null) {
            System.out.println("Obje bos");
            return false;

        }
        if (hause.getVonBeschaeftigt().getDay() == girisTarihi.getDay()) {

            return false;


        } else if (hause.getBisBeschaeftigt().getDay() <= girisTarihi.getDay()) {

            return false;
        } else if (hause.getVonBeschaeftigt().getDay() >= cikisTarihi.getDay()) {

            return false;

        } else {

            return true;
        }


    }

}






