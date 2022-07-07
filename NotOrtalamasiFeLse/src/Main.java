import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, turkce, kimya, muzik;
        double ortalama;

        Scanner not = new Scanner(System.in);

        System.out.print("Matematik : ");
        mat = not.nextInt();
        mat = ( (mat<0) || (mat>100) ) ? 0 : mat;

        System.out.print("Fizik : ");
        fizik = not.nextInt();
        fizik = ( (fizik<0) || (fizik>100) ) ? 0 : fizik;

        System.out.print("Turkce : ");
        turkce = not.nextInt();
        turkce = ( (turkce<0) ||(turkce>100) ) ? 0 : turkce;

        System.out.print("Kimya : ");
        kimya = not.nextInt();
        kimya = ( (kimya<0) || (kimya>100) ) ? 0 : kimya;

        System.out.print("Muzik : ");
        muzik = not.nextInt();
        muzik = ( (muzik<0) || (muzik>100) ) ? 0 : muzik;

        ortalama = (mat + fizik + turkce + kimya + muzik) / 5;

        if (ortalama < 50) {
            System.out.println("Sinif Tekrari.");
        }
        else {
            System.out.println("Tebrikler. Sinifi Gectiniz.");
        }
        System.out.println("Ortalama : " + ortalama);
    }
}