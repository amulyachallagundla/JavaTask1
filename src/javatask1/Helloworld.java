package javatask1;

public class Helloworld {
    public static void main(String[]args){
        System.out.println("Hello, Java Internship");
        if (args.length > 0) {
            System.out.println("Command-line arguments:");

            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + i + ": " + args[i]);
            }

        } else {
            System.out.println("No command-line arguments provided.");
        }
    }
}


