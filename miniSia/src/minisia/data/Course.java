/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minisia.data;

import java.util.List;

/**
 *
 * @author jucarmonam
 */
public class Course {
    private int number;
    private String name;
    private List<Group> groupsOffered;
    private Faculty belongTo;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Group> getGroupsOffered() {
        return groupsOffered;
    }

    public void setGroupsOffered(List<Group> groupsOffered) {
        this.groupsOffered = groupsOffered;
    }

    public Faculty getBelongTo() {
        return belongTo;
    }

    public void setBelongTo(Faculty belongTo) {
        this.belongTo = belongTo;
    }
}
