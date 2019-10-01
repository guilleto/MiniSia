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
    public class Student {
    private int id;
    private String user;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private List<Group> groupsAttended;
    private List<Grade> gradesReceived;
    private Campus studyIn;

    public Student(int id, String user, String firstName, String lastName, Date birthDate, List<Group> groupsAttended, List<Grade> gradesReceived, Campus studyIn) {
        this.setId(id);
        this.setUser(user);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setBirthDate(birthDate);
        this.setGroupsAttended(groupsAttended);
        this.setGradesReceived(gradesReceived);
        this.setStudyIn(studyIn);
    }
    public Student(int id, String user, String firstName, String lastName, Date birthDate) {
        this.setId(id);
        this.setUser(user);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setBirthDate(birthDate);
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }

    public String getUser() {
        return user;
    }
    
    public void setUser(String user) {
        this.user = user;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    
     public void setGroupsAttended(List<Group> groupsAttended) {
        this.groupsAttended = groupsAttended;
    }

    public List<Group> getGroupsAttended() {
        return groupsAttended;
    }
    
    public void setGradesReceived(List<Grade> gradesReceived) {
        this.gradesReceived = gradesReceived;
    }

    public List<Grade> getGradesReceived() {
        return gradesReceived;
    }
    
    public void setStudyIn(Campus studyIn) {
        this.studyIn = studyIn;
    }

    public Campus getStudyIn() {
        return studyIn;
    }   
    
}
