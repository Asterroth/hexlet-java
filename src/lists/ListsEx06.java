package lists;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListsEx06 {
    public static void main(String[] args) {
        var cars = List.of(
                new Car("Jaguar", "XK120", LocalDate.of(1950, 8, 21)),
                new Car("Mercedes-Benz", "W114", LocalDate.of(1968, 7, 10)),
                new Car("Fiat", "600", LocalDate.of(1956, 1, 1))
        );
        var result = getCars(cars, 1960);
        System.out.println(result); // => [Fiat 600, Jaguar XK120]
    }

    public static List<String> getCars(List<Car> cars, int year) {
        List<String> carsList = new ArrayList<String>();
        for (var car : cars) {
            if (car.getManufacturedAt().getYear() < year) {
                carsList.add(car.toString());
            }
        }
        Collections.sort(carsList, String.CASE_INSENSITIVE_ORDER);
        return carsList;
    }
}

final class Car {

    private String made;
    private String model;
    private LocalDate manufacturedAt;

    public Car(String made, String model, LocalDate manufacturedAt) {
        this.made = made;
        this.model = model;
        this.manufacturedAt = manufacturedAt;
    }

    public String getMade() {
        return made;
    }

    public String getModel() {
        return model;
    }

    public LocalDate getManufacturedAt() {
        return manufacturedAt;
    }

    @Override
    public String toString() {
        return made + " " + model;
    }
}
