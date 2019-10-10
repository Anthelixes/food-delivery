package main.user;

import javax.persistence.*;
import java.sql.DatabaseMetaData;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @Column(name = "username", length = 30)
    private String username;

    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "nickname", length = 20)
    private String nickname;

    @Column(name = "address", length = 60)
    private String address;

    @Column(name = "password")
    private String password;

    public User() {
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Id
    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}