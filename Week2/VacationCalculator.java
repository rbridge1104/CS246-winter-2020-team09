package shaik;

import java.util.ArrayList;
import java.util.List;

class VacationCalculator {

    public static void main(String[] args) {

        VacationCalculator vc = new VacationCalculator();

        // Calculate some vacation costs...
        float japanCost = vc.calculateVacationCost(Destination.Japan, 5);
        float europeCost = vc.calculateVacationCost(Destination.Europe, 5);
        float mexicoCost = vc.calculateVacationCost(Destination.Mexico, 5);

        // Print the cost...
        System.out.format("The cost of trip to Japan is $%.2f%n", japanCost);
        System.out.format("The cost of trip to Europe is $%.2f%n", europeCost);
        System.out.format("The cost of trip to Mexico $%.2f%n", mexicoCost);
    }

    /**
     * Calculates the total cost for vacationing at a given location for
     * a specific number of nights.
     *
     * @param  dest the destination of the vacation
     * @return      the total cost of the vacation
     */
    public float calculateVacationCost(Destination dest, int day) {
        List<Expense> expenses = new ArrayList<>();
        expenses.add(new Cruise(dest));
        expenses.add(new Dining(dest, day));
        expenses.add(new Lodging(dest, day));
        return tallyExpenses(expenses);
    }

    /**
     * An internal method used by VacationCalculator to loop through
     * a List of items that implement the Expense interface and
     * determine their cost
     *
     * @param  expenses A list of items that implement the Expense interface
     * @return          the total cost calculated by the items
     */
    float tallyExpenses(List<Expense> expenses) {
        float sum = 0;
        for (Expense i : expenses) {
            sum += i.getCost();
        }
        return sum;
    }
}