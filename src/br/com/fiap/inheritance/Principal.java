package br.com.fiap.inheritance;

import br.com.fiap.inheritance.model.People;

import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {

        People p1 = new People();

        p1.setName("Victor");
        p1.setBirthDate(LocalDate.of(1997, 6, 10));


    }

}
