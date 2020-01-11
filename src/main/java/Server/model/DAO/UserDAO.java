package Server.model.DAO;

import Server.model.DB.UserEntity;
import Server.service.DBUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;
@Repository
public class UserDAO {
    SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(UserEntity.class).buildSessionFactory();

    public List<UserEntity> getAllAccount() {
        Session s = factory.getCurrentSession();

        List<UserEntity> ls = DBUtil.loadAllData(UserEntity.class, s);
        return Collections.unmodifiableList(ls);
    }
    public void CreateAccount(UserEntity acc){
        Session s = factory.getCurrentSession();
        DBUtil.addData(acc,s);
    }
    public void DeleteAccount(int id){
        Session s= factory.getCurrentSession();
        DBUtil.deleteData(id,UserEntity.class,s);
    }
    public UserEntity GetAccountByID(int id){
        Session s = factory.getCurrentSession();
        UserEntity acc = DBUtil.GetDataByID(id,UserEntity.class,s);
        return acc;
    }


}
