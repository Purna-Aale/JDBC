package StdUtil;

import StdEncap.Encap;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

import static java.lang.Class.forName;

public class Util {
    Connection conn;
    Statement stmt;
    public Util()
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","");
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void addUser(Encap ep)
    {
        try{
            PreparedStatement pst=conn.prepareStatement("INSERT INTO student (name,email,phone,gender,faculty) values(?,?,?,?,?)");
            pst.setString(1,ep.getName());
            pst.setString(2,ep.getEmail());
            pst.setString(3,ep.getPhone());
            pst.setString(4,ep.getGender());
            pst.setString(5,ep.getFaculty());
            pst.executeUpdate();
        }catch(SQLException sq)
        {
            sq.printStackTrace();
        }
    }
    public void update(Encap ep)
    {

        try{
            PreparedStatement pst1=conn.prepareStatement("UPDATE student SET name=?, email=?, gender=?, faculty=? WHERE phone=?");
            pst1.setString(1,ep.getName());
            pst1.setString(2,ep.getEmail());
            pst1.setString(3,ep.getGender());
            pst1.setString(4,ep.getFaculty());
            pst1.setString(5,ep.getPhone());


            pst1.executeUpdate();
        }catch(SQLException sq)
        {
            sq.printStackTrace();
        }
    }
    public void delete(Encap ep)
    {

        try{
            PreparedStatement pst3=conn.prepareStatement("DELETE from student  WHERE phone=?");
            pst3.setString(1, ep.getPhone());
            pst3.executeUpdate();
        }catch(SQLException sq)
        {
            sq.printStackTrace();
        }
    }

   /* public void display()
    {
        try{
            ResultSet rs=null;
            PreparedStatement pst3=conn.prepareStatement("select  name, email , phone, gender, faculty from student where phone=1");
            DefaultTableModel model=new DefaultTableModel(new String[] {"Name", "Email", "Phone", "Gender", "Faculty"}, 0);
            rs=pst3.executeQuery();
            while(rs.next())
            {
                String name=rs.getString("name");
                String email=rs.getString("email");
                String phone=rs.getString("phone");
                String gender=rs.getString("gender");
                String faculty=rs.getString("faculty");
                model.addRow(new Object[] {name, email, phone, gender, faculty});
            }
            JTable table=new JTable(model);
            JScrollPane src=new JScrollPane(table);
            JOptionPane.showMessageDialog(null,src);

        }catch(SQLException e)
        {
            e.printStackTrace();
        }

*/
   public void display()
   {
       try{
           ResultSet rs=null;
           PreparedStatement pst3=conn.prepareStatement("SELECT * FROM student WHERE phone=?");
           DefaultTableModel model=new DefaultTableModel(new String[] {"Name", "Email", "Phone", "Gender", "Faculty"}, 0);

           rs=pst3.executeQuery();
           while(rs.next())
           {
               /*String name=rs.getString("name");
               String email=rs.getString("email");*/
               String phone=rs.getString("phone");
               /*String gender=rs.getString("gender");
               String faculty=rs.getString("faculty");*/
               model.addRow(new Object[] { phone});
           }
           JTable table=new JTable(model);
           JScrollPane src=new JScrollPane(table);
           JOptionPane.showMessageDialog(null,src);

       }catch(SQLException e)
       {
           e.printStackTrace();
       }

   }
}

