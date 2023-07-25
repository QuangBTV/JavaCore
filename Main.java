import Database.*;

import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        //Database.Question 2: Khởi tạo

        // Tạo Database.Department
        Department dep1 = new Department();
        dep1.id = 1;
        dep1.name = "Dev";

        Department dep2 = new Department();
        dep2.id = 2;
        dep2.name = "Sale";

        Department dep3 = new Department();
        dep3.id = 3;
        dep3.name = "Marketing";

        // Tạo Database.Position
        Position pos1 = new Position();
        pos1.id = 1;
        pos1.name = PositionName.DEV;

        Position pos2 = new Position();
        pos2.id = 2;
        pos2.name = PositionName.PM;

        Position pos3 = new Position();
        pos3.id = 3;
        pos3.name = PositionName.SCRUM_MASTER;

        // Tạo Database.Group
        Group group1 = new Group();
        group1.id = 1;
        group1.name = "Sale";

        Group group2= new Group();
        group2.id = 2;
        group2.name = "Dev";

        Group group3= new Group();
        group3.id = 3;
        group3.name = "Testing";

        // Tạo Database.Account
        Account acc1 = new Account();
        acc1.id = 1;
        acc1.email = "email1";
        acc1.userName = "username1";
        acc1.fullName = "fullname1";
        acc1.department = dep1;
        acc1.position = pos1;
        acc1.createDate = LocalDate.now();
        acc1.groups= new Group[] {group1, group2};
        group1.accounts = new Account[]{acc1};
        group2.accounts = new Account[]{acc1};


        Account acc2 = new Account();
        acc2.id = 2;
        acc2.email = "email2";
        acc2.userName = "username2";
        acc2.fullName = "fullname2";
        acc2.department = dep2;
        acc2.position = pos2;
        acc2.createDate = LocalDate.of(2023,06,15);
        acc2.groups = new Group[] {group3, group2};
        group2.accounts = new Account[]{acc1, acc2};
        group3.accounts = new Account[]{acc2};

        Account acc3 = new Account();
        acc3.id = 3;
        acc3.email = "email3";
        acc3.userName = "username3";
        acc3.fullName = "fullname3";
        acc3.department = dep3;
        acc3.position = pos3;
        acc3.createDate = LocalDate.now();
        acc3.groups = new Group[] {group1, group2,group3};
        group1.accounts = new Account[]{acc1, acc3};
        group2.accounts = new Account[]{acc1, acc2, acc3};
        group3.accounts = new Account[]{acc2, acc3};

        //Database.Question 3: xuất màn hình
        //Print(acc1);

        //----- Assignment 2 --------
        //Exercise 1 : Flow Control
        //Database.Question 1:Kiểm tra account thứ 2
        //Nếu không có phòng ban (tức là department == null) thì sẽ in ra text
        //"Nhân viên này chưa có phòng ban"
        //Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là ..."

//        Ex1.Print(acc1);
//
//        System.out.println("-----Database.Question 1: Check acc1 --------");
//        Ex1.ques1(acc1);
//        System.out.println("----- Database.Question 2 --------");
//        Ex1.ques2(acc2);
//        System.out.println("----- Database.Question 3: dùng ternary --------");
//        Ex1.ques3(acc1);
//        System.out.println("----- Database.Question 4: dùng ternary check acc1 --------");
//        Ex1.ques4(acc1);
//        System.out.println("----- Database.Question 5: Switch case Check group1 --------");
//        Ex1.ques5(group1);
//        System.out.println("----- Database.Question 6: Switch case Check Database.Account --------");
//        Ex1.ques6(acc3);
//        System.out.println("----- Database.Question 7: Switch case Check group --------");
//        Ex1.ques7(acc1);
//        System.out.println("----- Database.Question 8: FOREACH print Database.Account --------");
//        Ex1.ques8(acc1,acc2,acc3);
//        System.out.println("----- Database.Question 9: FOREACH print Dep --------");
//        Ex1.ques9(dep1,dep2,dep3);
//        System.out.println("----- Database.Question 10: FOR print Acc --------");
//        Ex1.ques10(acc1,acc2);
//        System.out.println("----- Database.Question 11: FOR print Dep --------");
//        Ex1.ques11(dep1,dep2,dep3);
//        System.out.println("----- Database.Question 12: FOR print Dep with length =2 --------");
//        Ex1.ques12(dep1,dep2,dep3);
//        System.out.println("----- Database.Question 13: FOR print Acc != acc2 --------");
//        Ex1.ques13(acc1,acc2,acc3);
//        System.out.println("----- Database.Question 14: FOR print Acc ID < 4 --------");
//        Ex1.ques14(acc1,acc2,acc3);
//        System.out.println("----- Database.Question 15: FOR print Số chẵn <20 --------");
//        Ex1.ques15();
//        System.out.println("------- Exercise 2 -------");
//        Ex2.Ques1();
//        Ex2.Ques2();
//        Ex2.Ques3();
//        Ex2.Ques4();
//        Ex2.Ques5();
//        System.out.println("-------------- Exercise 3-----------");
//        Exam exam1= new Exam();
//        Exam exam2= new Exam();
//
//        exam1.code = "Đề thi Java";
//        exam1.createDate = new Date();
//
//        exam2.code = "Đề thi PHP";
//        exam2.createDate = new Date();
//        Ex3.Ques2(exam1,exam2);
//        Ex3.Ques3(exam1,exam2);
//        System.out.println("-------------- Exercise 4-----------");
//        Ex4.Ques1();
//        Ex4.Ques2();
        System.out.println("-------------- Exercise 5-----------");
        Ex5.Ques1();
        Ex5.Ques2();
        Ex5.Ques3();
    }

}