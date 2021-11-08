package manager

import employee.Employee
import rep.SalesRep

class SalesManager(firstName: String, lastName: String, ra: Int, age: Int,
                   daysWorked: Int, vacationDays: Int, salary: Double, yearsWorked: Int):
       Employee(firstName, lastName, ra, age, daysWorked, vacationDays, salary, yearsWorked) {

    val salesTeam = hashMapOf<Int, SalesRep>()

    fun addSalesRep(salesRep:SalesRep){
        salesTeam.put(salesRep.ra, salesRep)
    }

    fun calculateComission() {
        var salesNumber = 0.0
        if (salesTeam.isEmpty()){
            println("Não existe representantes no time.")
        }else{
            for (item in salesTeam){
                salesNumber += item.value.salesMade
            }
            val comission = 0.03 * salesNumber
            println("Com base nas vendas de toda equipe, a comissão da equipe é R$$comission ")
        }
    }




}