package com.example.SpringWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.InputMismatchException;
import java.util.Scanner;

@RestController

public class MainController {
    //  @RequestMapping(path = "/",method = RequestMethod.GET)
    //
    //

    @GetMapping("/sayHelloToName")
    public String sayHelloToSomeone(@RequestParam("name") String name){
        return String.format("Hello %s",name);
    }

    @GetMapping("/studentText")
    public String studentText() {

        return "{\"id\":1,\"name\":\"name\",\"surname\":\"surname\"}";
    }

    @GetMapping("/bye")
    public String bye() {

        return "good bye";
    }


    @GetMapping("/htmlHello")
    public String helloWithHtml() {
        return "<html>\n" +
                "    <head>\n" +
                "        <title>hello</title>\n" +
                "    </head>\n" +
                "    <body>\n" +
                "        <p>hello.</p>\n" +
                "    </body>\n" +
                "</html>";
    }

    @GetMapping("/")
    public String hello() {

        return "hello word";
    }


    @GetMapping("/student")
    public Student getStudent() {
        return new Student(1, "name", "surname");
    }

    @GetMapping("/calculator")
    public String calc() {
        return "<html>\n" +
                "<head>\n" +
                "<title>HTML Calculator</title>\n" +
                "</head>\n" +
                "<body bgcolor= \"#000000\" text= \"gold\">\n" +
                "<form name=\"calculator\" >\n" +
                "<input type=\"button\" value=\"1\" onClick=\"document.calculator.ans.value+='1'\">\n" +
                "<input type=\"button\" value=\"2\" onClick=\"document.calculator.ans.value+='2'\">\n" +
                "<input type=\"button\" value=\"3\" onClick=\"document.calculator.ans.value+='3'\"><br>\n" +
                "<input type=\"button\" value=\"4\" onClick=\"document.calculator.ans.value+='4'\">\n" +
                "<input type=\"button\" value=\"5\" onClick=\"document.calculator.ans.value+='5'\">\n" +
                "<input type=\"button\" value=\"6\" onClick=\"document.calculator.ans.value+='6'\">\n" +
                "<input type=\"button\" value=\"7\" onClick=\"document.calculator.ans.value+='7'\"><br>\n" +
                "<input type=\"button\" value=\"8\" onClick=\"document.calculator.ans.value+='8'\">\n" +
                "<input type=\"button\" value=\"9\" onClick=\"document.calculator.ans.value+='9'\">\n" +
                "<input type=\"button\" value=\"-\" onClick=\"document.calculator.ans.value+='-'\">\n" +
                "<input type=\"button\" value=\"+\" onClick=\"document.calculator.ans.value+='+'\"><br>\n" +
                "<input type=\"button\" value=\"*\" onClick=\"document.calculator.ans.value+='*'\">\n" +
                "<input type=\"button\" value=\"/\" onClick=\"document.calculator.ans.value+='/'\">\n" +
                "\n" +
                "<input type=\"button\" value=\"0\" onClick=\"document.calculator.ans.value+='0'\">\n" +
                "<input type=\"reset\" value=\"Reset\">\n" +
                "<input type=\"button\" value=\"=\" onClick=\"document.calculator.ans.value=eval(document.calculator.ans.value)\">\n" +
                "<br>Solution is <input type=\"textfield\" name=\"ans\" value=\"\">\n" +
                "</form>\n" +
                "</body>\n" +
                "</html>";
    }


    /*@GetMapping("/")
    public void sum(){
        boolean boll = true;
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

        }
    }*/

}
