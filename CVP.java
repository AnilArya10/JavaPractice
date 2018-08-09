class Address{

String village;
String city;
String district;
int pincode;
}
class CvpClass{
int id;
String name;
String address;
int batchNo;
Address add;
void display2()
{
  System.out.println("Village: "+add.village+"\nCity: "+add.city+"\nDistrict: "+add.district+"\nPincode: "+add.pincode);
}
}
class CvpStudents extends CvpClass{
String course;
int phoneNo;
int passoutYear;
void display()
{ System.out.println("---------------------------------------------");
  System.out.println("These Details are belongs to CvpStudents");
  System.out.println("---------------------------------------------");  
  System.out.println("Student Name: "+name+"\nStudent ID: "+id+"\nStudent phoneNo: "+phoneNo);
  System.out.println("Student Course: "+course+"\nYear of Passout: "+passoutYear);
  System.out.println("Batch NO: "+batchNo+"\nAddress: "+address);
  display2(); 
}
}
class CvpTeachers extends CvpClass{
String course;
int phoneNo;
String experince;

void display1()
{
  System.out.println("---------------------------------------------");
  System.out.println("These Details are belongs to CvpTeachers");
  System.out.println("----------------------------------------------");
  System.out.println("Name: "+name+"\nID: "+id+"\nphoneNo: "+phoneNo);
  System.out.println("Course: "+course+"\nExperince: "+experince);
  System.out.println("Address: "+address);
  display2();
}
}
class CVP{
public static void main(String args[]){

Address a=new Address();
a.village="korlagundhi";
a.city="Bellary";
a.district="Bellary";
a.pincode=583103;
CvpTeachers t=new CvpTeachers();
t.name="Pundalika";
t.id=10;
t.phoneNo=583;
t.course="Testing";
t.experince="15 Years";
t.address="Bidar";
t.display1();
//display2();
CvpStudents s=new CvpStudents();

Address b=new Address();
b.city="Bellary";
b.district="Bellary";
b.pincode=583103;
s.name="AnilArya";
s.id=11;
s.phoneNo=333;
s.course="Testing";
s.passoutYear=2017;
s.address="Bellary";
s.display();
s.display2();
}
}