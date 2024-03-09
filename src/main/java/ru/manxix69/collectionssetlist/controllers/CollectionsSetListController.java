package ru.manxix69.collectionssetlist.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.manxix69.collectionssetlist.CollectionsSetListService;

@RestController
@RequestMapping("/employee")

public class CollectionsSetListController {
    private final CollectionsSetListService calculatorService;

    public CollectionsSetListController(CollectionsSetListService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String greeting() {
        return "Hi! !!! ";
    }

//    @GetMapping(path = "/plus")

}
