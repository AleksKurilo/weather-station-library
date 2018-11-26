package dto;

import lombok.Data;


@Data
public class LocationDto extends BaseEntityDto {

    private String name;
    private String coordinates;
}
