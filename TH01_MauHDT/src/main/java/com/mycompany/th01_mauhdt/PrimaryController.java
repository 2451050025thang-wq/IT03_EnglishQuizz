package com.mycompany.th01_mauhdt;

import com.tdt.utils.MyAlert;
import com.tdt.utils.MyStageSingeton;
import com.tdt.utils.themes.ThemesType;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

public class PrimaryController implements Initializable{
    @FXML private ComboBox<ThemesType> cbthemes;
    
     @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbthemes.setItems(FXCollections.observableArrayList(ThemesType.values()));
    }
    
    public void Question(ActionEvent e){
      MyStageSingeton.getInstance().showStage("question");
        //MyAlert.getInstance().showAlert("Coming soon....");
    }
    public void practic(ActionEvent e){
        MyAlert.getInstance().showAlert("Coming soon....");        
    }
    public void axem(ActionEvent e){
        MyAlert.getInstance().showAlert("Coming soon....");        
    }

   public void changeTheme(ActionEvent e){
       this.cbthemes.getSelectionModel().getSelectedItem().updateThemes(this.cbthemes.getScene());
   }
}
