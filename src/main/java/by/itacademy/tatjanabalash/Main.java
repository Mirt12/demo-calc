package by.itacademy.tatjanabalash;

public class Main {
    public static void main(String[] args) {

//Arrange/Given:
        int expected = 7;

//ACT/When:
        int actual = Calc.sum(3, 4);

//Assert/Then:
        if (actual != expected) {
            System.out.println("Error: expected "+ expected + " actual: " + actual);
        }
    }
}
