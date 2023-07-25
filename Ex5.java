import java.util.Scanner;

public class Ex5 {
    public static void Ques1(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Mời nhập vào 3 số nguyên ");
        System.out.print(" a =");
        int a = sc.nextInt();
        System.out.print("\n b = ");
        int b = sc.nextInt();
        System.out.print("\n c = ");
        int c = sc.nextInt();
        System.out.printf("3 số nguyên vừa nhập là:  %d \t %d \t %d ",a,b,c);
        System.out.println();
    }
    public static void Ques2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập 2 số thực ");
        System.out.println("a = ");
        float a = sc.nextFloat();
        System.out.println("b = ");
        float b = sc.nextFloat();
        System.out.printf("2 số thực vừa nhập là: %f \t %f ",a,b);
        System.out.println();
    }
    public static void Ques3(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập Họ: ");
        String s1 = sc.nextLine();
        System.out.println("Mời nhập tên: ");
        String s2 = sc.nextLine();
        System.out.println("Họ và tên là : "+ s1 +" "+ s2);
    }
}
