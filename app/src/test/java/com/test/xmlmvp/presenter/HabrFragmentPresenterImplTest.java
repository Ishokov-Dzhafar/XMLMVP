package com.test.xmlmvp.presenter;

import com.test.xmlmvp.model.response.Rss;
import com.test.xmlmvp.model.response.TestRss;

import org.junit.Test;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import static org.junit.Assert.*;

/**
 * Created by dzhafar on 09.04.18.
 */
public class HabrFragmentPresenterImplTest {

    @Test
    public void getHabrData() throws Exception {
    }

    @Test
    public void onSuccessRequest() throws Exception {
        Rss habrRes = new TestRss().getData();
        assertEquals("https://habrahabr.ru/posts/collective/all/", habrRes.getChannel().getLink());
        assertNotEquals("/habrahabr.ru/posts/collective/all/", habrRes.getChannel().getLink());
    }

    @Test
    public void onFailedRequest() throws Exception {
    }

}