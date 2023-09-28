package com.example.datepickerfx;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateValidatorUsingLocalDate implements DateValidator{
    private DateTimeFormatter dateTimeFormatter;
    public DateValidatorUsingLocalDate(DateTimeFormatter dateTimeFormatter){
        this.dateTimeFormatter=dateTimeFormatter;
    }
    @Override
    public boolean isValid(String dateStr) {
        try{
            LocalDate.parse(dateStr, this.dateTimeFormatter);
        } catch(DateTimeParseException e){
            return false;
        }
        return true;
    }
}
