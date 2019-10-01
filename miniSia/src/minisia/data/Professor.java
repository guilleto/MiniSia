/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minisia.data;

import java.util.Date;
import java.util.List;

/**
 *
 * @author jucarmonam
 */
public class Professor {
    private int id;
    private String user;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private List<Group> groupsTaught;
    private Campus teachIn;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public List<Group> getGroupsTaught() {
        return groupsTaught;
    }

    public void setGroupsTaught(List<Group> groupsTaught) {
        this.groupsTaught = groupsTaught;
    }

    public Campus getTeachIn() {
        return teachIn;
    }

    public void setTeachIn(Campus teachIn) {
        this.teachIn = teachIn;
    }
    
}
