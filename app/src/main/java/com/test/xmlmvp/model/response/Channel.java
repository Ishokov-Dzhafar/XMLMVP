package com.test.xmlmvp.model.response;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by dzhafar on 07.04.18.
 */
@Root(name = "channel")
public class Channel {

    @Element
    private String pubDate;
    @Element
    private String title;
    @Element
    private String managingEditor;
    @Element
    private String description;
    @Element
    private String link;
    @Element(required = false)
    private String lastBuildDate;
    @ElementList(inline = true, name = "item")
    private List<Item> item;

    @Element
    private String generator;
    @Element
    private Image image;
    @Element
    private String language;

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }

    public String getPubDate ()
    {
        return pubDate;
    }

    public void setPubDate (String pubDate)
    {
        this.pubDate = pubDate;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getManagingEditor ()
    {
        return managingEditor;
    }

    public void setManagingEditor (String managingEditor)
    {
        this.managingEditor = managingEditor;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getLink ()
    {
        return link;
    }

    public void setLink (String link)
    {
        this.link = link;
    }

    public String getLastBuildDate ()
    {
        return lastBuildDate;
    }

    public void setLastBuildDate (String lastBuildDate)
    {
        this.lastBuildDate = lastBuildDate;
    }

    public String getGenerator ()
    {
        return generator;
    }

    public void setGenerator (String generator)
    {
        this.generator = generator;
    }

    public Image getImage ()
    {
        return image;
    }

    public void setImage (Image image)
    {
        this.image = image;
    }

    public String getLanguage ()
    {
        return language;
    }

    public void setLanguage (String language)
    {
        this.language = language;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [pubDate = "+pubDate+", title = "+title+", managingEditor = "+managingEditor+", description = "+description+", link = "+link+", lastBuildDate = "+lastBuildDate+", item = "+item+", generator = "+generator+", image = "+image+", language = "+language+"]";
    }
}
