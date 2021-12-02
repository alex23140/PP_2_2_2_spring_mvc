package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Car;
import web.CarApplication;
import java.util.List;

@Controller
public class CarController {

    @RequestMapping("/cars")
    public String showCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<Car> cars = new CarApplication().getCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
