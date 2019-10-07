import java.util.Scanner;

class exercise7{ 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int random=0;
        int guess=0;
        int tries=0;

        random=(int)(Math.random()*100)+1;

        while(guess!=random){
            System.out.println("Pick a guess");
            guess=sc.nextInt();
            tries++;

            if(guess>random){
                System.out.println("Lower");
            } else if(guess<random){
                System.out.println("Higher");
            } else {
                System.out.println("Correct! Took " + tries + "tries");
            }
        }
    }
}