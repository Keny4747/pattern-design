package decorator5;

import java.util.Locale;

class TestDrive {
    public static void main(String[] args) throws InterruptedException {
        Coffee simpleEspresso = new Espresso();
        System.out.println(simpleEspresso.getDescription() + " $" + formatSum(simpleEspresso.cost()));

        Coffee espressoWithDecor = new Sugar(new Milk(new Espresso()));
        //espressoWithDecor = new Milk(/* write your code here */);
        //espressoWithDecor = new Sugar(/* write your code here */);
        System.out.println(espressoWithDecor.getDescription()  + " $" + formatSum(espressoWithDecor.cost()));

        Coffee instantWithDecor = new Sugar(new Sugar(new Sugar(new WhippedCream(new InstantCoffee()))));
       // instantWithDecor = new WhippedCream(/* write your code here */);
        //instantWithDecor = new Sugar(/* write your code here */);
       // instantWithDecor = new Sugar(/* write your code here */);
       // instantWithDecor = new Sugar(/* write your code here */);
        System.out.println(instantWithDecor.getDescription()+ " $" + formatSum(instantWithDecor.cost()));

        System.out.println("I'm drinking my " + instantWithDecor.getDescription());
        Thread.sleep(1500);
        System.out.println("-I want to add some Whipped Cream to my coffee. And don't make a new one! Just add Whipped Cream");
        Thread.sleep(1500);
        System.out.println("-Okay! But the final price will change");
        Thread.sleep(1500);
        System.out.println("-I understand");

        instantWithDecor = new WhippedCream(new Sugar(new Sugar(new Sugar(new WhippedCream(new InstantCoffee())))));
        System.out.println(instantWithDecor.getDescription() + " $" + formatSum(instantWithDecor.cost()));
    }

    private static String formatSum(double sum) {
        return String.format(Locale.ROOT, "%.2f", sum);
    }
}

abstract class Coffee {
    String description;

    String getDescription() {
        return description;
    }

    abstract double cost();
}

class Espresso extends Coffee {

    Espresso() {
        description = "Espresso";
    }

    @Override
    double cost() {
        return 1.99;
    }
}

class InstantCoffee extends Coffee {

    InstantCoffee() {
        description = "Instant Coffee";
    }

    @Override
    double cost() {
        return 1.0;
    }
}

abstract class Decorator extends Coffee {
    abstract String getDescription();
}

class Milk extends Decorator {

    private Coffee coffee;

    public Milk(Coffee coffee) {
        this.coffee = coffee;
    }

    /* write constructor */

    @Override
    String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    @Override
    double cost() {
        return .13 + coffee.cost();
    }
}

class Sugar extends Decorator {

    private Coffee coffee;

    public Sugar(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    String getDescription() {
        return coffee.getDescription()+ ", Sugar";
    }

    @Override
    double cost() {
        return .02 + coffee.cost();
    }
}

class WhippedCream extends Decorator {

    private Coffee coffee;

    public WhippedCream(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    String getDescription() {
        return coffee.getDescription()+ ", Whipped Cream";
    }

    @Override
    double cost() {
        return .10 + coffee.cost();
    }
}