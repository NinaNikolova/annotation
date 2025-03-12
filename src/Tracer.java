import java.util.Arrays;

// Дефиниране на клас Tracer
public class Tracer {
    // Анотиране на метода main с @Author и име "Stamat"
    @Author(name = "Stamat")
    public static void main(String[] args) {
        // Извикване на метода printMethodByAuthor, като му подаваме текущия клас (Tracer.class)
        Tracer.printMethodByAuthor(Tracer.class);
    }
    // Анотиране на метода printMethodByAuthor с @Author и име "Ivan"
    @Author(name = "Ivan")
    public static void printMethodByAuthor(Class<?> cl) {
        // Обхождаме всички методи на подадения клас с помощта Streams api
        Arrays.stream(cl.getDeclaredMethods())
                // Филтрираме само тези методи, които са анотирани с @Author
                .filter(m -> m.isAnnotationPresent(Author.class))
                // За всеки намерен метод извеждаме автора и името на метода
                .forEach(m -> {
                    System.out.println(m.getAnnotation(Author.class).name() + ": " + m.getName());
                });
    }

}
