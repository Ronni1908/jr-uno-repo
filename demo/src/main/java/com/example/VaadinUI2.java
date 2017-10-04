package com.example;

import com.vaadin.annotations.Theme;
import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by jro on 27.10.2016.
 */
@SpringUI
@Theme("valo")
public class VaadinUI2 {
}

//    @Autowired
////    private CustomerService2 service;
////
////    private Customer customer;
////
//    private BirdService service;
//
//    private Bird bird;
//
//    private Grid grid = new Grid();
//    //    private TextField firstName = new TextField("First name");
////    private TextField lastName = new TextField("Last name");
//    private TextField Navn = new TextField("Navn");
//    private TextField Lengde = new TextField("Lengde");
//
//    private Button save = new Button("Save", e -> saveBird());
//
//    @Override
//    protected void init(VaadinRequest request) {
////        updateGrid();
////        grid.setColumns("firstName", "lastName");
////        grid.addSelectionListener(e -> updateForm());
////
////        VerticalLayout layout = new VerticalLayout(grid, firstName, lastName,
////                save);
//        updateGrid();
//        grid.setColumns("navn", "lengde");
//        grid.addSelectionListener(e -> updateForm());
//
//        VerticalLayout layout = new VerticalLayout(grid, Navn, Lengde,
//                save);
//
//        layout.setMargin(true);
//        layout.setSpacing(true);
//        setContent(layout);
//    }
//
//    private void updateGrid() {
////        List customers = service.findAll();
////        grid.setContainerDataSource(new BeanItemContainer<>(Customer.class,
////                customers));
//        List birds = service.findAll();
//        grid.setContainerDataSource(new BeanItemContainer<>(Bird.class,
//                birds));
//        setFormVisible(false);
//    }
//
//    private void updateForm() {
//        if (grid.getSelectedRows().isEmpty()) {
//            setFormVisible(false);
//        } else {
////            customer = (Customer) grid.getSelectedRow();
//            bird = (Bird) grid.getSelectedRow();
////            BeanFieldGroup.bindFieldsUnbuffered(customer, this);
//            BeanFieldGroup.bindFieldsUnbuffered(bird, this);
//
//            setFormVisible(true);
//        }
//    }
//
//    private void setFormVisible(boolean visible) {
////        firstName.setVisible(visible);
////        lastName.setVisible(visible);
//        Navn.setVisible(visible);
//        Lengde.setVisible(visible);
//        save.setVisible(visible);
//    }
//
//    //    private void saveCustomer() {
//    private void saveBird() {
////        service.update(customer);
////        service.update(bird);
//        updateGrid();
//    }
//}

