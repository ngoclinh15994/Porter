package Dao;

import Model.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by ngocl on 11/10/2015.
 */
@Repository
public class UserDao {
    private SessionFactory sessionFactory;

    public UserDao() {
    }

    public User selectUser(User user) {
        Session session = (Session) HibernateUtil.getSession();
        session.beginTransaction();
        Query query = (Query) session.createQuery("select  u from User u where u.userName=:username and u.passWord=:password");
        query.setParameter("username", user.getUserName());
        query.setParameter("password", user.getPassWord());
        List list = query.list();
        if (list.size() > 0) {
            User newUser = (User) list.get(0);
            session.close();
            return newUser;
        } else {
            session.close();
            return null;
        }

    }
    public User selectUserById(int id) {
        Session session = (Session) HibernateUtil.getSession();
        session.beginTransaction();
        Query query = (Query) session.createQuery("select  u from User u where u.id=:id");
        query.setParameter("id", id);
        List list = query.list();
        if (list.size() > 0) {
            User newUser = (User) list.get(0);
            session.close();
            return newUser;
        } else {
            session.close();
            return null;
        }

    }
    public boolean updateUser(User user){
//        Session session = (Session) HibernateUtil.getSession();
//        session.beginTransaction();
////        Query query = (Query) session.createQuery("INSERT INTO  User(firstName,lastName,birthday,type,userName,passWord,description,price) select firstName,lastName,birthday,type,userName,passWord,description,description,price from User user ");
//        String sql = "insert into user_info(firstName,lastName,birthday,type,userName,passWord,description,price) values (?,?,?,?,?,?,?,?)";
//        Query query = session.createSQLQuery("" + "update user_info set firstName=?,lastName=?,birthday=?,description=?");
//        query.setParameter(0, user.getFirstName());
//        query.setParameter(1, user.getLastName());
//        query.setParameter(2, user.getBirthday());
//        query.setParameter(3,user.getDescription());
//
//        int result = query.executeUpdate();
//        session.getTransaction().commit();
////        query.setParameter("username", user.getUserName());
////        query.setParameter("password", user.getPassWord());
//
//        if (result > 0) {
//            return true;
//        } else return false;
        return false;

    }
    public User Regiter(User user) {
        Session session = (Session) HibernateUtil.getSession();
        session.beginTransaction();
//        Query query = (Query) session.createQuery("INSERT INTO  User(firstName,lastName,birthday,type,userName,passWord,description,price) select firstName,lastName,birthday,type,userName,passWord,description,description,price from User user ");
//     String sql = "insert into user_info(firstName,lastName,birthday,type,userName,passWord,description,price) values (?,?,?,?,?,?,?,?)";
//       Query query = session.createSQLQuery("" + "insert into user_info(firstName,lastName,type,userName,passWord) values (?,?,?,?,?,?)");
//query.setParameter(0, user.getFirstName());
//query.setParameter(1, user.getLastName());
//query.setParameter(3, user.getType());
//query.setParameter(4, user.getUserName());
//query.setParameter(5, user.getPassWord());
//        int result = query.executeUpdate();
User user1 = (User) session.save(user);
session.getTransaction().commit();
//        query.setParameter("username", user.getUserName());
//        query.setParameter("password", user.getPassWord());
return user1;
    }
}
