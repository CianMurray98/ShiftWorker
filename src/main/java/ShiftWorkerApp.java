//Cian Murray
//This class tests the parameters set in the ShiftWorker class. This class is filled
// with dummy info for the purpose of demonstrating. Invalid entries return unique
// messages detailing the problem.


public class ShiftWorkerApp {
    public static void main(String[] args) {
        try {
            ShiftWorker ShiftWorker1 = new ShiftWorker("Cian Murray",24, "Man", 1);
            System.out.println(ShiftWorker1); }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); }

        try {
            ShiftWorker ShiftWorker2 = new ShiftWorker("Cian", 24, "Man", 1);
            System.out.println(ShiftWorker2); }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); }

        try {
            ShiftWorker ShiftWorker3 = new ShiftWorker("Cian Murray", 16, "Man", 2);
            System.out.println(ShiftWorker3); }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); }

        try {
            ShiftWorker ShiftWorker4 = new ShiftWorker("Cian Murray", 24, "Turtle", 2);
            System.out.println(ShiftWorker4); }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); }

        try {
            ShiftWorker ShiftWorker5 = new ShiftWorker("Cian Murray", 24, "Woman", 3);
            System.out.println(ShiftWorker5); }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); }

        try {
            ShiftWorker ShiftWorker6 = new ShiftWorker("Enda Kenny", 45, "Man", 1);
            System.out.println(ShiftWorker6); }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); }
    }
}
