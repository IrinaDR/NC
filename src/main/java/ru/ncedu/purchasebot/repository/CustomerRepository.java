package ru.ncedu.purchasebot.repository;

import org.springframework.data.repository.CrudRepository;
import ru.ncedu.purchasebot.model.Customer;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, String> {

    List<Customer> findByLogin(String login);

}