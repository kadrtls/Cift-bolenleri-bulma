import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("bir  tam sayı giriniz:");
        int number= scanner.nextInt();

        if (number>0){
            for (int i=1;i<=number;i++){
                if (i%2==0)
                System.out.print(i+" ");
            }
        }else{
            for (int i=-1;i>=number;i--){
                if (i%2==0)
                System.out.print(i+",");
            }
        }
    }
}