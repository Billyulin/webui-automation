package com.billyulin.winclient.controller.view;

import com.billyulin.winclient.WinclientApplication;
import de.felixroske.jfxsupport.FXMLController;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

@FXMLController
public class IndexController implements Initializable {
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        WinclientApplication.controllers.put(this.getClass().getSimpleName(), this);
        Stage stage = WinclientApplication.getStage();
        stage.setTitle("WebUi 自动化测试工具");
        stage.getIcons().add(new Image("/img/faico.png"));
    }
}
