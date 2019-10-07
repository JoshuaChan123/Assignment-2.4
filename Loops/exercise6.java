import java.util.Scanner;

class  exercise6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int rolls=0;
        int num=0;
        String again="yes";
        int total =0;

        while(again.equals("yes")){

            System.out.print("How many rolls");
            rolls=sc.nextInt();

            System.out.println("Your rolls");

            for(int i=0; i<rolls; i++){
                num= (int)(Math.random()*6)+1;
                total= total+num;
                System.out.print(num+"");
            }

            System.out.println("Total " + total);

            System.out.println("Roll again? yes/no");

            again=sc.next();

        }
    }
}