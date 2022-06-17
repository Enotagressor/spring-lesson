package pro.sky.springlesson;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")

public class Controller {
    private final pro.sky.springlesson.CalculService calculService;

    public Controller(pro.sky.springlesson.CalculService calculService){
        this.calculService = calculService;
    }

    @GetMapping()
    public String hello(){
        return calculService.hello();
    }
    @GetMapping("/plus")
    public String plus(@RequestParam(value = "num1", required = false) Integer num1,
                       @RequestParam(value = "num2", required = false) Integer num2
    ) {
        if (num1 == null || num2 == null) {
            return "Не хвататет аргементов";
        }
        return calculService.plus(num1, num2);
    }
    @GetMapping("/minus")
    public String minus(@RequestParam(value = "num1", required = false) Integer num1,
                        @RequestParam(value = "num2", required = false) Integer num2
    ) {
        if (num1 == null || num2 == null) {
            return "Не хвататет аргементов";
        }
        return calculService.minus(num1, num2);
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) Integer num1,
                           @RequestParam(value = "num2", required = false) Integer num2
    ) {
        if (num1 == null || num2 == null) {
            return "Не хвататет аргементов";
        }
        return calculService.multiply(num1, num2);
    }
    @GetMapping("/divide")
    public String divide(
            @RequestParam(value = "num1", required = false) Integer num1,
            @RequestParam(value = "num2", required = false) Integer num2
    ) {
        if (num1 == null || num2 == null) {
            return "Не хвататет аргементов";
        }

        return calculService.divide(num1, num2);
    }
}


