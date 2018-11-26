package dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Data
public class UserDto extends BaseEntityDto {

    @NotNull
    @Email
    private String email;
    private String password;
    private String role;
    private Timestamp createOn;
    private Timestamp lastUpdate;
}
