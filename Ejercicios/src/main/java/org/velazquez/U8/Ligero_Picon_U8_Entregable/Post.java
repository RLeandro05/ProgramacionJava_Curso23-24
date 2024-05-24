package org.velazquez.U8.Ligero_Picon_U8_Entregable;

import java.util.List;

public class Post {

    private String title;
    private String link;
    private String description;
    private String pubdate;
    private String listGuids;

    public Post(String title, String link, String description, String pubdate, String guid) {
        this.title = title;
        this.link = link;
        this.description = description;
        this.pubdate = pubdate;
        this.listGuids = guid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPubdate() {
        return pubdate;
    }

    public void setPubdate(String pubdate) {
        this.pubdate = pubdate;
    }

    public String getListGuids() {
        return listGuids.toString();
    }

    public void setListGuids(String listGuids) {
        this.listGuids = listGuids;
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", link='" + link + '\'' +
                ", description='" + description + '\'' +
                ", pubdate='" + pubdate + '\'' +
                ", guid='" + listGuids + '\'' +
                '}';
    }
}
