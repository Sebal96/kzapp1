package com.lato.kzapp;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;




@Route("hello")
public class PowitanieView extends VerticalLayout {

    public PowitanieView(){
        TextField textField = new TextField("Podaj imie:");
        Button button = new Button("left",new Icon(VaadinIcon.ACADEMY_CAP));
        Label label = new Label();
        button.addClickListener(clickEvent -> {
            label.setText("Hej "+ textField.getValue());
        });
        add(textField,button,label);
    }
}
