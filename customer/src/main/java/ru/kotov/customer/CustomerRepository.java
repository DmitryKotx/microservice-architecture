package ru.kotov.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kotov.customer.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
