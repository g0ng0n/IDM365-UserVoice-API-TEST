package com.idm.service.uservoice.dao.impl;

import com.idm.service.uservoice.dao.ArticleDAO;
import com.uservoice.Client;
import com.uservoice.UserVoiceApi;
import net.sf.json.JSONObject;

/**
 * Created by gonzalo.gisbert on 4/15/2015.
 */
public class ArticleDAOImpl implements ArticleDAO {


    @Override
    public String getAllArticles(){

        com.uservoice.Client client = new Client("idm365","V5pctvVn9NtDpiTifWl4Ig","33D2r4b0TWJTrC0Y67FUHVRl0rk9MOCaD3BtiPHYQw8");

        JSONObject response = client.get("/api/v1/articles");

        return response.toString();
    }

    @Override
    public String getArticle(String id) {
        com.uservoice.Client client = new Client("idm365","V5pctvVn9NtDpiTifWl4Ig","33D2r4b0TWJTrC0Y67FUHVRl0rk9MOCaD3BtiPHYQw8");

        JSONObject response = client.get("/api/v1/articles/"+id);

        return response.toString();
    }


}
