package com.mycompany.th01_mauhdt;

import com.tdt.utils.MyAlert;
import com.tdt.utils.themes.ThemesType;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

public class PrimaryController implements Initializable{
    @FXML private ComboBox<ThemesType> cbthemes;
    
     @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbthemes.setItems(FXCollections.observableArrayList(ThemesType.values()));
    }
    
    public void Question(ActionEvent e){
        MyAlert.getInstance().showAlert("Coming soon....");
    }
    public void practic(ActionEvent e){
        MyAlert.getInstance().showAlert("Coming soon....");        
    }
    public void axem(ActionEvent e){
        MyAlert.getInstance().showAlert("Coming soon....");        
    }

   public void changeTheme(ActionEvent e){
       switch (this.cbthemes.getSelectionModel().getSelectedItem()) {
           case DARK:
               this.cbthemes.getScene().getRoot().getStylesheets().clear();
               this.cbthemes.getScene().getRoot().getStylesheets().add(App.class.getResource("dark.css").toExternalForm());
               break;
            case LIGHT:
               this.cbthemes.getScene().getRoot().getStylesheets().clear();
               this.cbthemes.getScene().getRoot().getStylesheets().add(App.class.getResource("light.css").toExternalForm());
               break;   
           default:
               this.cbthemes.getScene().getRoot().getStylesheets().clear();
               this.cbthemes.getScene().getRoot().getStylesheets().add(App.class.getResource("styles.css").toExternalForm());
       }
   }
}
