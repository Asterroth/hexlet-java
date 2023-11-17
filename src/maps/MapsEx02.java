package maps;

import java.util.Map;

public class MapsEx02 {
    public static void main(String[] args) {
        var cities = Map.of(
                "White River", 114958,
                "Kashmor", 210451,
                "Oxford", 152450
                );
        System.out.println(getMostPopulatedCity(cities)); // Kashmor
    }

    public static String getMostPopulatedCity(Map<String, Integer> cities) {
        String cityName = null;
        var maxPopulation = 0;
        var citiesList = cities.entrySet();
        for (var city : citiesList) {
            if (city.getValue() > maxPopulation) {
                maxPopulation = city.getValue();
                cityName = city.getKey();
            }
        }
        return cityName;
    }

}
