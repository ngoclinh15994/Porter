package Model;

import javax.persistence.*;

/**
 * Created by ngocl on 11/30/2015.
 */
@Entity
@Table(name = "user", uniqueConstraints = {@UniqueConstraint(columnNames = {"id"})})
public class User {
    private int id;
    private String UserName;
    private String PassWord;
    private String togle;
    private String firstName;
    private String lastName;
    private String Email;
    private int type;

    public User(int id, String userName, String passWord, String togle, String firstName, String lastName, String email, int type) {
        this.id = id;
        UserName = userName;
        PassWord = passWord;
        this.togle = togle;
        this.firstName = firstName;
        this.lastName = lastName;
        Email = email;
        this.type = type;
    }

    public User() {
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
@Column(name = "email")
    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Column(name = "username")
    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    @Column(name = "password")
    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String passWord) {
        PassWord = passWord;
    }

    @Column(name = "togle")
    public String getTogle() {
        return togle;
    }

    public void setTogle(String togle) {
        this.togle = togle;
    }

    @Column(name = "firstname")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "lastname")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
@Column(name = "type")
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
