package br.com.fiap.inheritance;

import br.com.fiap.inheritance.model.Customer;
import br.com.fiap.inheritance.model.Employee;
import br.com.fiap.inheritance.model.People;

import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {

        Customer c1 = new Customer();
        c1.setName("Bob");
        c1.setEmail("bobvance@vancerefrigerators.com");
        c1.setPhone("+5511975475677");
        c1.setBirthDate(LocalDate.of(1970, 10, 25));


        Employee e1 = new Employee();
        e1.setName("Michael");
        e1.setEmail("michael@dundermifflin.com");
        e1.setPhone("+35699375533");
        e1.setBirthDate(LocalDate.of(1975, 06, 10));
        e1.setSalary(18900.00);
        e1.setRole("Manager");



    }

}
