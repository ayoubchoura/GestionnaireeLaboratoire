package com.example.tp.beans;

import java.util.Date;

public class OutilBean {
    private Long id;
    private Date date;
    private String source;

    public OutilBean(Long id, Date date, String source) {
        this.id = id;
        this.date = date;
        this.source = source;
    }

    public OutilBean() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
