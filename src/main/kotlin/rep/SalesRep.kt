package rep

import employee.Employee

open class SalesRep (firstName: String, lastName: String, ra: Int, age: Int,
                daysWorked: Int, vacationDays: Int, salary: Double, yearsWorked: Int,
                var salesMade: Double):
    Employee(firstName, lastName, ra, age, daysWorked, vacationDays, salary, yearsWorked) {

    open fun calculateComission(): Double {
        return 0.1 * salesMade
    }
}