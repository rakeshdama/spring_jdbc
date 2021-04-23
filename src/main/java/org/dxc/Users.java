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

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "\n Username is  "+username+"\t\t\tPassword is  "+password;
    }
}
