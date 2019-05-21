package dto;

import enums.WindDirection;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;


@Data
@EqualsAndHashCode(callSuper = true)
public class StationDto extends BaseEntityDto {

    private Long locationId;
    private String name;
    private Double temperatureC;
    private Double humidity;
    private Integer pressure;
    private Double windSpeed;
    private WindDirection windDirection;

    @Valid
    @NotNull
    private CoordinateDto coordinate;
}
