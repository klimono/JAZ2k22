package pl.s18504.demo2;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
//    @GetMapping("/test/hello")
//    ResponseEntity<String> hello() {
//        return new ResponseEntity<>("Hello world", HttpStatus.OK);
//    }

    @GetMapping("/test/model")
    Car createCar(){
        return new Car(1, 1999, "Opel", "Astra", "green");
    }

    @GetMapping("/test/hello/{someValue}")
    ResponseEntity<String> value(@PathVariable String someValue){
        return new ResponseEntity<>(someValue, HttpStatus.OK);
    }

    @GetMapping("/test/hello")
    ResponseEntity<String> reqValue(@RequestParam String reqParam) {
        return new ResponseEntity<>(reqParam, HttpStatus.OK);
    }

    @PostMapping("/model")
    Car createCar(@RequestBody Car car) {
        return car;
    }

}
