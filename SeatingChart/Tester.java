import java.util.*;
/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tester
{
    /********************** Main method Is Complete *********************/
    public static void main(String[] args)
    {
        Student[] students = {
                new Student("Karen", 3),
                new Student("Liz", 1),
                new Student("Paul", 4),
                new Student("Lester", 1),
                new Student("Henry", 5),
                new Student("Renee", 9),
                new Student("Glen", 2),
                new Student("Fran", 6),
                new Student("David", 1),
                new Student("Danny", 3)};

        List<Student> roster = Arrays.asList(students);      
        SeatingChart chart = new SeatingChart(roster, 3, 4);
        System.out.println(chart);
        System.out.println("Removed = " + chart.removeAbsentStudents(4));
        System.out.println(chart);
    }  

}
