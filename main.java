import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar,kdvOrani = 0.18, kdvTutar, kdvliTutar;
        Scanner input = new Scanner(System.in);
        System.out.println("Tutari Giriniz : " );
        tutar = input.nextDouble();

        if(tutar>0 && tutar < 1000) {
            kdvOrani = 0.18;
        }else {
            kdvOrani = 0.08;
        }


        kdvTutar = tutar * kdvOrani;
        kdvliTutar = tutar + kdvTutar;


        System.out.println("KDVV'siz Tutar :" + tutar);
        System.out.println("KDV Orani :" + kdvOrani);
        System.out.println("KDV Tutari :" + kdvTutar);
        System.out.println("KDV'li Tutari :" + kdvliTutar);

            }
        }
