package org.dxc;

public class Users {

    private int id;
    private String username;
    private String email;
    private String password;
    private String city;

    public Users(int id, String username, String email, String password, String city) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
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
}
