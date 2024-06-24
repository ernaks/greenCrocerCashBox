import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            double armut, elma, domates, muz, patlican;
            Scanner sc = new Scanner(System.in);
            System.out.print("Armut miktarını giriniz(kg): ");
            armut = sc.nextDouble();
            System.out.print("Elma miktarını giriniz(kg): ");
            elma = sc.nextDouble();
            System.out.print("Domates miktarını giriniz(kg): ");
            domates = sc.nextDouble();
            System.out.print("Muz miktarını giriniz(kg): ");
            muz = sc.nextDouble();
            System.out.print("Patlican miktarını giriniz(kg): ");
            patlican = sc.nextDouble();
            double toplam = (armut * 2.14) + (elma * 3.67) + (domates * 1.11) + (muz * 0.95) + (patlican * 5.00);
            System.out.println("Toplam tutar: " + toplam + " TL");
    }
}