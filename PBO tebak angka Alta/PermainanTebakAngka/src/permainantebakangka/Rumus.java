/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permainantebakangka;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author alta
 */
public class Rumus {
    int angkaPrediksi;
    int angkaIncaran;
    
    void mulai(){
    Random random = new Random();
    this.angkaIncaran = random.nextInt(101);
     System.out.println("Hallo Nama saya Alta Dzaky, saya telah memilih bilangan bulat secara acak antara 0 s/d 100. Silahkan tebak angkanya!" );
     
     do{
      Scanner Angka =  new Scanner(System.in);
      System.out.println("Angka Tebakan Anda = ");
      this.angkaPrediksi = Angka.nextInt();
      
      if(angkaPrediksi > angkaIncaran){
          System.out.println("angka tebakan maasih lebih besar");
      }else if(angkaPrediksi < angkaIncaran){
           System.out.println("angka tebakan masih kurang");
      }else{
           System.out.println("selamat anda BENAR");
           break;
      }
     }while(angkaPrediksi != angkaIncaran);
    }
}
