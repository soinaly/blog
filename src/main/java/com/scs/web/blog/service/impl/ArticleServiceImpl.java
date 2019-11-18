package com.scs.web.blog.service.impl;


import com.scs.web.blog.dao.ArticleDao;
import com.scs.web.blog.domain.vo.ArticleVo;
import com.scs.web.blog.factory.DaoFactory;
import com.scs.web.blog.service.ArticleService;
import com.scs.web.blog.util.Result;
import com.scs.web.blog.util.ResultCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLException;
import java.util.List;
/**
 * @author wenjie_lin
 * @ClassName ArticleServiceImpl
 * @Description TODO
 * @Data 2019/11/18
 * @Version 1.0
 **/

public class ArticleServiceImpl implements ArticleService {
    private ArticleDao articleDao = DaoFactory.getArticleDaoInstance();
    private static Logger logger = LoggerFactory.getLogger(ArticleServiceImpl.class);

    @Override
    public Result getHotArticles() {
        List<ArticleVo> articleVoList = null;
        try {
            articleVoList = articleDao.selectHotArticles();
        } catch (SQLException e) {
            logger.error("查询热门文章出现异常");
        }
        if (articleVoList != null) {
            return Result.success(articleVoList);
        }
        return Result.failure(ResultCode.RESULT_CODE_DATA_NONE);
    }

    @Override
    public Result getPageArticles(int currentPage, int pageCount) {
        return null;
    }

    @Override
    public Result getArticle(long id) {
        return null;
    }
}