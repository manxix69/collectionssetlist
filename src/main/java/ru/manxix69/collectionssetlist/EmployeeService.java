package ru.manxix69.collectionssetlist;

import ru.manxix69.collectionssetlist.exeptions.EmployeeAlreadyAddedException;
import ru.manxix69.collectionssetlist.exeptions.EmployeeNotFoundException;
import ru.manxix69.collectionssetlist.exeptions.EmployeeStorageIsFullException;

public interface EmployeeService {
    String addEmployee(String firstName, String lastName) throws EmployeeStorageIsFullException, EmployeeAlreadyAddedException;

    String deleteEmployee(String firstName, String lastName) throws EmployeeNotFoundException;

    String findEmployee(String firstName, String lastName) throws EmployeeNotFoundException;

    String showAll();
}
