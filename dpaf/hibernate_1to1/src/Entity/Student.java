/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 *
 * @author Rushi Bhalodiya
 */
@Entity
public class Student {
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="student_id")
    private Student_details sd;
    
    @Id
    @GeneratedValue
    private int student_id;
    private String student_name;

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public Student_details getSd() {
        return sd;
    }

    public void setSd(Student_details sd) {
        this.sd = sd;
    }
}
