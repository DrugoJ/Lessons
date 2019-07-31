
package com.naveed;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Session;

/**
 *
 * @author GoD
 */
@ManagedBean
@SessionScoped
public class Data {
    private Members m;
    private HibernateUtil helper;
    private Session session;
    
    public void addMember(){
        m = new Members("Steve","Luis","Estonia");
        session = helper.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(m);
        session.getTransaction().commit();
        session.close();
    }
}
