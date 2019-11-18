package com.scs.web.blog.factory;


import com.scs.web.blog.dao.ArticleDao;
import com.scs.web.blog.dao.TopicDao;
import com.scs.web.blog.dao.UserDao;
import com.scs.web.blog.dao.impl.ArticleDaoImpl;
import com.scs.web.blog.dao.impl.TopicDaoImpl;
import com.scs.web.blog.dao.impl.UserDaoImpl;
/**
 * @author wenjie_lin
 * @ClassName DaoFactory
 * @Description Dao工厂类
 * @Data 2019/11/18
 * @Version 1.0
 **/

public class DaoFactory {

    public static UserDao getUserDaoInstance() {
        return new UserDaoImpl();
    }

    public static ArticleDao getArticleDaoInstance() {
        return new ArticleDaoImpl();
    }

    public static TopicDao getTopicDaoInstance() {
        return new TopicDaoImpl();
    }

}