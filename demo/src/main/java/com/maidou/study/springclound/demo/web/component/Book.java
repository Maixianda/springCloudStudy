package com.maidou.study.springclound.demo.web.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("${book.name}")
    private String m_name;
    @Value("${book.author}")
    private String m_author;
    @Value("${book.desc}")
    private String m_desc;

    public String getM_desc() {
        return m_desc;
    }

    public void setM_desc(String m_desc) {
        this.m_desc = m_desc;
    }

    public String getname() {
        return m_name;
    }

    public void setname(String m_name) {
        this.m_name = m_name;
    }

    public String getauthor() {
        return m_author;
    }

    public void setauthor(String m_author) {
        this.m_author = m_author;
    }
}
