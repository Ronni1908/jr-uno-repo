package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;

/**
 * Created by jro on 27.10.2016.
 */

@Component
public class OwgrService {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    //   private NamedParameterJdbcTemplate jdbcTemplate;

    public void setDataSource2(DataSource dataSource2) {
        //      jdbcTemplate = new  NamedParameterJdbcTemplate(dataSource2);
        jdbcTemplate = new JdbcTemplate(dataSource2);
    }

    public List<Owgr> findAll() {
        return jdbcTemplate.query(
                "SELECT This_week, Last_week,End_2015,Country,Name,Avg_points,Tot_points,Events_played,Points_lost_2016,Points_gained_2016,Events_played_act,Rank_Dato from owgr_players " +
                        "where This_week <= 1000",
                (rs, rowNum) -> new Owgr(rs.getLong("this_week"), rs.getLong("last_week"), rs.getLong("end_2015"),
                        rs.getString("country"), rs.getString("name"), rs.getString("avg_points"),
                        rs.getString("tot_points"), rs.getLong("events_played"), rs.getString("points_lost_2016"),
                        rs.getString("points_gained_2016"), rs.getLong("events_played_act"),rs.getString("rank_dato")));
    }
}

//    CREATE TABLE `owgr_players` (
//        `This_week` INT(5) NULL DEFAULT NULL,
//        `Last_week` INT(5) NULL DEFAULT NULL,
//        `End_2015` INT(5) NULL DEFAULT NULL,
//        `Country` VARCHAR(3) NOT NULL,
//        `Name` VARCHAR(300) NOT NULL,
//        `Avg_points` VARCHAR(10) NULL DEFAULT NULL,
//        `Tot_points` VARCHAR(10) NULL DEFAULT NULL,
//        `Events_played` INT(5) NULL DEFAULT NULL,
//        `Points_lost_2016` VARCHAR(10) NULL DEFAULT NULL,
//        `Points_gained_2016` VARCHAR(10) NULL DEFAULT NULL,
//        `Events_played_act` INT(5) NULL DEFAULT NULL
//        )
//        COLLATE='latin1_swedish_ci'
//        ENGINE=InnoDB