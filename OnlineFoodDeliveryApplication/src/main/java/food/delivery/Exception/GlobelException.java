package food.delivery.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobelException {
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ExceptionDetails> myExpHandlerMain(Exception ie,WebRequest wr)  {
		 ExceptionDetails err=new ExceptionDetails(LocalDateTime.now(), ie.getMessage(), wr.getDescription(false));
		return new ResponseEntity<ExceptionDetails>(err, HttpStatus.BAD_REQUEST);		
	}
}
