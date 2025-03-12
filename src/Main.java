import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Деклариране на променлива demoClass, която представлява референция към класа Demo
        Class<Demo> demoClass = Demo.class;
        // Проверка дали класът Demo е анотиран с @Subject
       if (demoClass.isAnnotationPresent(Subject.class)){
           // Извличане на анотацията @Subject от класа Demo
           Subject annotation = demoClass.getAnnotation(Subject.class);
           // Извеждане на категориите, зададени в анотацията, като масив от низове
           System.out.println(Arrays.toString(annotation.categories()));
       }


    }
}