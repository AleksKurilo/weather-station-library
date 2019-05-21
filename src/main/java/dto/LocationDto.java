package dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = true)
public class LocationDto extends BaseEntityDto {

    private String name;

    @Valid
    private Set<StationDto> stations;

    @Valid
    @NotNull
    private Set<CoordinateDto> coordinates;
}
