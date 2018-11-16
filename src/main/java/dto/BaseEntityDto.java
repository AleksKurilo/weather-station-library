package dto;


import enums.RequestType;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public abstract class BaseEntityDto implements Serializable {

    private Long id;
    private RequestType requestType;
}
