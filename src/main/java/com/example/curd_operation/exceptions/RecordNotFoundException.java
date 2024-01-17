package com.example.curd_operation.exceptions;

import lombok.Data;

@Data
public class RecordNotFoundException extends RuntimeException{

    public RecordNotFoundException(String message){super(message);}

}
