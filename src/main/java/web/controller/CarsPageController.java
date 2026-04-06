package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.DAO.CarsDAO;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
@RequestMapping
public class CarsPageController {
    private final CarService carService;

    public CarsPageController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String carsPage(@RequestParam(defaultValue = "10") int count, Model model) {

        List<Car> allCars = carService.getCars();

        List<Car> visibleCars;

        if (count >= 5) {
            visibleCars = allCars;
        } else if (count > 0) {
            visibleCars = allCars.subList(0, Math.min(count, allCars.size()));
        } else {
            visibleCars = List.of();
        }

        model.addAttribute("cars", visibleCars);
        model.addAttribute("count", count);

        return "cars";
    }





}
