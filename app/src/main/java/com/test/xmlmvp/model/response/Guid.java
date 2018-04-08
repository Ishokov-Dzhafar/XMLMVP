package com.test.xmlmvp.model.response;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

/**
 * Created by dzhafar on 07.04.18.
 */
@Root(name = "guid")
public class Guid {

    private String content;

    @Attribute
    private String isPermaLink;

    public String getContent ()
    {
        return content;
    }

    public void setContent (String content)
    {
        this.content = content;
    }

    public String getIsPermaLink ()
    {
        return isPermaLink;
    }

    public void setIsPermaLink (String isPermaLink)
    {
        this.isPermaLink = isPermaLink;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [content = "+content+", isPermaLink = "+isPermaLink+"]";
    }
}
