import java.util.Scanner;
public class tekSayi {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);

        int n;
        int toplam = 0;


        do {
            System.out.print("Bir Sayı Giriniz : ");
            n = imp.nextInt();
            if ((n % 4 == 0)){
                toplam +=n;
            }
        }while(n%2==0);

        System.out.println("Toplam:" + toplam);




    }
}
