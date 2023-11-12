import java.util.Random;
import java.util.Scanner;
class NumberGame
{
    static int number;
    static int game()
    {
        Scanner scan=new Scanner(System.in);
        int life=10;
        while(life>0)
        {
        System.out.println("\nAttempts: "+life+"\nGuess the number: ");
        int n=scan.nextInt();
        if(n==number)
        {
            System.out.println("\nCORRECT ANSWER!!!!!");
            break;
        }
        int x=Math.abs(number-n);
        if(x<=10)
        {
            System.out.println("VERY NEAR");
        }
        else
        {
            if(x<=20)
            {
                System.out.println("NEAR");
            }
            else
            {
                if(x<=30)
                {
                    System.out.println("FAR");
                }
                else
                {
                    System.out.println("VERY FAR");
                }
            }
        }
        if(number>n)
        {
            System.out.println("IT'S GREATER THAN "+n);
        }
        if(number<n)
        {
            System.out.println("IT'S SMALLER THAN "+n);
        }
        life--;
        }
        System.out.println("\nANSWER: "+number);
        return life;
    }
    public static void main(String[] args)
    {
        System.out.println("NUMBER GAME\n");
        Scanner scan=new Scanner(System.in);
        Random r=new Random();
        System.out.println("enter number of rounds: ");
        int n=scan.nextInt();
        int[] score=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("\nROUND "+(i+1));
            number=r.nextInt(100);
            score[i]=game();
        }
        System.out.println("\nSCORE:");
        for(int i=0;i<n;i++)
        {
            System.out.println("ROUND "+(i+1)+": "+score[i]+"/10");
        }
        System.out.print("\nGAME OVER");
    }
}