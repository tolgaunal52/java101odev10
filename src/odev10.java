import java.util.Scanner;

public class odev10 {
    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik, ortalama, a, v = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("\nNot Hesaplama Sistemine Hosgeldiniz \n");
        System.out.println("Lutfen Notlarinizi Sirasiyla Giriniz\n");

        System.out.print("Matematik Notunuzu Girin : ");
        matematik = input.nextInt();
        if (matematik >= 0 && matematik <= 100) {
            v++;
        }else{
            matematik = 0;
        };

        System.out.print("Fizik Notunuzu Girin : ");
        fizik = input.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            v++;
        }else{
            fizik = 0;
        };

        System.out.print("Turkce Notunuzu Girin : ");
        turkce = input.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            v++;
        }else{
            turkce = 0;
        };

        System.out.print("Kimya Notunuzu Girin : ");
        kimya = input.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            v++;
        }else{
            kimya = 0;
        };

        System.out.print("Muzik Notunuzu Girin : ");
        muzik = input.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            v++;
        }else{
            muzik = 0;
        };

        ortalama = (matematik + fizik + turkce + kimya + muzik) / v;

        // System.out.println(v); ortalama testi için

        if (ortalama >= 55) {
            System.out.println("\nTebrikler Sinifi Gectiniz");
            System.out.println("  Ortalamaniz " + ortalama);
        } else {
            System.out.print("\nMalesef Kaldiniz");
            System.out.println("  Ortalamaniz " + ortalama);
        }
    }
}
