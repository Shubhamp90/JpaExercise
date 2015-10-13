/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpaexercise;

import jars.PersonJpaController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author skp5168
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    private Object persistence;
    @FXML
    private Button button;
    @FXML
    private ListView<?> lvPeople;
    @FXML
    private TextField tfFirstName;
    @FXML
    private TextField tfLastName;
    @FXML
    private Button btnAddPerson;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        EntityManagerFactory emf;
        emf = Persistence.createEntityManagerFactory("JpaExercisePU");
        Person dude = new Person();
        dude.setFirstName("phill");
        
        PersonJpaController jpaPerson = new PersonJpaController(emf);
        jpaPerson.create(dude);
        
    }    

    @FXML
    private void handleButtonAddPersonClicked(MouseEvent event) {
    }
    
}
