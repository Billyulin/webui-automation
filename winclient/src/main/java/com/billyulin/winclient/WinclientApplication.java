package com.billyulin.winclient;

import com.billyulin.winclient.view.BootView;
import com.billyulin.winclient.view.IndexView;
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class WinclientApplication extends AbstractJavaFxApplicationSupport {
    /**
     * 存放控制器
     */
    public static Map<String, Object> controllers = new HashMap<String, Object>();

    public static void main(String[] args) {
        launch(WinclientApplication.class, IndexView.class, new BootView(), args);
    }
}