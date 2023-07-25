import Database.Account;
import Database.Department;
import Database.Group;

public class Ex1 {
    public static void Print(Account acc){
        System.out.println("Thông tin Account trên hệ thống:");
        System.out.println(" ID : " + acc.id + "\n Email: " +
                acc.email + "\n UserName: " + acc.userName
                + "\n FullName: " + acc.fullName + "\n Database.Department: " +
                acc.department.name + "\n Database.Position: "
                + acc.position.name + "\n Database.Group: "+
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
            System.out.println("Nhân viên chưa có Database.Group");
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
            System.out.println("Database.Group chưa có thành viên");
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
                    System.out.println("Nhân viên tham gia 3 Database.Group");
                    break;
                default:
                    System.out.println("Nhân viên hóng chuyện tham gia nhiều Database.Group");
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
    public static void ques9(Department a, Department b, Department c){
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


