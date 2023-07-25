import java.util.Random;

public class Ex4 {

    public static void Ques1(){
        Random rd = new Random();
        int x = rd.nextInt();
        System.out.println("Số ngẫu nhiên x = "+x);
    }
    public static void Ques2(){
        Random rd = new Random();
        Float f = rd.nextFloat();
        System.out.printf("Số thực ngẫu nhiên f = %.4f",f);
        System.out.println();
    }
}
