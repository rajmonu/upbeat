package com.raj.upbeat.model;

public class Signup {
    private String firstname;
    private String lastname;
    private String email;
    private String mobile;
    private String  password;

    public Signup(String firstname, String lastname, String email, String mobile, String password){
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.mobile = mobile;
        this.password = password;
    }
    public Signup(){
    }
    public String getfirstname(){
        return firstname;
    }
    public String getlastname(){
        return lastname;
    }
    public String getemail(){
        return email;
    }
    public String getmobile(){
        return mobile;
    }
    public String getpassword(){
        return password;
    }

}
