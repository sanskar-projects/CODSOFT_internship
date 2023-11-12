import java.util.Scanner;
class GradeCalculator_task2
{
    static int N=4;
    static String[] subject=new String[]{"SUBJECT 1","SUBJECT 2","SUBJECT 3","SUBJECT 4"};
    static String[] grade=new String[]{"A","B","C","D"};
    static int[] mark=new int[]{75,50,25,0};
    static String grade(float n)
    {
        for(int i=0;i<11;i++)
        {
            if(n>=mark[i])
            {
                return grade[i];
            }
        }
        return "";
    }
    public static void main(String[] args)
    {
        System.out.println("STUDENT GRADE CALCULATOR\n");
        Scanner scan=new Scanner(System.in);
        float sum=0,avg;
        float[] marks=new float[N];
        System.out.println("enter marks out of 100:");
        for(int i=0;i<N;i++)
        {
            System.out.println(subject[i]+": ");
            marks[i]=scan.nextFloat();
        }
        for(int i=0;i<N;i++)
        {
            sum+=marks[i];
        }
        avg=sum/N;
        System.out.println("\nResults:");
        for(int i=0;i<N;i++)
        {
            System.out.println(subject[i]+" : "+marks[i]+"/100 : "+grade(marks[i]));
        }
        System.out.println("\nTOTAL: "+sum+"\nAVERAGE: "+avg+"\nGRADE: "+grade(avg));
    }
}
