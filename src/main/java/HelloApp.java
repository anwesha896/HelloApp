public class HelloApp {

    public static void main(String[] args) {

        StringBuilder names = new StringBuilder();

        if (args.length == 0) {
            names.append("World");
        } else {

            int count = 0;

            for (String name : args) {
                if (count > 0) {
                    names.append(", ");
                }
                names.append(name);
                count++;
            }
        }

        System.out.println("Hello, " + names + "!");
    }
}
