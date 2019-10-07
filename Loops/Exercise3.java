import java.util.Scanner;

class Exercise3{
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        int input=0;
        int total=0;


        

        while(input>=0){
            input= sc.nextInt();
             System.out.println("your input: "+input );

            if(input>=0)total=total+input;

        } 
        System.out.println("Your Total: " + total);
    }
}