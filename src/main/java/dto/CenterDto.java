package dto;

import lombok.Data;

import java.util.Set;

@Data
public class CenterDto extends BaseEntityDto {

    private String name;
    private Set<LocationDto> locations;
}
