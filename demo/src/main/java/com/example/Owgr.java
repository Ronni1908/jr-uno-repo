package com.example;

/**
 * Created by jro on 27.10.2016.
 */


public class Owgr {

    private Long ThisWeek;
    private Long LastWeek;
    private Long End2015;
    private String Country;
    private String Name;
    private String Avg_points;
    private String Tot_points;
    private Long Events_played;
    private String Points_lost_2016;
    private String Points_gained_2016;
    private Long Events_played_act;
    private String Rank_Dato;

    public Owgr(Long thisWeek, Long lastWeek, Long end2015, String country, String name, String avgPoints, String totPoints, Long eventsPlayed, String pointsLost2016, String pointsGained2016, Long eventsPlayedAct, String rankDato) {
        ThisWeek = thisWeek;
        LastWeek = lastWeek;
        End2015 = end2015;
        Country = country;
        Name = name;
        Avg_points = avgPoints;
        Tot_points = totPoints;
        Events_played = eventsPlayed;
        Points_lost_2016 = pointsLost2016;
        Points_gained_2016 = pointsGained2016;
        Events_played_act = eventsPlayedAct;
        Rank_Dato = rankDato;
    }

    public Long getThisWeek() {
        return ThisWeek;
    }

    public void setThisWeek(Long thisWeek) {
        ThisWeek = thisWeek;
    }

    public Long getLastWeek() {
        return LastWeek;
    }

    public void setLastWeek(Long lastWeek) {
        LastWeek = lastWeek;
    }

    public Long getEnd2015() {
        return End2015;
    }

    public void setEnd2015(Long end2015) {
        End2015 = end2015;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAvgPoints() {
        return Avg_points;
    }

    public void setAvgPoints(String avgPoints) {
        Avg_points = avgPoints;
    }

    public String getTotPoints() {
        return Tot_points;
    }

    public void setTotPoints(String totPoints) {
        Tot_points = totPoints;
    }

    public Long getEventsPlayed() {
        return Events_played;
    }

    public void setEventsPlayed(Long eventsPlayed) {
        Events_played = eventsPlayed;
    }

    public String getPointsLost2016() {
        return Points_lost_2016;
    }

    public void setPointsLost2016(String pointsLost2016) {
        Points_lost_2016 = pointsLost2016;
    }

    public String getPointsGained2016() {
        return Points_gained_2016;
    }

    public void setPointsGained2016(String pointsGained2016) {
        Points_gained_2016 = pointsGained2016;
    }

    public Long getEventsPlayedAct() {
        return Events_played_act;
    }

    public void setEventsPlayedAct(Long eventsPlayedAct) {
        Events_played_act = eventsPlayedAct;
    }

    public String getRankDato() {
        return Rank_Dato;
    }

    public void setRankDato(String RankDato) {
        Rank_Dato = RankDato;
    }

}


//CREATE TABLE `owgr_players` (
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
//        ;
