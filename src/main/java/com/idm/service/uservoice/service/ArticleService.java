package com.idm.service.uservoice.service;

import javax.xml.ws.Response;

/**
 * Created by gonzalo.gisbert on 4/15/2015.
 */
public interface ArticleService {


    /**
     * Returns a quick quote for the specified id.
     *
     * @return articlesResponse
     */
    public String getAllArticles();


    /**
     * Returns a quick quote for the specified id.
     *
     * @return articlesResponse
     */
    public String getArticle(String id);


}
