package mysql.jpa.com.example.model;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String city;
    private String state;
    private String county;
    private String zip;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "s_id", nullable = false) // Maps to s_id foreign key
    @JsonBackReference // Prevents infinite loops in JSON responses
    private Student student;

    // Default Constructor
    public Address() {}

    // Getters and Setters
}
