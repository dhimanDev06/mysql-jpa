package mysql.jpa.com.example.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
public class StudentDTO {
    private Long id;
    private Integer slNo;
    private String fullName;
    private String email;
    private LocalDateTime createdTime;
    private List<AddressDTO> addresses;
}
