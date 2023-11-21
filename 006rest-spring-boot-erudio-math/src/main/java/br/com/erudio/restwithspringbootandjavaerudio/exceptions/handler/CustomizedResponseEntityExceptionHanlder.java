package br.com.erudio.restwithspringbootandjavaerudio.exceptions.handler;

import br.com.erudio.restwithspringbootandjavaerudio.exceptions.ExceptionsResponse;
import br.com.erudio.restwithspringbootandjavaerudio.exceptions.UnsupportedMathOperationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@RestController
@ControllerAdvice
public class CustomizedResponseEntityExceptionHanlder  extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ExceptionsResponse> handleAllExceptions(
            Exception ex, WebRequest request) {
        ExceptionsResponse exceptionsResponse = new ExceptionsResponse(
                new Date(),
                ex.getMessage(),
                request.getDescription(false));
        return new ResponseEntity<>(exceptionsResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @ExceptionHandler(UnsupportedMathOperationException.class)
    public final ResponseEntity<ExceptionsResponse> handleBadRequestExceptions(
            Exception ex, WebRequest request) {

        ExceptionsResponse exceptionsResponse = new ExceptionsResponse(
                new Date(),
                ex.getMessage(),
                request.getDescription(false));
        return new ResponseEntity<>(exceptionsResponse, HttpStatus.BAD_REQUEST);
    }
}
