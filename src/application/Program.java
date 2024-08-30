package application;

import model.entities.Department;
import model.entities.Seller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

    public static void main(String[] args) {

        Department obj = new Department(1, "Books");

        Seller seller = new Seller(21, "Bob", "bob@gmail.com", LocalDateTime.now(), 3000.0, obj);

        System.out.println(seller);
    }
}
