package dto;


import enums.WindDirection;
import lombok.Data;


@Data
public class CenterDto extends BaseEntityDto {

    //private String message;
    private String name;
    private Double temperatureC;
    private Double humidity;
    private Integer pressure;
    private Double windSpeed;
    private WindDirection windDirection;
   // @NotNull
    private String coordinates;
}
