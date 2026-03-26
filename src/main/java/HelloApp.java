public class HelloApp {

    public static void main(String[] args) {

        // If no arguments, default to "World"
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder nameBuilder = new StringBuilder();

            // Append all names with ", "
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Remove trailing ", "
            String result = nameBuilder.substring(0, nameBuilder.length() - 2);

            // Print final greeting
            System.out.println("Hello, " + result + "!");
        }
    }
}
