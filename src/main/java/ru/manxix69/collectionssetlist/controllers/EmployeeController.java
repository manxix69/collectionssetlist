package ru.manxix69.collectionssetlist.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.manxix69.collectionssetlist.EmployeeService;

@RestController
@RequestMapping("/employee")

public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping()
    public String greeting() {
        return "Укажи метод и укажи параметры." + "\n\n" +
                "На примере сотрудника 'Ivan Ivanov' :" + "\n\n" +
                "добавить:" + "\n" +
                "/add?firstName=Ivan&lastName=Ivanov" + "\n\n" +
                "удалить:" + "\n" +
                "/remove?firstName=Ivan&lastName=Ivanov" + "\n\n" +
                "найти:" + "\n" +
                "/find?firstName=Ivan&lastName=Ivanov"
                ;
    }

    @GetMapping(path = "/add")
    public String add(@RequestParam String firstName, @RequestParam String lastName) {
        System.out.println("ADD:" + lastName + " " + firstName);
        return employeeService.addEmployee(firstName, lastName);
    }

    @GetMapping(path = "/remove")
    public String remove(@RequestParam String firstName, @RequestParam String lastName) {
//        System.out.println("remove:" + lastName + " " + firstName);
        return employeeService.deleteEmployee(firstName, lastName);
    }

    @GetMapping(path = "/find")
    public String find(@RequestParam String firstName, @RequestParam String lastName) {
//        System.out.println("FIND:" + lastName + " " + firstName);
        return employeeService.findEmployee(firstName, lastName);
    }

    @GetMapping(path = "/showAll")
    public String showAll() {
//        System.out.println("showAll");
        return employeeService.showAll();
    }

}
