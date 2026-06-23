/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tdt.utils;

import com.mycompany.th01_mauhdt.App;
import com.tdt.utils.themes.ThemesManager;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author admin
 */
public class MyStageSingeton {
    private static MyStageSingeton instance;
    private final Stage stage;
    private MyStageSingeton(){
        this.stage = new Stage();
        this.stage.setTitle("Quiz App");
    }
    
    public static MyStageSingeton getInstance(){
        if(instance == null)
            instance = new MyStageSingeton();
        return instance;
    }
    
    public void showStage(String fxml){
        try {
            Scene scene = new Scene (new FXMLLoader(App.class.getResource(fxml+ ".fxml")).load());
            
            ThemesManager.applyThemes(scene);
            this.stage.setScene(scene);
            this.stage.show();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
