/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package gui;


import interfaces.IUser;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javafx.stage.Stage;

import services.UserService;

public class NewPasswordController implements Initializable {


    @FXML
    private TextField cd;

    
   
    @FXML
    private Button Send;
    
    public static String mailUpdate="a";
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }


    
    @FXML
    private void Send(ActionEvent event) throws IOException, SQLException {
        if(
            cd.getText().isEmpty())
        {   Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Alerte");
            alert.setHeaderText(null);
            alert.setContentText("Field is empty ");
            alert.showAndWait();
        }
        else
        { 
        String newPass = cd.getText();
        IUser Iu = new UserService();
        mailUpdate=SendMailController.mail;
        //int id = Iu.getIdbyMail(ircc.username);
        Iu.UpdatePassword(mailUpdate, newPass);
        FXMLLoader loader = new FXMLLoader();
        cd.getScene().getWindow().hide();
        Stage prStage = new Stage();
        loader.setLocation(getClass().getResource("Login.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        prStage.setScene(scene);
        prStage.setResizable(false);
        prStage.show();
        }
    } }