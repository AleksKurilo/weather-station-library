package dto;

import enums.WindDirection;
import lombok.Data;

import javax.validation.constraints.NotNull;


@Data
public class StationDto extends BaseEntityDto {

    private String name;
    private Double temperatureC;
    private Double humidity;
    private Integer pressure;
    private Double windSpeed;
    private WindDirection windDirection;

    @NotNull
    private String coordinate;
}
