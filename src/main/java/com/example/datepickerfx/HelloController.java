package com.example.datepickerfx;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class HelloController {
    @FXML
    private Button checkBtn;

    @FXML
    private TextField inputField;

    @FXML
    private Text resultField;

    @FXML
    private Text textField1;

    @FXML
    public void onClickCheckDate(MouseEvent event){
        checkDateFromInput(inputField);
    }
    private boolean checkDateFromInput(TextField inputField){
        String dateStr = String.valueOf(inputField);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        DateValidator validator = new DateValidatorUsingLocalDate(dateTimeFormatter);

        if(!(validator.isValid(dateStr))){
            resultField.setText(dateStr + " is not a valid date!");
        }
        else{
            resultField.setText(dateStr + " is a valid date!");
        }

        return false;
    }
}