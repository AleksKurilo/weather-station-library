package dto;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class UserDto extends BaseEntityDto {

    private String email;
    private String role;
    private Timestamp createOn;
    private Timestamp lastUpdate;
}
