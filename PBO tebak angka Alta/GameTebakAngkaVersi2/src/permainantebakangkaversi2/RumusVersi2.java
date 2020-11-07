/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permainantebakangkaversi2;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author alta
 */
public class RumusVersi2 {
    int angkaPrediksi;
    int angkaIncaran;
    int nilai=100;
    int bonus=5;
    void mulai(){
    Random random = new Random();
    this.angkaIncaran = random.nextInt(101);
     System.out.println("Hallo Nama saya Alta Dzaky, saya telah memilih bilangan bulat secara acak antara 0 s/d 100. Silahkan tebak angkanya!" );
     do{
      Scanner Angka =  new Scanner(System.in);
      System.out.println("Angka Tebakan Anda = ");
      this.angkaPrediksi = Angka.nextInt();
      
      if(nilai == 0){
      System.out.println("Permainan telah selesai. See you");
      break;
      }
      
      if(angkaPrediksi > angkaIncaran){
          System.out.println("angka tebakan masih lebih besar");
          nilai -=2;
          bonus -=1;
      }else if(angkaPrediksi < angkaIncaran){
           System.out.println("angka tebakan masih kurang");
           nilai -=2;
          bonus -=1;
      }else{
           System.out.println("selamat anda BENAR");
           if(nilai > 0)
               System.out.println("nilai = " + nilai);
           if(bonus > 0){
               nilai +=50;
               System.out.println("bonus = 50");
           }
            System.out.println("Total Nilai = "+nilai);
           break;
      }
     }while(angkaPrediksi != angkaIncaran);
    }
}
