package com.example.SpringWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.InputMismatchException;
import java.util.Scanner;

@SpringBootApplication
public class SpringWebAppApplication {

    public static void main(String[] args) {
        	SpringApplication.run(SpringWebAppApplication.class, args);


/*        boolean boll = true;
        while (boll = true) {
            try {
                boll = false;
                Scanner scanner = new Scanner(System.in);
                int a = scanner.nextInt();
                int b = scanner.nextInt();

                int c = a + b;
                System.out.println(c);

            } catch (InputMismatchException e) {

            }

        }*/


    }

}
