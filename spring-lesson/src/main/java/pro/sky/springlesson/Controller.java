package pro.sky.springlesson;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")

public class Controller {
private final CalculService calculService;
    public Controller(CalculService calculService){
        this.calculService = calculService;
    }

    @GetMapping()
    public String hello(){
        return calculService.hello();
    }
    @GetMapping("/plus")
    public String plus(@RequestParam ("num1") int num1, @RequestParam ("num2") int num2){
        return calculService.plus(num1, num2);
    }
    @GetMapping("/minus")
    public String minus(@RequestParam ("num1") int num1, @RequestParam ("num2") int num2){
        return calculService.minus(num1, num2);
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam ("num1") int num1, @RequestParam ("num2") int num2){
        return calculService.multiply(num1, num2);
    }
    @GetMapping("/divide")
    public String divide(@RequestParam ("num1") double num1, @RequestParam ("num2") double num2){
        return calculService.divide(num1, num2);
    }
}

