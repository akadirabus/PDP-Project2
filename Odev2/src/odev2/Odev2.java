/**
* @author Abdulkadir Abuş abdulkadir.abus@ogr.sakarya.edu.tr
* @author Oğuzhan KECECİLER  oguzhan.kaceciler@ogr.sakarya.edu.tr
* @since 16.03.2019
* <p>
* PDP II. ÖDEV
* </p>
*/
package odev2;

import RastgeleKarakter.rastgelekarakter;

public class Odev2 {

    public static void main(String[] args) {
        
            rastgelekarakter rand = new  rastgelekarakter();
            
            //Rastgele Karakter
            rand.RastgeleKarakter();
            rand.RastgeleKarakter();

            //Rastgele 3 Karakter 
            rand.Rastgele3Karakter();
            rand.Rastgele3Karakter();

             
            //Verilen iki karakter
            rand.Verilenikikarakter();
            rand.Verilenikikarakter();

            
            //Belirtilen Karakterler
            rand.BelirtilenKarakterler();
            rand.BelirtilenKarakterler();
            rand.BelirtilenKarakterler();

            //Rasgele cümle
            rand.RasgeleCumle();
            
            
            //100 Harflik Örüntü Testi
            rand.Oruntu();   
    } 
}