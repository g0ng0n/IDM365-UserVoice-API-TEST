package com.idm.service.uservoice.service.impl;

import com.idm.service.uservoice.dao.ArticleDAO;
import com.idm.service.uservoice.service.ArticleService;


/**
 * Created by gonzalo.gisbert on 4/15/2015.
 */
public class ArticleServiceImpl implements ArticleService {

    private ArticleDAO articleDao;

    @Override
    public String getAllArticles(){


        return articleDao.getAllArticles();

    }

    public ArticleDAO getArticleDao() {
        return articleDao;
    }

    public void setArticleDao(ArticleDAO articleDao) {
        this.articleDao = articleDao;
    }
}
