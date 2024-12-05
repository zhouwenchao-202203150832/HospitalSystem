package cn.edu.zjut.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    private Session session;

    public void setSession(Session session) {
        this.session = session;
    }

    public List findByHql(String hql) {
        try {
            String queryString = hql;
            Query queryObject = session.createQuery(queryString);
            System.out.println("item is found"); // 这行可以保留以指示查询执行，但建议更改为更准确的消息
            return queryObject.list();
        } catch (RuntimeException re) {
            // 不再记录日志，但异常仍然被捕获并重新抛出
            System.out.println("An error occurred: " + re.getMessage()); // 可选的，打印异常信息
            throw re;
        } finally {

        }
    }
}
