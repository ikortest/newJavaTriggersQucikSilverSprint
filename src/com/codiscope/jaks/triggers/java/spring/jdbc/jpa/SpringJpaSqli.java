package com.codiscope.jaks.triggers.java.spring.jdbc.jpa;

import org.springframework.orm.jpa.JpaTemplate;

import java.util.HashMap;

/**
 * The Class SpringJpaSqli
 */
public class SpringJpaSqli {

    public void possessiveTest() {

        JpaTemplate jpaTemplate = new JpaTemplate();
        jpaTemplate.findByNamedParams("", new HashMap<String, Object>());
        jpaTemplate.findByNamedQuery("query");
        jpaTemplate.findByNamedQuery("query", new Object());
    }

    public void negativeTest() {

        JpaTemplate jpaTemplate = new JpaTemplate();
        jpaTemplate.find("");
        jpaTemplate.find(SpringJpaSqli.class, new Object());
    }
}
