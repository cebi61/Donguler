import java.util.Scanner;
public class ciftSayilar {
    public static void main(String[] args) {
        int s,total=0,number=0;
        Scanner imp = new Scanner(System.in);

        System.out.print("Değer Giriniz:");
        s = imp.nextInt();

        for (int i=0;i<=s;i++){
            if ((i%3==0)&&(i%4==0)) {
                System.out.println(i);
                total += i;
                number++;


            }


        }
        double ort = total/(number-1);
        System.out.println("ortalama : "+ ort);

        }





    //Ödev
        // Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
    }

