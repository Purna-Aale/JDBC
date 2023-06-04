package Beanclass;
public class DisplayStudent {
    public  void display(Student std)
    {
        System.out.println("roll:"+std.getRoll());
        System.out.println("name:"+std.getName());
    }
    public  static  void main(String args[])
    {
        Student obj=new Student();
        obj.setRoll(01);
        obj.setName("purna");
        DisplayStudent obj2=new DisplayStudent();
        obj2.display(obj);
    }
}
