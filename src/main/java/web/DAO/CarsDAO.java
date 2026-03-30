package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarsDAO {
    private static int CARS_ID;
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(
                ++CARS_ID,
                "JT2BK3FK7M1234501",
                2021,
                "Toyota",
                "Camry",
                "XSE AWD",
                "2.5L I4",
                "AWD",
                "Midnight Black Metallic",
                "Cockpit Red",
                27900,
                65100,
                "Хорошее состояние, один владелец, кузов без серьезных повреждений, есть мелкие следы городской эксплуатации."
        ));

        cars.add(new Car(
                ++CARS_ID,
                "5J6RW2H87LA045321",
                2020,
                "Honda",
                "CR-V",
                "EX-L",
                "1.5L Turbo",
                "AWD",
                "Platinum White Pearl",
                "Black Leather",
                24800,
                79200,
                "Очень хорошее состояние, чистый салон, подвеска без замечаний, обслуживалась по регламенту."
        ));

        cars.add(new Car(
                ++CARS_ID,
                "WBA5R1C06KF784512",
                2019,
                "BMW",
                "3 Series",
                "330i M Sport",
                "2.0L Turbo",
                "RWD",
                "Mineral Gray Metallic",
                "Beige Leather",
                28900,
                65100,
                "Хорошее состояние, динамичный и ухоженный автомобиль, есть пара косметических сколов на переднем бампере."
        ));

        cars.add(new Car(
                ++CARS_ID,
                "WDDWF4JB7JR562341",
                2018,
                "Mercedes-Benz",
                "C-Class",
                "C 200 AMG Line",
                "1.5L Turbo",
                "RWD",
                "Iridium Silver",
                "Black Leather",
                26900,
                88700,
                "Хорошее состояние, аккуратный салон, коробка и двигатель работают ровно, есть незначительные потертости по кузову."
        ));

        cars.add(new Car(
                ++CARS_ID,
                "WAUENAF48LN103254",
                2020,
                "Audi",
                "A4",
                "S line 45 TFSI",
                "2.0L TFSI",
                "AWD",
                "Navarra Blue Metallic",
                "Black Leather",
                28500,
                73200,
                "Очень хорошее состояние, богатая комплектация, без вложений на ближайшее ТО."
        ));

        cars.add(new Car(
                ++CARS_ID,
                "KNDPN3AC5M7123408",
                2021,
                "Kia",
                "Sportage",
                "Prestige",
                "2.4L I4",
                "AWD",
                "Infra Red",
                "Black",
                21900,
                54200,
                "Отличное состояние, салон аккуратный, лакокрасочное покрытие в хорошем виде, без запахов и следов курения."
        ));

        cars.add(new Car(
                ++CARS_ID,
                "KM8J3CAL8NU345671",
                2022,
                "Hyundai",
                "Tucson",
                "Style",
                "2.5L I4",
                "FWD",
                "White Cream",
                "Gray",
                23900,
                41800,
                "Почти идеальное состояние, небольшой пробег, очень опрятный автомобиль, без нареканий по технике."
        ));

        cars.add(new Car(
                ++CARS_ID,
                "JM1GL1VM2K1504326",
                2019,
                "Mazda",
                "Mazda6",
                "Supreme",
                "2.5L I4",
                "FWD",
                "Soul Red Crystal",
                "Black Leather",
                22400,
                69800,
                "Хорошее состояние, приятный салон, мотор сухой, есть пару мелких царапин на заднем крыле."
        ));

        cars.add(new Car(
                ++CARS_ID,
                "JN8AT2MV4LW234581",
                2020,
                "Nissan",
                "X-Trail",
                "LE Top",
                "2.5L I4",
                "AWD",
                "Silver Metallic",
                "Beige",
                23800,
                81200,
                "Хорошее состояние, просторный семейный кроссовер, все опции работают, есть стандартные следы эксплуатации."
        ));

        cars.add(new Car(
                ++CARS_ID,
                "WVGZZZ5NZMW345219",
                2021,
                "Volkswagen",
                "Tiguan",
                "R-Line",
                "2.0L TSI",
                "AWD",
                "Deep Black Pearl",
                "Black",
                25900,
                63400,
                "Очень хорошее состояние, собранный и комфортный автомобиль, по кузову без серьезных замечаний."
        ));

        cars.add(new Car(
                ++CARS_ID,
                "TMBJR7NX4N8034215",
                2022,
                "Skoda",
                "Octavia",
                "Style",
                "1.4L TSI",
                "FWD",
                "Candy White",
                "Black",
                21400,
                35600,
                "Отличное состояние, свежий и экономичный автомобиль, салон как новый, прозрачная история обслуживания."
        ));

        cars.add(new Car(
                ++CARS_ID,
                "WF0AXXWPMAL234876",
                2020,
                "Ford",
                "Kuga",
                "Titanium",
                "1.5L EcoBoost",
                "AWD",
                "Blue Metallic",
                "Black",
                22900,
                74400,
                "Хорошее состояние, уверенно едет, технически исправен, есть мелкие возрастные следы по кузову."
        ));

        cars.add(new Car(
                ++CARS_ID,
                "JTJBARBZ6J2103457",
                2018,
                "Lexus",
                "NX",
                "Executive",
                "2.0L Turbo",
                "AWD",
                "White Pearl",
                "Brown Leather",
                31500,
                92800,
                "Очень хорошее состояние, премиальный салон, тихая подвеска, автомобиль ухожен и выглядит достойно."
        ));

        cars.add(new Car(
                ++CARS_ID,
                "4S4BTANC5M3124786",
                2021,
                "Subaru",
                "Outback",
                "Field",
                "2.5L Boxer",
                "AWD",
                "Autumn Green Metallic",
                "Black",
                29600,
                58400,
                "Отличное состояние, полный привод работает без замечаний, кузов и салон сохранены хорошо."
        ));

        cars.add(new Car(
                ++CARS_ID,
                "YV4102RK8M1675432",
                2021,
                "Volvo",
                "XC60",
                "Momentum",
                "2.0L Turbo",
                "AWD",
                "Onyx Black",
                "Blond Leather",
                33800,
                61900,
                "Очень хорошее состояние, безопасный и комфортный кроссовер, чистый салон, бережная эксплуатация."
        ));
    }

    public List<Car> getCars() {
        return cars;
    }
}
