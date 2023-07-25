import Database.Exam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex3 {
    public static void Ques2(Exam e1, Exam e2){
        String pattern = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        Exam[] exams ={ e1,e2};
        for(Exam exam: exams){
            String date = simpleDateFormat.format(exam.createDate);
            System.out.println(exam.code + ": "+date);
        }
    }
    public static void Ques3(Exam e1, Exam e2){
        String pattern = "yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        Exam[] exams ={ e1,e2};
        for(Exam exam: exams){
            String date = simpleDateFormat.format(exam.createDate);
            System.out.println(exam.code + ": "+date);
        }
    }
}
