import java.util.*;
public class Lima {
    public static void main(String args[]) {
        
        String kataNormal;
        String kataBalik = "";
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input kata atau kalimat disini : ");
        
        kataNormal = input.nextLine();
        
        for (int i = kataNormal.length() - 1; i >= 0; i--)
        {
            kataBalik += kataNormal.charAt(i);
        }
        
        System.out.println("Hasil kata yang di balik ; " + kataBalik );
    
        }
}
