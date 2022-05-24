import java.util.Scanner;

public class manavkasa {
    public static void main(String[] args){

        // Manavdan alınan meyveleri kilosuna göre toplam tutarı hesaplama

        double armut = 2.14, elma = 3.67, domates =1.11, muz = 0.95, patlican = 5;
        double a, e, d, m, p, tutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç kilo Armut ? : ");
        a = input.nextDouble();
        System.out.print("Kaç kilo Elma ? : ");
        e = input.nextDouble();
        System.out.print("Kaç kilo Domates ? : ");
        d = input.nextDouble();
        System.out.print("Kaç kilo Muz ? : ");
        m = input.nextDouble();
        System.out.print("Kaç kilo Patlıcan ? : ");
        p = input.nextDouble();

        tutar = (a * armut) + (e * elma) + (d * domates) + (m * muz) + (p * patlican);

        System.out.print("Toplam tutar : " + tutar);
    }
}
