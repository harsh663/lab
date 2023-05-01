
package Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author Rushi Bhalodiya
 */
public class main {
    public static void main(String[] args){
        Student student=new Student();
        student.setStudent_name("r.k.b. Bhalodiya");
//        Student student1=new Student();
//        student1.setStudent_name("r.b.k. Bhalodiya");
        Student_details sd=new Student_details();
        sd.setStudent_address("Rajkot2");
//        Student_details sd1=new Student_details();
//        sd1.setStudent_address("Junagadh");
//        sd.setStudent(student);
        student.setSd(sd);
        sd.setStudent(student);
//        sd1.setStudent(student1);
        
        SessionFactory sessionFactory=new AnnotationConfiguration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        
        session.save(student);
//        session.save(sd);
//        session.save(sd);
        
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}