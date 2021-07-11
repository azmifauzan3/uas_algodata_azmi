import java.util.Scanner;
 
public class Satu {
    private static final int Jumlah_Karakter = 100;
    private static int[] total_per_karakter = new int[Jumlah_Karakter];
 
    public static void main(String args[]) {
        Scanner a = new Scanner(System.in);
        System.out.print("Masukkan Kata : ");
        String kata = a.nextLine();
        kata = kata.toLowerCase();

        int jumlahKata = 0;
        int i = 0;
        while (i < kata.length()) {
            while (i < kata.length() && kata.charAt(i) == ' ') i++; 
 
            if (i < kata.length() && kata.charAt(i) != ' ') {
                jumlahKata++;
                while (i < kata.length() && kata.charAt(i) != ' ') i++;
            }
        }
 
        System.out.println("Banyak Kata : " + jumlahKata);
    }
}