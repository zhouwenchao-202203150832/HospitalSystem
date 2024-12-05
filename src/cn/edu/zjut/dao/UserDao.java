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
            System.out.println("item is found"); // ���п��Ա�����ָʾ��ѯִ�У����������Ϊ��׼ȷ����Ϣ
            return queryObject.list();
        } catch (RuntimeException re) {
            // ���ټ�¼��־�����쳣��Ȼ�����������׳�
            System.out.println("An error occurred: " + re.getMessage()); // ��ѡ�ģ���ӡ�쳣��Ϣ
            throw re;
        } finally {

        }
    }
}
