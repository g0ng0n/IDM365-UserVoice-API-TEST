package com.idm.service.uservoice.webservice.impl;

import com.idm.service.uservoice.service.ArticleService;
import com.idm.service.uservoice.webservice.ArticleRestService;

import javax.ws.rs.core.Response;

/**
 * Created by gonzalo.gisbert on 4/15/2015.
 */
public class ArticleRestServiceImpl implements ArticleRestService {

    private ArticleService articleService;

    @Override
    public Response retrieveArticles() {

        String response = articleService.getAllArticles();

        return Response.ok(response).build();
    }


    @Override
    public Response getArticle(String id){

        String response = articleService.getArticle(id);

        return Response.ok(response).build();
    }


    public ArticleService getArticleService() {
        return articleService;
    }

    public void setArticleService(ArticleService articleService) {
        this.articleService = articleService;
    }
}
