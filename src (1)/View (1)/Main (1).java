/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Utility.DBConnection;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Koala
 */
public class Main extends Application {

    /**
     *Main Method. Starts and closes Database. Once application starts, the log in screen is shown. 
     * @param args
     */
    public static void main(String[] args) 
    {
        DBConnection.startConnection();
        launch(args);
        DBConnection.closeConnection();
    }
    
    static Stage stage; 
    
    /**
     *Start Method. Launch the Login Main screen when application is open. 
     * @param stage
     */
    @Override
    public void start(Stage stage) {
    
        this.stage = stage; 
        
        //Locale.setDefault(new Locale("fr"));
        //ResourceBundle rb = ResourceBundle.getBundle("Properties/Launguage");
        
        
        Parent main = null; 
        try{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/Login.fxml"));
        main = loader.load();
        
        Scene scene = new Scene(main); 
        stage.setScene(scene); 
        stage.show(); 
        
    } catch (IOException ex) {
        ex.printStackTrace();
    }
        
    }      
   
}
