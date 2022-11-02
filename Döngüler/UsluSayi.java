import java.util.Scanner;
public class UsluSayi {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        int n,k,total = 1;


        System.out.print("Üssü Alınacak Sayı :");
        n = imp.nextInt();
        System.out.print("Üs Olacak Sayı :");
        k = imp.nextInt();

        for (int i =1;i<=k;i++){
            total*=n;
        }
        System.out.println(n+ " üssü "+ k +" = "+total);
}
}
