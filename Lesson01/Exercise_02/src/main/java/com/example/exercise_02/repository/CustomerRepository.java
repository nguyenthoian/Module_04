package com.example.exercise_02.repository;

import com.example.exercise_02.model.entity.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepository implements ICustomerRepository {
    private static List<Customer> customerList;

    static {
        customerList = new ArrayList<>();
        customerList.add(new Customer(1, "Nguyen khac Nhat", "nhat@codegym.vn", "HN"));
        customerList.add(new Customer(2, "Dang Duy Hoa", "hoa.dang@gmail.com", "DN"));
        customerList.add(new Customer(3, "Le Thi Chau", "Chau.le@codegym.vn", "HN"));
        customerList.add(new Customer(4, "CodeGym", "codegym@codegym.vn", "VN"));
    }

    @Override
    public List<Customer> findAll() {
        return customerList;
    }

    @Override
    public void save(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public List<Customer> findByName(String name) {
        List<Customer> customers = new ArrayList<>();
        for (Customer cus : customerList
        ) {
            if (cus.getName().contains(name)) {
                customers.add(cus);
            }
            return customers;
        }
        return customers;
    }

    @Override
    public Customer findById(int id) {
        for (Customer cus : customerList) {
            if (cus.getId() == id) {
                return cus;
            }
        }
        return null;
    }

    @Override
    public List<Customer> update(int id, String name, String email, String address) {

        for (Customer cus : customerList) {
            if (cus.getId() == id) {
                cus.setName(name);
                cus.setEmail(email);
                cus.setAddress(address);
            }
        }
        return customerList;
    }
}
