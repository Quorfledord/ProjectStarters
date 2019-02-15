/*** 
 * <<< This class is NOT complete. >>>
 * 
 * A company has the following instance fields: 
 * int retireAge, int retireYears, int retireSalary, int salaryBudget, 
 * and an ArrayList empList, which contains a list of employees
 * 
 * For this questions you must complete the methods: 
 *   1) addEmployee
 *   2) printEmployeeList
 *   3) employeeIsEligible
 *   4) processRetirements
 */
import java.util.*;

public class Company
{
    private ArrayList<Employee> empList; // array list of all employees in this company
    private int retireAge; // minimum age to retire
    private int retireYears; // minimum years on job to retire
    private int retireSalary; // minimum salary to retire
    private int salaryBudget; // total salary of ALL employees in the company

    /** <<< THIS CODE IS COMPLETE >>>
     * constructs a company with a given retirement age, 
     * years of service and salary
     * 
     * @param retireAge - the retirement age
     * @param retireYears - number of years of service
     * @param retireSalary - retirement salary
     */
    public Company (int retireAge, int retireYears, int retireSalary)
    {
        this.retireAge = retireAge;
        this.retireYears = retireYears;
        this.retireSalary = retireSalary;
        salaryBudget = 0;
        empList = new ArrayList<Employee>();
    }

    /** 
     * <<< This code is NOT complete. >>>
     * postcondition: 
     * 1) Adds employee to the ArrayList empList
     * 2) Update 'salaryBudget' by adding the new employee's salary
     * 
     * @param emp - The employee to be added
     */
    public void addEmployee(Employee emp)
    {

        // <<< Complete the code >>>

    }

    /**
     * <<< This code is NOT complete. >>>
     * postcondition: 
     *   1) print a list of all employee's in the company. 
     *   2) print the salaryBudget
     */    
    public void printEmployeeList()
    {

        // <<< Complete the code >>>

    }

    /**
     * <<< This code is NOT complete. >>>
     * This method determines if an employee is eligible to retire.
     * An employee can retire if they meet at least two of the following
     * requirements:
     * 
     *   1) The employee is at least retireAge years old.
     *   2) The employee has worked at least retireYears.
     *   3) The employee's salary is at least retireSalary.
     * 
     * @param emp - The employee whose eligibility will be checked
     * @return true if emp is eligible to retire, otherwise false
     */ 
    private boolean employeeIsEligible(Employee emp)
    {

        // <<< Complete the code >>>

    }

    /** 
     * <<< This code is NOT complete. >>>
     * postcondition: 
     *   1) remove ALL retirement-eligible employees from empList;
     *   2) salaryBudget has been updated to reflect remaining employees
     */
    public void processRetirements()
    {

        // <<< Complete the code >>>

    }

}
