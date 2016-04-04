/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import static java.lang.Math.cbrt;
import static java.lang.Math.sqrt;

/**
 *
 * @author tuan
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Namnhuan(2016);
        Ktsonguyento(13);
        Ktsochinhphuong(16);
        Ktsolapphuong(8);
        Sodoixung(011);
        Ktsohoanthien(6);
        hamtong1(100);
        hamtong2(4);
        giaithua(40);
        printListFib(6);
    }
    /**
     * kiem tra nam nhuan
     * @param nam 
     */
    static void Namnhuan(int nam){
        if((nam%4==0 && nam%100!=0)||(nam%400==0)){
            System.out.println(nam + " la nam nhuan");
        }
        else{
            System.out.println(nam + " khong phai la nam nhuan");
        }
    }
    
    /**
     * ham kiem tra so nguyen to
     * @param giatri 
     */
    static void Ktsonguyento(int giatri){
        int dem = 0;
        for (int i = 1; i <= giatri; i++) {
            if (giatri%i==0) {
                dem += 1;
            }
        }
        if (dem==2) {
            System.out.println(giatri + " la so nguyen to");
        }else{
            System.out.println(giatri + " khong la so  nguyen to");
        }
    }
    
    /**
     * ham kiem tra so chinh phuong
     * @param giatri 
     */
    static void Ktsochinhphuong (int giatri){
        float tam;
        tam = (float) sqrt(giatri);
        if ((int)tam == tam) {
            System.out.println(giatri + " la so chinh phuong");
        }
        else{
            System.out.println(giatri + " khong phai la so chinh phuong");
        }
    }
    
    /**
     * ham kiem tra so lap phuong
     * @param giatri 
     */
    static void Ktsolapphuong (int giatri){
        float tam;
        tam = (float) cbrt(giatri);
        if ((int)tam == tam) {
            System.out.println(giatri + " la so lap phuong");
        }
        else{
            System.out.println(giatri + " khong phai la so lap phuong");
        }
    }
    
    /**
     * ham kiem tra so doi xung (11,121,11211,..)
     * @param giatri 
     */
    static void Sodoixung(int giatri){
        int s2 = 0; //so nghich dao
        int s1 = giatri;
        while(s1 > 0){
            s2 = s2*10 + s1%10;
            s1 = s1 / 10;
        }
        if(giatri==s2){
            System.out.println(giatri + " la so doi xung");
        }
        else{
            System.out.println(giatri + " khong la so doi xung");
        }
    }
    
    /**
     * ham kiem tra so hoan thien
     * @param giatri 
     */
    static void Ktsohoanthien(int giatri){
        int tam = 0;
        int dem = 0;
        for (int i = 2; i <= giatri; i++) {
             if (giatri%i ==0) {
                tam = giatri/i;
                dem += tam;
            }
               // tam += tam;
        }
         if(dem == giatri){
              System.out.println(giatri + " la so hoan thien");
              //System.out.println(dem);
            }
        else{
            System.out.println(giatri + " khong la so so hoan thien");
            }   
    }
    
    /**
     * tinh tong S = 1+ 2 +3 + ... + n
     */
    
    static void hamtong1(int n){
        int S = 0;
        for (int i = 0; i <= n; i++) {
            S += i;
        }
        System.out.println("Tong 1 + 2 + ... + n = " + S);
    }
    
    /**
     * tinh tong S = 1/2+ 3/4 + ... + (n-1)/n
     */
    
    static void hamtong2(int n){
        float S = 0;
        for (float i = 2; i <= n; i=i+2) {
            S += (float)(i-1)/i;
        }
        System.out.println("Tong 1/2+ 3/4 + ... + (n-1)/n = " + S);
    }
    
    /**
     * ham tinh giai thua
     */
    
    static void giaithua(int n){
        int gThua = 1;
        for (int i = 2; i <= n; i++) {
            gThua = gThua*i;
        }
        //String chuoi = gThua + "";
        System.out.println("n! = " + String.valueOf(gThua));
        System.out.println("int n! = " + (gThua));
    }
    /**
     * day fibonaci
     */
    
    static int Fibonaci(int n){
        if(n<=2)
            return 1;
        else
            return Fibonaci(n-1)+Fibonaci(n-2);
        
    }
    
    static void printListFib(int n){
        for (int i = 1; i <=n; i++) {
            int fi = Fibonaci(i);
            System.out.print(fi+" ");
        }
    }
}
