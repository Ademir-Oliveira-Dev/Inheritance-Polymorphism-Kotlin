import employee.Employee
import manager.SalesManager
import rep.SalesRep

fun main(args: Array<String>) {

    val firstRep = SalesRep("Ademir", "Oliveira", 2105, 24, 360,
    30, 3500.0, 3, 250.0)

    val secondRep = SalesRep("Esther", "Castellano", 2105, 24, 360,
        30, 3500.0, 20, 330.0)

    val thirdRep = SalesRep("Camila", "Campos", 2105, 24, 360,
        30, 3500.0, 25, 460.0)

    val firstManager = SalesManager("Camila", "Campos", 2105, 24, 360,
        30, 3500.0, 30)

    println(firstRep.timeToRetirement())
    println(firstRep.vacationTimeLeft())
    println(firstRep.calculateBonus())
    println(firstRep.calculateComission())

    firstManager.addSalesRep(firstRep)
    firstManager.addSalesRep(secondRep)
    firstManager.addSalesRep(thirdRep)

    firstManager.calculateComission()

}