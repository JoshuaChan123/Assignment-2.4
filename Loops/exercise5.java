import java.util.Scanner;

class exercise5 {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String charac= "";
        int num=0;

        System.out.println("What character?");
        charac=sc.next();

        System.out.println("How tall?");
        num=sc.nextInt();

        for(int a=1; a<=num; a++){
            for(int b=1; b<=a; b++){
                System.out.print(charac);
            }
            System.out.println("");
        }

    }
}