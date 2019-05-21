package dto;


import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
public class CoordinateDto implements Serializable {

    @NotEmpty
    private String lat;
    @NotEmpty
    private String lon;
}
