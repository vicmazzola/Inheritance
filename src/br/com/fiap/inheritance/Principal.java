package br.com.fiap.inheritance;

import br.com.fiap.inheritance.model.Customer;
import br.com.fiap.inheritance.model.People;

import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {

        Customer c1 = new Customer();
        c1.setName("Bob");
        c1.setEmail("bobvance@vancerefrigerators.com");
        c1.setPhone("+5511975475677");
        c1.setBirthDate(LocalDate.of(1970, 10, 25));

    }

}
