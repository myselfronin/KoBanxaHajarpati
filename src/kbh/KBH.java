/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kbh;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Rabinson
 */
public class KBH extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    
    /**
     * @param args the command line arguments
     */
      @Override
    public void init() throws Exception {
        super.init();

       Font myFontloadFontAirstreamNF20 = 
            Font.loadFont(getClass()
                .getResourceAsStream("/font/Preeti.ttf"), 20);
    }
    
    public static void main(String[] args) {
        
        launch(args);
    }
    
}
