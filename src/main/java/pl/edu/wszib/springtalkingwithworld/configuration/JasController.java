package pl.edu.wszib.springtalkingwithworld.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.wszib.springtalkingwithworld.Ciastko;


@RestController
@RequestMapping("/jas")
public class JasController {

    private static Logger logger = LoggerFactory.getLogger(JasController.class);

    @Autowired
    Ciastko ciastko;

    @GetMapping
    public String zjedz(){
        if(ciastko.isZjedzone()){
            logger.warn("Ciastko zjedzone");
        } else {
            logger.warn("Mniam");
            ciastko.zjedz();
        }
        return "";
    }
}
