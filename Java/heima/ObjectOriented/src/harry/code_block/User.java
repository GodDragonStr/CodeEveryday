package harry.code_block;

import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    private String userName;
    private String password;
    private long registrationTime;

    private String dateTime;

    public static void main(String[] args) {
        Date date = new Date();


        User u1 = new User();
        System.out.println(u1.getUserName());
        System.out.println(u1.getRegistrationTime());
    }

    {
        System.out.println("新用户注册");
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyMMdd");
        this.dateTime = dateFormat.format(date);
        this.registrationTime = Integer.parseInt(this.dateTime);
    }

    User() {
        userName = this.dateTime;
        password = "123456";
    }

    User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(long registrationTime) {
        this.registrationTime = registrationTime;
    }

    public String getInfo() {
        return "info";
    }

}
