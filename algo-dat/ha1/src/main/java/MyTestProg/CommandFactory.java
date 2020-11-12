package MyTestProg;

import java.util.LinkedList;

public class CommandFactory {
    static private final String sTextPleaseInsertANumber = "Please insert a number:";
    static private final String sExitMessage = "CLI program closed!";

    static public LinkedList<ICommand> returnCommandList() {
        LinkedList<ICommand> list = new LinkedList<ICommand>();
        list.add(createExitCommand());
        list.add(createEuclidSubtractionRecursive());
        list.add(createEuclidSubtractionIterative());
        list.add(createEuclidDivisionRestRecursive());
        list.add(createEuclidDivisionRestIterative());
        list.add(createSieveEratosthenes());
        list.add(readProperties());
        return list;
    }

    static private ICommand createEuclidDivisionRestRecursive() {
        return new ICommand() {
            @Override
            public String execute() {
                int x = Console.readIntegerFromStdIn(sTextPleaseInsertANumber);
                int y = Console.readIntegerFromStdIn(sTextPleaseInsertANumber);
                int result = GCD.eculidDivisionRestRecursive(x, y);
                return System.lineSeparator() + "GCD is: " + result + System.lineSeparator();
            }

            @Override
            public String description() {
                return "Greatest Common Divisor (GCD) - (Recursive) Euclid's algorithm division rest.";
            }
        };
    }

    static private ICommand createEuclidSubtractionIterative() {
        return new ICommand() {
            @Override
            public String execute() {
                int x = Console.readIntegerFromStdIn(sTextPleaseInsertANumber);
                int y = Console.readIntegerFromStdIn(sTextPleaseInsertANumber);
                int result = GCD.eculidSubstractionIterative(x, y);
                return System.lineSeparator() + "GCD is: " + result + System.lineSeparator();
            }

            @Override
            public String description() {
                return "Greatest Common Divisor (GCD) - (Iterative) Euclid's algorithm subtraction.";
            }
        };
    }

    static private ICommand createEuclidSubtractionRecursive() {
        return new ICommand() {
            @Override
            public String execute() {
                int x = Console.readIntegerFromStdIn(sTextPleaseInsertANumber);
                int y = Console.readIntegerFromStdIn(sTextPleaseInsertANumber);
                int result = GCD.euclidSubstractionRecursive(x, y);
                return System.lineSeparator() + "GCD is: " + result + System.lineSeparator();
            }

            @Override
            public String description() {
                return "Greatest Common Divisor (GCD) - (Recursive) Euclid's algorithm subtraction.";
            }
        };
    }

    static private ICommand createEuclidDivisionRestIterative() {
        return new ICommand() {
            @Override
            public String execute() {
                int x = Console.readIntegerFromStdIn(sTextPleaseInsertANumber);
                int y = Console.readIntegerFromStdIn(sTextPleaseInsertANumber);
                int result = GCD.eculidDivisionRestIterative(x, y);
                return System.lineSeparator() + "GCD is: " + result + System.lineSeparator();
            }

            @Override
            public String description() {
                return "Greatest Common Divisor (GCD) - (Iterative) Euclid's algorithm division rest.";
            }
        };
    }

    static private ICommand createSieveEratosthenes(){
        return new ICommand(){
            @Override
            public String execute(){
                int x = Console.readIntegerFromStdIn(sTextPleaseInsertANumber);
                boolean[] resultArray = SDE.siebDesEratosthenes(x);
                return "todo";
            }

            @Override
            public String description(){
                return "Sieve of Eratosthenes.";
            }
        };
    }

    static private ICommand readProperties(){
        return new ICommand(){
            @Override
            public String execute(){
                return "// TODO: Implementation";
            }

            @Override
            public String description(){
                return "Read properties like surname, prename, x and y.";
            }
        };
    }

    private static ICommand createExitCommand() {
        return new ICommand() {
            @Override
            public String execute() {
                System.out.println(sExitMessage);
                System.exit(0);
                return null;
            }

            @Override
            public String description() {
                return "Exit";
            }
        };
    }
}