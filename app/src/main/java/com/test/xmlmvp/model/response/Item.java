package com.test.xmlmvp.model.response;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by dzhafar on 07.04.18.
 */
@Root(name = "item")
public class Item {
    @Element
    private Guid guid;

    @Element
    private String pubDate;

    @Element
    private String title;

    @ElementList(inline = true, entry = "category")
    private List<String> categoryes;

    @Element
    private String description;

    @Element
    private String link;

    @Namespace(prefix = "dc")
    @Element
    private String creator;

    public Guid getGuid ()
    {
        return guid;
    }

    public void setGuid (Guid guid)
    {
        this.guid = guid;
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

    public List<String> getCategoryes() {
        return categoryes;
    }

    public void setCategoryes(List<String> categoryes) {
        this.categoryes = categoryes;
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

    @Override
    public String toString()
    {
        return "ClassPojo [guid = "+guid+", pubDate = "+pubDate+", title = "+title+", category = "+categoryes+", description = "+description+", link = "+link+"]";
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
}
