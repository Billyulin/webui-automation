package com.billyulin.winclient.view;

import de.felixroske.jfxsupport.AbstractFxmlView;
import de.felixroske.jfxsupport.FXMLView;
import javafx.scene.Parent;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@FXMLView(value = "/view/start.fxml")
public class StartView extends AbstractFxmlView {
    @Override
    public Parent getView() {
        log.info("start StartView");
        return super.getView();
    }
}
