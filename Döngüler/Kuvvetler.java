import java.util.Scanner;
public class Kuvvetler {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        int t;

        System.out.print("Sayı Giriniz:");
        t = imp.nextInt();

        System.out.println("Dördün Katları:");
        //kuvvet alma formülü
        for (int i =1; i <=t; i*=4){
            System.out.print(i+",");

        }
        System.out.println("\nBeş'in Katları:");
        for (int b =1; b <=t; b*=5){
            System.out.print(b+",");
        }

        //Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

    }
}
