package dto;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Set;


@Data
public class LocationDto extends BaseEntityDto {

    private String name;

    @NotNull
    private String coordinates;

    @Valid
    private Set<StationDto> stations;
}
