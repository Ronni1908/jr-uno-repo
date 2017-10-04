package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;

/**
 * Created by jro on 26.10.2016.
 */
@Component
public class BirdService {

/**
 * Created by jro on 03.10.2016.
 */

    private JdbcTemplate jdbcTemplate;

    @Autowired
    //   private NamedParameterJdbcTemplate jdbcTemplate;

    public void setDataSource2(DataSource dataSource2) {
        //      jdbcTemplate = new  NamedParameterJdbcTemplate(dataSource2);
        jdbcTemplate = new  JdbcTemplate(dataSource2);
    }

    public List<Bird> findAll() {
        return jdbcTemplate.query(
                "SELECT Navn,Lengde FROM Bird",
                (rs, rowNum) -> new Bird( rs.getString("Navn"),rs.getLong("Lengde")));
    }


}