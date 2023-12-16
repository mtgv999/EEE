import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        int result=0;
        for (int i = 0; i < count; i++) {
            result+=2;}
        if(result%10==0){
            System.out.println("result는 10의 배수");}
        else System.out.println(result);}}