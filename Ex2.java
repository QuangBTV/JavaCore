import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Ex2 {

    public static void Ques1(){
        int a = 5;
        System.out.printf("Số nguyên a = %d",a);
        System.out.println();
    }
    public static void Ques2()
    {
        int b = 100000000;
        System.out.printf("Số nguyên b = %,d",b);
        System.out.println();
    }
    public static void Ques3(){
        float c = 5.567098f;
        System.out.printf("Số thực c = %.4f",c);
        System.out.println();
    }
    public static void Ques4(){
       String s = "Nguyễn Văn A";
        System.out.println("Tên tôi là "+s+ " và tôi đang độc thân");
    }
    public static void Ques5(){
        String pattern = "dd/MM/yyyy HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        System.out.println(date);
    }
}
