import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        int toplam1=1;
        int toplam2=1;
        int toplam3=1;

        System.out.print("Eleman sayısını(n) giriniz: ");
        int n= inp.nextInt();
        System.out.print("Seçim sayısını(r) giriniz: ");
        int r= inp.nextInt();

        for(int i=1;i<=n; i++){
            toplam1=toplam1*i;
        }

        for(int j=1;j<=r; j++){
           toplam2=toplam2*j;
        }
        for(int k=1;k<=(n-r);k++){
            toplam3=toplam3*k;
        }

        System.out.print("Kombinasyon Sonucu :"+((toplam1)/((toplam2)*(toplam3))));
    }
}