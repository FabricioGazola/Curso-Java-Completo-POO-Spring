package entities;

public class Employees {

    public String Name;
    public double GrossSalary;
    public double Tax;

    public double NetSalary(){
        return GrossSalary - Tax;
    }

    public void IncreaseSalary(double porcentage){
        GrossSalary += GrossSalary *  porcentage / 100.0;
    }

    public String ToString(){
        return Name + ", $ " + String.format("%.2f", NetSalary());
    }

}
