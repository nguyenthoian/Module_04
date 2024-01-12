package com.example.exercise_02.repository;

import com.example.exercise_02.model.entity.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();

    void save(Customer customer);

    List<Customer> findByName(String name);

    Customer findById(int id);

    List<Customer> update(int id, String name, String email, String address);
}
