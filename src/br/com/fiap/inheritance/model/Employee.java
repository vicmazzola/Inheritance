package br.com.fiap.inheritance.model;

public class Employee extends People {

    private double salary;
    private String role;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
