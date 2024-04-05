package com.billyulin.winclient.controller.view;

import com.billyulin.winclient.WinclientApplication;
import com.billyulin.winclient.service.SeleniumEngineService;
import de.felixroske.jfxsupport.FXMLController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

@FXMLController
public class StartController implements Initializable {
    @Autowired
    private SeleniumEngineService seleniumEngineService;

    @FXML
    private TextField uploadExcelInput;

    @FXML
    private Button uploadExcelBtn;

    @FXML
    private Button validateExcFileBtn;

    @FXML
    private Button runCaseBtn;

    @FXML
    private TextField chooseTestPathInput;

    @FXML
    private Button chooseTestPathBtn;

    @FXML
    void chooseTestPath(ActionEvent event) {
        DirectoryChooser directoryChooser = new DirectoryChooser();
        directoryChooser.setTitle("打开文件夹");
        File selectedFilePath = directoryChooser.showDialog(WinclientApplication.getStage());
        if (selectedFilePath != null) {
            chooseTestPathInput.setText(selectedFilePath.getAbsolutePath());
        }
    }

    @FXML
    void uploadExcel(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("打开文件");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("excel文件", "*.xls"),
                new FileChooser.ExtensionFilter("xlsx文件", "*.xlsx")
        );
        File selectedFile = fileChooser.showOpenDialog(WinclientApplication.getStage());
        if (selectedFile != null) {
            uploadExcelInput.setText(selectedFile.getAbsolutePath());
        }
    }

    @FXML
    void runCase(ActionEvent event) {
//        seleniumEngineService.startEdge();
    }

    @FXML
    void validateExcFile(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        WinclientApplication.controllers.put(this.getClass().getSimpleName(), this);
    }
}
