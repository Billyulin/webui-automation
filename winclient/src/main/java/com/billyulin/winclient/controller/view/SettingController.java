package com.billyulin.winclient.controller.view;

import com.billyulin.winclient.WinclientApplication;
import com.billyulin.winclient.config.SeleniumDriverConfig;
import de.felixroske.jfxsupport.FXMLController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import java.net.URL;
import java.util.ResourceBundle;

@FXMLController
public class SettingController implements Initializable {
    @Autowired
    private SeleniumDriverConfig config;
    @FXML
    private TextField driverType;

    @FXML
    private TextField edgeDriver;

    @FXML
    private TextField chromeDriver;

    @FXML
    private Button saveBtn;

    @FXML
    private Button showBtn;

    @FXML
    void save(ActionEvent event) {
        String type = driverType.getText();
        if (Strings.isBlank(type)) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.initOwner(WinclientApplication.getStage());
            alert.setHeaderText("配置项webdriver.type不能为空");
            alert.showAndWait();
            return;
        }
        config.setDriverType(type);
        String webChromeDriver = chromeDriver.getText();
        config.setChromeDriver(webChromeDriver);
        String webEdgDriver = edgeDriver.getText();
        config.setEdgeDriver(webEdgDriver);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("配置保存成功!");
        alert.showAndWait();
    }

    @FXML
    void show(ActionEvent event) {
        driverType.setText(config.getDriverType());
        edgeDriver.setText(config.getEdgeDriver());
        chromeDriver.setText(config.getChromeDriver());
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        WinclientApplication.controllers.put(this.getClass().getSimpleName(), this);

    }
}
