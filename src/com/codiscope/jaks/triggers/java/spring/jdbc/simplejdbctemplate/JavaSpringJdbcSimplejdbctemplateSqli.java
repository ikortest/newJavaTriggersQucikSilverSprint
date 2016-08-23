package com.codiscope.jaks.triggers.java.spring.jdbc.simplejdbctemplate;

import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.jdbc.datasource.DelegatingDataSource;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * The Class JavaSpringJdbcSimplejdbctemplateSqli
 */
public class JavaSpringJdbcSimplejdbctemplateSqli {

    public void possessiveTest() {

        SimpleJdbcTemplate jdbcTemplate = new SimpleJdbcTemplate(new DelegatingDataSource());
        jdbcTemplate.query("", new ParameterizedBeanPropertyRowMapper<Object>(), new HashMap<String, Object>());
        jdbcTemplate.update("", new HashMap<String, Object>());
        jdbcTemplate.batchUpdate("", new ArrayList<Object[]>());
    }

    public void negativeTest() {

        SimpleJdbcTemplate jdbcTemplate = new SimpleJdbcTemplate(new DelegatingDataSource());
        jdbcTemplate.queryForMap("", new HashMap<String, Object>());
        jdbcTemplate.queryForList("", new ArrayList<String>());
    }
}
