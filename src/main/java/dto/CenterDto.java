package dto;


import lombok.Data;

import javax.validation.Valid;
import java.util.Set;

@Data
public class CenterDto extends BaseEntityDto {

    private String name;

    @Valid
    private Set<LocationDto> locations;
}
