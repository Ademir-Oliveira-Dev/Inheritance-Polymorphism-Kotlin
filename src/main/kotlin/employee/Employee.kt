package employee

import java.util.Collections.min
import kotlin.math.min

abstract class Employee (var firstName: String, var lastName: String, var ra: Int, var age: Int,
                var daysWorked: Int, var vacationDays: Int, var salary: Double, var yearsWorked: Int){

    fun timeToRetirement(): Int {
        return min(60 - age, 40 - yearsWorked)
    }

    fun vacationTimeLeft(): Int {
        return (daysWorked/360)*(30 - vacationDays)
    }

    fun calculateBonus(): Double {
        return 2.2*salary
    }

}