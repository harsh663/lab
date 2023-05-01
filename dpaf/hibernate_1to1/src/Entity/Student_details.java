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
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 *
 * @author Rushi Bhalodiya
 */
@Entity
@Table(name="STUDENT_DETAILS")
public class Student_details {

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="student_id")
    private Student student;
    
    @Id
    @GeneratedValue(generator="newGenerator")
    @GenericGenerator(name="newGenerator",strategy="foreign",parameters={@Parameter(value="student",name="property")})
    private int student_id;
    private String student_address;

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_address() {
        return student_address;
    }

    public void setStudent_address(String student_address) {
        this.student_address = student_address;
    }

    public void setStudent(Student student) {
    this.student=student;
    }
}


