import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//Target - where to use annotation - ElementType.TYPE - only with classes
// @Target указва, че тази анотация може да се прилага върху класове, интерфейси или енумерации
@Target(value = {ElementType.TYPE})
// @Retention указва, че анотацията ще бъде налична по време на изпълнение чрез рефлексия
@Retention(RetentionPolicy.RUNTIME)
// Дефиниране на персонализирана анотация с име 'Subject'
public @interface Subject {
    // Деклариране на елемент 'categories', който е String-масив (по подразбиране празен)
    String[] categories() default {};
}
