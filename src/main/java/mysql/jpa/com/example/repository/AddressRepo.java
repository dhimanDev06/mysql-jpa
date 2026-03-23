package mysql.jpa.com.example.repository;

import mysql.jpa.com.example.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address, Long> {
}
