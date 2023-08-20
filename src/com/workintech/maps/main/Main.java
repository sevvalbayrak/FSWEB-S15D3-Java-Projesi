package com.workintech.maps.main;

import com.workintech.maps.model.Employee;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        List<Employee> allEmployee = new LinkedList<>();
        allEmployee.add(new Employee(1, "isim1", "x"));
        allEmployee.add(new Employee(1, "isim1", "x"));
        allEmployee.add(new Employee(2, "isim2", "y"));
        allEmployee.add(new Employee(2, "isim2", "y"));
        allEmployee.add(new Employee(3, "isim3", "z"));
        allEmployee.add(new Employee(3, "isim3", "z"));
        System.out.println("First Employee: " + allEmployee);

        Map<Integer, Employee> uniqueEmployee = new HashMap<>();

        List<Employee> removedEmployee = new ArrayList<>();

        Iterator iterator = allEmployee.iterator();
        while (iterator.hasNext()){
            Employee employee = (Employee) iterator.next();
            if (uniqueEmployee.containsKey(employee.getId())) {
                removedEmployee.add(employee);
                iterator.remove();
            } else {
                uniqueEmployee.put(employee.getId(), employee);
            }
        }

//        for (Employee employee : removedEmployee) {
//             allEmployee.remove(employee);
//        }
        System.out.println("Last Employee: " + allEmployee);
        //System.out.println("Removed Employee: " + removedEmployee);
        //System.out.println("Unique Employee: " + uniqueEmployee);


        System.out.println("Tekrar Eden Çalışanlar:");
        for (Employee employee : removedEmployee) {
            System.out.println(employee.getId() + ". " + employee.getFirstname() + " " + employee.getLastname());
        }

        System.out.println("\nTekrar Etmeyen Çalışanlar:");
        for (Employee employee : uniqueEmployee.values()) {
            System.out.println(employee.getId() + ". " + employee.getFirstname() + " " + employee.getLastname());
        }

    }
}
