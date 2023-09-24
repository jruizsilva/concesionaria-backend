package jruizsilva.concesionaria.exception;

import java.util.Collections;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerExceptions {
  @ExceptionHandler(EmailValidationException.class)
  public ResponseEntity<Map<String, Object>> emailException(EmailValidationException emailValidationException) {
    return ResponseEntity.status(HttpStatus.CONFLICT)
        .body(Collections.singletonMap("error", emailValidationException.getMessage()));
  }
}
