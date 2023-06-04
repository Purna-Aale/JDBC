package StdEncap;

public class Encap {

    String name;
    String email;
    String phone;
    String gender;
    String faculty;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Encap(String name, String email, String phone, String gender, String faculty) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.faculty = faculty;
    }

    public Encap(String phone) {
        this.phone = phone;
    }

}
