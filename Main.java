import java.time.LocalDate;
import java.util.Date;

import static java.util.Date.*;

public class Main {

    public static void main(String[] args) {
        //Question 2: Khởi tạo

        // Tạo Department
        Department dep1 = new Department();
        dep1.id = 1;
        dep1.name = "Marketing";

        Department dep2 = new Department();
        dep2.id = 2;
        dep2.name = "Sale";

        Department dep3 = new Department();
        dep3.id = 3;
        dep3.name = "Dev";

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
        Group[] groupAcc1 = {group1, group2};
        acc1.groups = groupAcc1;

        Account acc2 = new Account();
        acc2.id = 2;
        acc2.email = "email2";
        acc2.userName = "username2";
        acc2.fullName = "fullname2";
        acc2.department = dep2;
        acc2.position = pos2;
        acc2.createDate = LocalDate.of(2023,06,15);
        acc2.groups = new Group[] {group3, group2};

        Account acc3 = new Account();
        acc3.id = 3;
        acc3.email = "email3";
        acc3.userName = "username3";
        acc3.fullName = "fullname3";
        acc3.department = dep3;
        acc3.position = pos3;
        acc3.createDate = LocalDate.now();

        //Question 3: xuất màn hình
        System.out.println("Thông tin các Account trên hệ thống:");
        System.out.println("Account 1 \n"+ " ID : " + acc1.id + "\n Email: " +
                acc1.email + "\n UserName: " + acc1.userName
                + "\n FullName: " + acc1.fullName + "\n Department: " +
                acc1.department.name + "\n Position: "
                + acc1.position.name + "\n Group: "+
                acc1.groups[0].name +" "+ acc1.groups[1].name + "\n CreateDate: " +
                acc1.createDate);
    }
}