package StdController;

import StdEncap.Encap;
import StdUtil.Util;

public class Controller {
    private final Util util;
    public  Controller()
    {
       util=new Util();

    } public void addUser(String name,String email,String phone,String gender,String faculty)
    {
        Encap user=new Encap(name,email,phone,gender,faculty);
        util.addUser(user);
    }
    public void update(String name,String email,String phone,String gender,String faculty)
    {
        Encap user=new Encap(name,email,phone,gender,faculty);
        util.update(user);
    }
    public void delete(String phone)
    {
        Encap user=new Encap(phone);
        util.delete(user);
    }

}
