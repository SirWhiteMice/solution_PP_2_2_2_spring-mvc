package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.CarsDAO;
import web.model.Car;

import java.util.List;

@Service
public class CarService {

    private final CarsDAO carsDAO;

    public CarService(CarsDAO carsDAO) {
        this.carsDAO = carsDAO;
    }

    public List<Car> getCars() {
        return carsDAO.getCars();
    }
}
