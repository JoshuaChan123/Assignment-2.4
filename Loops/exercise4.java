import java.util.Scanner;

class exercise4 {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String charac= "";
        int num=0;

        System.out.println("What character?");
        charac=sc.next();

        System.out.println("How many characters?");
        num=sc.nextInt();

        for(int i=0; i<num; i++){
         System.out.print(charac);
        }




    }
}