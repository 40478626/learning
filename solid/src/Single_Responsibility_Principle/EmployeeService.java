package Single_Responsibility_Principle;

class EmployeeService {

    public static void main (String[] args){

        HealthServices healthServices = new HealthServices();
        FoodNDrink foodNDrink = new FoodNDrink();
        Bonus bonus = new Bonus();
        Entertainment entertainment = new Entertainment();

        System.out.println("\nServices for Employee in our company are as follow: \n");
        healthServices.HealthServicesForEmployee();
        foodNDrink.FoodNDrinkForEmployee();
        bonus.BonusForEmployee();
        entertainment.IndoorEntertainment();
    }
}

class HealthServices{
    public void HealthServicesForEmployee(){
        System.out.println("1.Health Services for Employee!\n");
    }
}

class FoodNDrink{
    public void FoodNDrinkForEmployee(){
        System.out.println("2.Employee can also have free food such as snacks and fruit. As for drinks, free water and coffee for our employee!\n");
    }
}

class Bonus{
    public void BonusForEmployee(){
        System.out.println("3.Extra paid time off for Employee as a bonus!\n");
    }
}

class Entertainment{
    public void IndoorEntertainment(){
        System.out.println("4.Indoor entertainment such as ping-pong tables, foosball tables and table tennis are also including for employee!\n");
    }
}


