package com.example.weather_app;
import java.time.LocalDateTime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherDataRepository extends JpaRepository<WeatherData, Long> {
    WeatherData findTopByLocationAndTimestampAfterOrderByTimestampDesc(String location, LocalDateTime timestamp);

    void deleteAllByTimestampBefore(LocalDateTime localDateTime);
}

