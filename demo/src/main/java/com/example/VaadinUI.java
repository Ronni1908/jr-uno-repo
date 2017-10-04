package com.example;

import com.vaadin.annotations.Theme;
import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by jro on 03.10.2016.
 */


@SpringUI
@Theme("valo")
public class VaadinUI extends UI {
    private static final Logger log = LoggerFactory.getLogger(VaadinUI.class);
    @Autowired

    private OwgrService service;

    private Owgr owgr;

    private Grid grid = new Grid();
    private TextField thisWeek = new TextField("This week");
    private TextField name = new TextField("Name");
    private TextField country = new TextField("Country");
    private TextField end2015 = new TextField("End 2015");
    private TextField lastWeek = new TextField("Last week");
    private TextField avgPoints = new TextField("Avg points");
    private TextField totPoints = new TextField("Tot points");
    private TextField eventsPlayed = new TextField("Events played");
    private TextField pointsLost2016 = new TextField("Points lost 2016");
    private TextField pointsGained2016 = new TextField("Points gained 2016");
    private TextField eventsPlayedAct = new TextField("Events played act");


    @Override
    protected void init(VaadinRequest request) {
        log.info("start");
        updateGrid();
        grid.setColumns("thisWeek","lastWeek","end2015","country", "name","avgPoints","totPoints","eventsPlayed","pointsLost2016", "pointsGained2016","eventsPlayedAct");
 //       grid.setColumns("thisWeek", "name","end2015","country");
   //     This_week, Last_week,End_2015,Country,Name,Avg_points,Tot_points,Events_played,Points_lost_2016,Points_gained_2016,Events_played_act
        grid.setWidth("1500px");
        grid.setHeight("600px");
        grid.getColumn("name").setExpandRatio(1);
        grid.addSelectionListener(e -> updateForm());

        VerticalLayout vlayout = new VerticalLayout(grid);
        HorizontalLayout hlayout = new HorizontalLayout(thisWeek, name,country,end2015,lastWeek,avgPoints,totPoints,eventsPlayed,pointsLost2016,pointsGained2016,eventsPlayedAct);
//        FormLayout flayout = new FormLayout(thisWeek, name,country,end2015,lastWeek,avgPoints,totPoints,eventsPlayed,pointsLost2016,pointsGained2016,eventsPlayedAct);
//        flayout.setMargin(false);
//        flayout.setSpacing(false);
        vlayout.setMargin(false);
        vlayout.setSpacing(false);
        VerticalLayout layout = new VerticalLayout(vlayout,hlayout);
        setContent(layout);
    }

    private void updateGrid() {
        List owgrs = service.findAll();
        grid.setContainerDataSource(new BeanItemContainer<>(Owgr.class,
                owgrs));
        setFormVisible(false);
    }

    private void updateForm() {
        if (grid.getSelectedRows().isEmpty()) {
            setFormVisible(false);
        } else {
            owgr = (Owgr) grid.getSelectedRow();
            BeanFieldGroup.bindFieldsUnbuffered(owgr, this);
            setFormVisible(true);
        }
    }

    private void setFormVisible(boolean visible) {
        thisWeek.setVisible(visible);
        name.setVisible(visible);
        country.setVisible(visible);
        lastWeek.setVisible(visible);
        end2015.setVisible(visible);
        avgPoints.setVisible(visible);
        totPoints.setVisible(visible);
        eventsPlayed.setVisible(visible);
        pointsLost2016.setVisible(visible);
        pointsGained2016.setVisible(visible);
        eventsPlayedAct.setVisible(visible);
    }

//    private void saveOwgr() {
//        service.update(owgr);
//        updateGrid();
//    }

}