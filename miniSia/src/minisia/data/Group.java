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
public class Group {
    private int number;
    private String[] daysOfWeek;
    private String[] timesOfDay;
    private String semester;
    private Course represent;
    private Professor taughtBy;
    private List<Student> attendetBy;
    private List<Grade> issues;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String[] getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(String[] daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    public String[] getTimesOfDay() {
        return timesOfDay;
    }

    public void setTimesOfDay(String[] timesOfDay) {
        this.timesOfDay = timesOfDay;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public Course getRepresent() {
        return represent;
    }

    public void setRepresent(Course represent) {
        this.represent = represent;
    }

    public Professor getTaughtBy() {
        return taughtBy;
    }

    public void setTaughtBy(Professor taughtBy) {
        this.taughtBy = taughtBy;
    }

    public List<Student> getAttendetBy() {
        return attendetBy;
    }

    public void setAttendetBy(List<Student> attendetBy) {
        this.attendetBy = attendetBy;
    }

    public List<Grade> getIssues() {
        return issues;
    }

    public void setIssues(List<Grade> issues) {
        this.issues = issues;
    }
    
}
