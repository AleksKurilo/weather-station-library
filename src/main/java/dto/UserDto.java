package dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Timestamp;

@Data
public class UserDto extends BaseEntityDto {

    @Email
    @NotNull
    private String email;

    @NotNull
    @Size(min = 4, max = 100)
    private String password;

    private String role;

    private Timestamp createOn;

    private Timestamp lastUpdate;
}
