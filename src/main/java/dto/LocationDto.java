package dto;

import lombok.Data;

import java.util.Set;


@Data
public class LocationDto extends BaseEntityDto {

    private String name;
    private String coordinates;
    private Set<StationDto> stations;
}
