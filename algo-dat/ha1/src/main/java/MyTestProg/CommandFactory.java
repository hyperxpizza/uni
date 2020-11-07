package MyTestProg;

import java.util.LinkedList;

public class CommandFactory {
    static private final String sTextPleaseInsertANumber = "\tPlease insert a number:";
    static private final String sExitMessage = "CLI program closed!";

    static public LinkedList<ICommand> returnCommandList() {
        LinkedList<ICommand> list = new LinkedList<ICommand>();
        list.add(createExitCommand());
        list.add(createEuclidSubtractionRecursive());
        list.add(createEuclidSubtractionIterative());
        list.add(createEuclidDivisionRestRecursive());
        list.add(createEuclidDivisionRestIterative());
        //TODO: Implementation of ICommands for Sieve of Eratosthenes and so one
        return list;
    }

    static private ICommand createEuclidDivisionRestRecursive() {
        return new ICommand() {
            @Override
            public String execute() {
                int x = Console.readIntegerFromStdIn(sTextPleaseInsertANumber);
                int y = Console.readIntegerFromStdIn(sTextPleaseInsertANumber);
                int result = x + y; // TODO: GCD.calcEuclidDivisionRestRecursive(x, y);
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
                return "// TODO: Implementation";
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
                int result = x + y; // TODO: GCD.calcEuclidRecSubtraction(x, y);
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
                return "// TODO: Implementation";
            }

            @Override
            public String description() {
                return "Greatest Common Divisor (GCD) - (Iterative) Euclid's algorithm division rest.";
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