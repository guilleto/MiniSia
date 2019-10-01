/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minisia.data;

/**
 *
 * @author jucarmonam
 */
public class Grade {
    private double grade;
    private Student receivedBy;
    private Group issuedBy;

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public Student getReceivedBy() {
        return receivedBy;
    }

    public void setReceivedBy(Student receivedBy) {
        this.receivedBy = receivedBy;
    }

    public Group getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(Group issuedBy) {
        this.issuedBy = issuedBy;
    }
}
