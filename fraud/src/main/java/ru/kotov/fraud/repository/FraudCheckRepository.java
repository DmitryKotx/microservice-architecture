package ru.kotov.fraud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kotov.fraud.model.FraudCheck;
@Repository
public interface FraudCheckRepository extends JpaRepository<FraudCheck, Integer> {

}
