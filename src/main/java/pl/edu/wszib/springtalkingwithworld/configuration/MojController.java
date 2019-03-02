package pl.edu.wszib.springtalkingwithworld.configuration;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@Controller
@RequestMapping("/moj")
public class MojController {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    class MyException extends RuntimeException {

    }
    @ResponseStatus(HttpStatus.OK)
    class MyException2 extends RuntimeException {

    }
    @ResponseStatus(HttpStatus.NOT_FOUND)
    class MyException3 extends RuntimeException {

    }

    @GetMapping()
    public String test () {
        int rand = new Random().nextInt(3);
        if(rand == 0) {
            throw new MyException();
        } else if(rand == 1) {
            throw new MyException2();
        } else {
            throw new MyException3();

        }
    }
    @ExceptionHandler(MyException.class)
    public String exception(){
        return "kot";
    }

    @ExceptionHandler(MyException2.class)
    public String exception2(){
        return "kot2";
    }

    @ExceptionHandler(MyException3.class)
    public String exception3(){
        return "kot3";
    }
}
