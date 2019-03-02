package pl.edu.wszib.springtalkingwithworld;


import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/headers")
public class HeaderController {

    @GetMapping
    public String test(){
        throw new RuntimeException();
    }

    @ExceptionHandler(RuntimeException.class)
    public  String exception(){
        return "ASDF";
    }

    @ExceptionHandler(RuntimeException.class)
    public  String exception2(){
        return "ASDF2";
    }

}
