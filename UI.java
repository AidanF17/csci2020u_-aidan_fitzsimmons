package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.DatePicker;
import javafx.stage.Stage;
import javafx.scene.control.TextInputControl;

import java.awt.*;

public class UI extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane mainPane = new GridPane();
        mainPane.setAlignment(Pos.CENTER_LEFT);
        mainPane.setHgap(5);
        mainPane.setVgap(5);


        //TextField
        Label user = new Label("Username:  ");
        TextField uField = new TextField();
        uField.setPromptText("Username");

        Label pWord = new Label("Password: ");
        TextField pField = new TextField();
        pField.setPromptText("Password");

        Label fName = new Label("Full Name: ");
        TextField fField = new TextField();
        fField.setPromptText("Full Name");

        Label email = new Label("E-Mail:    ");
        TextField emailField = new TextField();
        emailField.setPromptText("E-Mail");

        Label phone = new Label("Phone #:   ");
        TextField phoneField = new TextField(); //Might want to put a string there
        phoneField.setPromptText("Phone #");
        System.out.println(phoneField.getCharacters());


        phoneField.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (phoneField.getCharacters().length() > 5) {
                    String test = phoneField.getText();
                    System.out.println(test+ "test__");
                    System.out.println(phoneField.getText());
                    phoneField.insertText(3, "-");
                    phoneField.insertText(7     , "-");
                }
            }
        });
        Label dob = new Label("Date of Birth:");
        DatePicker dobField = new DatePicker();

        Button regButton = new Button("Register");


        mainPane.add(user,0,0);
        mainPane.add(uField, 1, 0);

        mainPane.add(pWord,0,1);
        mainPane.add(pField, 1, 1);

        mainPane.add(fName,0,2);
        mainPane.add(fField, 1, 2);

        mainPane.add(email,0,3);
        mainPane.add(emailField, 1, 3);

        mainPane.add(phone,0,4);
        mainPane.add(phoneField,1,4);

        mainPane.add(dob,0,5);
        mainPane.add(dobField, 1, 5);

        mainPane.add(regButton,1,6);

        Scene scene = new Scene(mainPane, 500, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Lab 04 Solution");
        primaryStage.setResizable(false);

        primaryStage.show();
    }
}