package com.bloomania.cloud.views;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility;

@PageTitle("Bloomania")
@Route("")
@Uses(Icon.class)
public class MainView extends VerticalLayout {

    public MainView() {
        setSizeFull();
        setAlignItems(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);
        addClassName(LumoUtility.Padding.LARGE);

        var header = new Text("Bloomania Homelab");
        var description = new Text("Your Vaadin workspace is ready. Start building!");

        var actionButton = new Button("Open Vaadin documentation", new Icon(VaadinIcon.EXTERNAL_LINK));
        actionButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        actionButton.addClickListener(event -> actionButton.getUI().ifPresent(ui ->
                ui.getPage().open("https://vaadin.com/docs/latest/", "_blank")));

        add(header, description, actionButton);
    }
}
