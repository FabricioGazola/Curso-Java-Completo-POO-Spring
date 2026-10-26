package application;

import entities.Employees;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employees emp = new Employees();
        System.out.print("Name: ");
        emp.Name = sc.nextLine();
        System.out.print("Gross Salary: ");
        emp.GrossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        emp.Tax = sc.nextDouble();

        System.out.printf("Employee: %s, $ %.2f%n%n", emp.Name, emp.NetSalary());

        System.out.print("Which percentage to increase salary? ");
        double porcentage = sc.nextDouble();
        emp.IncreaseSalary(porcentage);

        System.out.println();
        System.out.println("Update data: " + emp.ToString());

        sc.close();
    }

}
