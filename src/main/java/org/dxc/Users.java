package org.dxc;

public class Users {

    private int id;
    private String username;
    private String email;
    private String password;
    private String city;

    public Users() {
    }

    public Users(int id, String name, String emails, String passwd, String city) {
        this.id = id;
        this.username = name;
        this.email = emails;
        this.password = passwd;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "\n Username is  "+username+"\t\t\tPassword is  "+password;
    }
}
