package ru.max.projects.SpringSecurityTrial2.dao.managers;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.max.projects.SpringSecurityTrial2.dao.SessionFactoryPool;
import ru.max.projects.SpringSecurityTrial2.dao.models.User;

@Component
public class UserManager {
    SessionFactoryPool sessionFactoryPool;

    @Autowired
    public UserManager(SessionFactoryPool sessionFactoryPool) {
        this.sessionFactoryPool = sessionFactoryPool;
    }

    public User getUser(String login){
        try(Session session = sessionFactoryPool.getSessionFactory().openSession()){
            Query<User> query = session.createQuery("from User where Login = :login", User.class);
            query.setParameter("login", login);
            return query.getSingleResult();
        }
        catch(Exception e){
            System.out.println("no such user");
            return null;
        }
    }
}
