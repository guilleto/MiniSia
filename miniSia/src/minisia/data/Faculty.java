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
public class Faculty {
     private String name;
     private List<Course> CourseOffered;
     private Campus belongTo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourseOffered() {
        return CourseOffered;
    }

    public void setCourseOffered(List<Course> CourseOffered) {
        this.CourseOffered = CourseOffered;
    }

    public Campus getBelongTo() {
        return belongTo;
    }

    public void setBelongTo(Campus belongTo) {
        this.belongTo = belongTo;
    }
     
}
