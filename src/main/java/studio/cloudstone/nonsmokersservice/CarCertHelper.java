package studio.cloudstone.nonsmokersservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("CarCert")
public class CarCertHelper {

    @Value("${default.name}")
    private String defaultName;
    @Value("${default.carCert}")
    private String defaultCarCert;

    @RequestMapping(value={"genCarCert","hi"}, method= RequestMethod.GET)
    public String genCarCert(){
        return defaultName + ":" + defaultCarCert;
    }

    @RequestMapping(value="genCarCertByPost",method = RequestMethod.POST)
    public String genCarCertByPost(){
        return "post:" + defaultName + ":" + defaultCarCert;
    }

    @RequestMapping(value = "/genCarCertByPathParams/{name}",method = RequestMethod.GET)
    public String genCarCertByPathParams(@PathVariable("name") String name){
        return "name:" + name;
    }

    //@RequestMapping(value = "/genCarCertByRequestParams", method = RequestMethod.GET)
    @GetMapping(value =  "/genCarCertByRequestParams")
    public String genCarCertByRequestParams(@RequestParam(value = "name", required = false, defaultValue = "金燕南") String name,
                                            @RequestParam(value = "carCert", required = false, defaultValue = "冀RP6U36") String carCert){
        return  name + ":" + carCert;
    }
}
