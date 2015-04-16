package com.idm.service.uservoice.webservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.PathParam;

/**
 * Created by gonzalo.gisbert on 4/15/2015.
 */
public interface ArticleRestService {

    /**
     * Returns a list of articles from the UserVoice API
     *
     */
     @GET
     @Path("/articles")
     @Produces(MediaType.APPLICATION_JSON)
     Response retrieveArticles();

    /**
     * Returns the data of ONE article by giving the id to the service
     * from the UserVoice API
     */
    @GET
    @Path("/article/{id}/")
    @Produces(MediaType.APPLICATION_JSON)
    Response getArticle(@PathParam("id") String id);

}
