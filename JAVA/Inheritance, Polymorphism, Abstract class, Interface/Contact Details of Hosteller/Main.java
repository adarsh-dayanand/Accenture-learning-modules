import java.util.Scanner;
public class Main{
    public static Hosteller getHostellerDetails()
    {
        Hosteller h1=new Hosteller();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Details:");
        System.out.println("Student Id");
        int a1=sc.nextInt();
        System.out.println("Student Name");
        sc.nextLine();
        String b1=sc.nextLine();
        System.out.println("Department Id");
        int c1=sc.nextInt();
        System.out.println("Gender");
        sc.nextLine();
        String d1=sc.nextLine();
        System.out.println("Phone Number");
        String e1=sc.nextLine();
        System.out.println("Hostel Name");
        String f1=sc.nextLine();
        System.out.println("Room Number");
        int g1=sc.nextInt();
        h1.setStudentId(a1);
        h1.setName(b1);
        h1.setDepartmentId(c1);
        h1.setGender(d1);
        h1.setPhone(e1);
        h1.setHostelName(f1);
        h1.setRoomNumber(g1);
        System.out.println("Modify Room Number(Y/N)");
        char i=sc.next().charAt(0);
        if(i=='Y')
        {
            System.out.println("New Room Number");
            int x1=sc.nextInt();
            h1.setRoomNumber(x1);
        }
        System.out.println("Modify Phone Number(Y/N)");
        char j=sc.next().charAt(0);
        if(j=='Y')
        {
            System.out.println("New Room Number");
            sc.nextLine();
            String y1=sc.nextLine();
            h1.setPhone(y1);
        }
        return h1;
    }
    public static void main(String args[])
    {
        Hosteller h2=new Hosteller();
        h2=getHostellerDetails();
        System.out.println("The Student Details");
        System.out.println(h2.getStudentId()+" "+h2.getName()+" "+h2.getDepartmentId()+" "+h2.getGender()+
        " "+h2.getPhone()+" "+h2.getHostelName()+" "+h2.getRoomNumber());
        
    }
}