package com.example.weather_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
public class WeatherController {
    @Autowired
    ExternalWeatherService externalWeatherService;

    @GetMapping
    public ResponseEntity<?> getWeatherData(@RequestParam String city) {
        // Here, query the external Weather API using the city parameter
        // Fetch the weather data and return it as a response

        // This is a simplified example; you would typically have a service layer, error handling, etc.
        WeatherData weatherData = externalWeatherService.fetchWeatherData(city);
        System.out.println(weatherData.getDescription());
        System.out.println(weatherData.getLocation());
        System.out.println(weatherData.getHumidity());
        return ResponseEntity.ok(weatherData);
    }
}
