/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author N I T R O
 */
public class Dua {
    public static void main (String args[]){
        String kalimat1 = "Universitas Nusa Putra Sukabumi"
                  ;
        int hurufHidup = 0,
         huruf = 0;


        int panjangTeks = kalimat1.length();
        for (int i = 0; i < panjangTeks; i ++)
        {

            char kar = Character.toLowerCase(kalimat1.charAt(i));
            if (kar == 'a' || kar == 'e' || kar == 'i' || kar == 'o' || kar == 'u')
                hurufHidup ++;


            if (Character.isLetter (kar))
                huruf ++;


          
        }

        System.out.println("Kalimat : "+kalimat1);
        System.out.println("Jumlah Hidup = " + hurufHidup);
        System.out.println("Jumlah Konsonan = " + (huruf - hurufHidup));
      
    }
}
