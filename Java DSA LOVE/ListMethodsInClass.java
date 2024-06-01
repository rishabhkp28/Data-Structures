import java.lang.reflect.Method;

public class ListMethodsInClass {
    public static void main(String[] args) {
        // Replace "YourClassName" with the name of the class you want to list the methods for
        String className = "java.util.Arrays";

        try {
            Class<?> clazz = Class.forName(className);

            // Get all declared methods (including public, private, protected, etc.)
            Method[] methods = clazz.getDeclaredMethods();

            System.out.println("List of methods in class " + className + ":");
            for (Method method : methods) {
                System.out.println(method.getName());
            }
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found: " + className);
        }
    }
}
