import java.time.LocalDate;
import java.util.Date;

import static java.util.Date.*;

public class Main {

    public static void main(String[] args) {
        //Question 2: Khởi tạo

        // Tạo Department
        Department dep1 = new Department();
        dep1.id = 1;
        dep1.name = "Dev";

        Department dep2 = new Department();
        dep2.id = 2;
        dep2.name = "Sale";

        Department dep3 = new Department();
        dep3.id = 3;
        dep3.name = "Marketing";

        // Tạo Position
        Position pos1 = new Position();
        pos1.id = 1;
        pos1.name = PositionName.DEV;

        Position pos2 = new Position();
        pos2.id = 2;
        pos2.name = PositionName.PM;

        Position pos3 = new Position();
        pos3.id = 3;
        pos3.name = PositionName.SCRUM_MASTER;

        // Tạo Group
        Group group1 = new Group();
        group1.id = 1;
        group1.name = "Sale";

        Group group2= new Group();
        group2.id = 2;
        group2.name = "Dev";

        Group group3= new Group();
        group3.id = 3;
        group3.name = "Testing";

        // Tạo Account
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

        //Question 3: xuất màn hình
        //Print(acc1);

        //----- Assignment 2 --------
        //Exercise 1 : Flow Control
        //Question 1:Kiểm tra account thứ 2
        //Nếu không có phòng ban (tức là department == null) thì sẽ in ra text
        //"Nhân viên này chưa có phòng ban"
        //Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là ..."
        System.out.println("-----Question 1: Check acc1 --------");
        ques1(acc1);
        System.out.println("----- Question 2 --------");
        ques2(acc2);
        System.out.println("----- Question 3: dùng ternary --------");
        ques3(acc1);
        System.out.println("----- Question 4: dùng ternary check acc1 --------");
        ques4(acc1);
        System.out.println("----- Question 5: Switch case Check group1 --------");
        ques5(group1);
        System.out.println("----- Question 6: Switch case Check Account --------");
        ques6(acc3);
        System.out.println("----- Question 7: Switch case Check group --------");
        ques7(acc1);
        System.out.println("----- Question 8: FOREACH print Account --------");
        ques8(acc1,acc2,acc3);
        System.out.println("----- Question 9: FOREACH print Dep --------");
        ques9(dep1,dep2,dep3);
        System.out.println("----- Question 10: FOR print Acc --------");
        ques10(acc1,acc2);
        System.out.println("----- Question 11: FOR print Dep --------");
        ques11(dep1,dep2,dep3);
        System.out.println("----- Question 12: FOR print Dep with length =2 --------");
        ques12(dep1,dep2,dep3);
        System.out.println("----- Question 13: FOR print Acc != acc2 --------");
        ques13(acc1,acc2,acc3);
        System.out.println("----- Question 14: FOR print Acc ID < 4 --------");
        ques14(acc1,acc2,acc3);
        System.out.println("----- Question 15: FOR print Số chẵn <20 --------");
        ques15();
    }
    public static void Print(Account acc){
        System.out.println("Thông tin các Account trên hệ thống:");
        System.out.println("Account 1 \n"+ " ID : " + acc.id + "\n Email: " +
                acc.email + "\n UserName: " + acc.userName
                + "\n FullName: " + acc.fullName + "\n Department: " +
                acc.department.name + "\n Position: "
                + acc.position.name + "\n Group: "+
                acc.groups[0].name +" - "+ acc.groups[1].name + "\n CreateDate: " +
                acc.createDate);
    } // xuất thông tin acc
    public static void ques1(Account acc){
        if (acc.department == null){
            System.out.println("Nhân viên chưa có phòng ban");
        }else
        {
            System.out.println("Phòng ban nhân viên này là: "+ acc.department.name);
        }
    }
    public static void ques2(Account acc){
        if (acc.groups == null){
            System.out.println("Nhân viên chưa có Group");
        }else
        {
            int totalGroup= acc.groups.length;
            if (totalGroup == 1 || totalGroup ==2){
                System.out.println("Nhân viên ở group Java Fresher và C#");
            } else if (totalGroup==3)
                {
                System.out.println("Nhân viên tham gia nhiều group");
                } else if (totalGroup >=4)
                    {
                        System.out.println("Nhân viên lắm chuyện");
                    }
        }
    }
    public static void ques3(Account acc){
        System.out.println(acc.department==null? "Nhân viên chưa có phòng ban."
                :"Nhân viên thuộc phòng ban: "+acc.department.name);
    }
    public static void ques4(Account acc){
        System.out.println(acc.position.name.toString()== "DEV"? "Đây là Developer"
                :"Không phải Devoloper" );
    }
    public static void ques5(Group gr){
        if (gr.accounts == null){
            System.out.println("Group chưa có thành viên");
        }else
            {
                int totalAcc = gr.accounts.length;
                switch (totalAcc)
                {
                    case 1:
                        System.out.println("Nhóm có 1 thành viên");
                        break;
                    case 2:
                        System.out.println("Nhóm có 2 thành viên");
                        break;
                    case 3:
                        System.out.println("Nhóm có 3 thành viên");
                        break;
                    default:
                        System.out.println("Nhóm nhiều thành viên");
                        break;
                }
            }
    }    // Switch case
    public static void ques6(Account acc){
        if (acc.groups == null){
            System.out.println("Nhân viên  chưa tham gia group");
        }else
        {
            switch (acc.groups.length){
                case 1:
                    System.out.println("Nhân viên thuộc group Fresher");
                    break;
                case 2:
                    System.out.println("Nhân viên tham gia 2 group");
                    break;
                case 3:
                    System.out.println("Nhân viên tham gia 3 Group");
                    break;
                default:
                    System.out.println("Nhân viên hóng chuyện tham gia nhiều Group");
                    break;
            }
        }

    }
    public static void ques7(Account acc){
        String pName = acc.position.name.toString();
        switch (pName){
            case "DEV":
                System.out.println("Đây là Developer");
                break;
            default:
                System.out.println("Người này không phải Dev");
                break;
        }
    }
    public static void ques8(Account a, Account b, Account c){
        Account[] accArray={a, b,c};
        for (Account account: accArray){
            System.out.println("AccountID: "+account.id +
                    "\t Email: "+ account.email +
                    "\t Name: "+ account.fullName);
            System.out.println();
        }
    } // Foreach
    public static void ques9(Department a,Department b, Department c){
        Department[] depArray = {a,b,c};
        for (Department department: depArray){
            System.out.println("DepID: "+ department.id + "\t Name: "+ department.name);
            System.out.println();
        }
    }
    public static void ques10(Account a, Account b){
        Account[] accArray = {a,b};
        for (int i =0; i<accArray.length;i++){
            System.out.println("Thôn tin account thứ "+(i+1) + " là:");
            System.out.println("Email: "+ accArray[i].email + "\t Full name: "+
                    accArray[i].fullName +"\t Phòng ban: "+ accArray[i].department.name);
            System.out.println();
        }
    }
    public static void ques11(Department a,Department b, Department c){
        Department[] depArray = {a,b,c};
        for (int i=0; i< depArray.length;i++){
            System.out.println("Thông tin phòng ban thứ "+ (i+1)+" là:");
            System.out.println("ID: "+ depArray[i].id + "\t Name: "+depArray[i].name);
            System.out.println();
        }
    }
    public static void ques12(Department a,Department b, Department c){
        Department[] depArray = {a,b,c};
        for (int i=0; i< 2;i++){
            System.out.println("Thông tin phòng ban thứ "+ (i+1)+" là:");
            System.out.println("ID: "+ depArray[i].id + "\t Name: "+depArray[i].name);
            System.out.println();
        }
    }
    public static void ques13(Account a, Account b, Account c){
        Account[] accArray = {a,b, c};
        for (int i =0; i<accArray.length;i++){
            if (i!=1) {
                System.out.println("Thôn tin account thứ " + (i + 1) + " là:");
                System.out.println("Email: " + accArray[i].email + "\t Full name: " +
                        accArray[i].fullName + "\t Phòng ban: " + accArray[i].department.name);
                System.out.println();
            }
        }
    }
    public static void ques14(Account a, Account b, Account c){
        Account[] accArray = {a,b, c};
        for (int i =0; i<accArray.length;i++){
            if (accArray[i].id < 4) {
                System.out.println("Thôn tin account thứ " + (i + 1) + " là:");
                System.out.println("ID: "+accArray[i].id+"\t Email: " + accArray[i].email + "\t Full name: " +
                        accArray[i].fullName + "\t Phòng ban: " + accArray[i].department.name);
                System.out.println();
            }
        }
    }
    public static void ques15(){
        for (int i=1;i<=20; i++){
            if (i%2 ==0)
            System.out.print(i +"\t");
        }
    }
}