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
public class Campus {
    private String name;
    private List<Faculty> facultiesBelongs;
    private List<Professor> professorsOf;
    private List<Student> studentsOf;

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Faculty> getFacultiesBelongs() {
        return facultiesBelongs;
    }

    public void setFacultiesBelongs(List<Faculty> facultiesBelongs) {
        this.facultiesBelongs = facultiesBelongs;
    }

    public List<Professor> getProfessorsOf() {
        return professorsOf;
    }

    public void setProfessorsOf(List<Professor> professorsOf) {
        this.professorsOf = professorsOf;
    }

    public List<Student> getStudentsOf() {
        return studentsOf;
    }

    public void setStudentsOf(List<Student> studentsOf) {
        this.studentsOf = studentsOf;
    }
    
    
}
