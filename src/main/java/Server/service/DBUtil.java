package Server.service;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.io.Serializable;
import java.util.List;

public class DBUtil {
    public static <T> List<T> loadAllData(Class<T> type, Session session) {
        session.beginTransaction();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<T> criteria = builder.createQuery(type);
        criteria.from(type);
        List<T> data = session.createQuery(criteria).getResultList();
        session.getTransaction().commit();
        return data;
    }
    public static <T> void addData(T newItem, Session session) {
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.saveOrUpdate(newItem);
            tx.commit();

        } catch (HibernateException ex) {
            if (tx != null) tx.rollback();
            ex.printStackTrace();
        } finally {
            session.close();
        }
    }
    public static <T,K> void deleteData(T primaryID, Class<K> cl,Session session){
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            K item =(K) session.load(cl,(Serializable) primaryID);
            if(item!=null){
                session.delete(item);
            }
            tx.commit();

        } catch (HibernateException ex) {
            if (tx != null) tx.rollback();
            ex.printStackTrace();
        } finally {
            session.close();
        }
    }
    public static <T,K> K GetDataByID(T primaryID,Class<K> cl,Session session){
        Transaction tx=null;
        try {
            tx = session.beginTransaction();
            K item=(K)session.get(cl,(Serializable) primaryID);
            tx.commit();
            return item;
        }catch (HibernateException ex){
            if (tx != null) tx.rollback();
            ex.printStackTrace();
        }
        return null;
    }
}
