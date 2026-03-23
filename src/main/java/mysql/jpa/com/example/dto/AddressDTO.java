package mysql.jpa.com.example.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AddressDTO {
    private Long id;
    private String city;
    private String state;
    private String country;
    private String zip;
}
