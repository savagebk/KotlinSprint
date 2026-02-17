package org.example.lesson_2

fun main() {

    val workers = 50                                                                //количество постоянных сотрудников
    val interns = 30                                                                //количество стажеров
    val workerSalary = 30_000                                                       //зарплата постоянного сотрудника
    val internSalary = 20_000                                                       //зарплата стажера

    var allWorkersSalary = workerSalary * workers                                   //Расходы на выплату зарплаты постоянных сотрудников
    var allInternsSalary = internSalary * interns                                   //Расходы на выплату зарплаты стажеров
    var overallSalary = allWorkersSalary + allInternsSalary                         //Общие расходы по ЗП после прихода стажеров

    var avgSalary = overallSalary / (workers + interns)                             //Средняя ЗП одного сотрудника после устройства стажеров

    //приведение сумм зарплаты в удобочитаемый вид
    var formattedAllWorkersSalary = String.format("%,d", allWorkersSalary)
    var formattedOverallSalary = String.format("%,d", overallSalary)
    var formattedAvgSalary = String.format("%,d", avgSalary)

    println("Расходы на выплату зарплаты постоянных сотрудников: $formattedAllWorkersSalary р.")
    println("Общие расходы по ЗП после прихода стажеров: $formattedOverallSalary р.")
    println("Cредняя ЗП одного сотрудника после устройства стажеров: $formattedAvgSalary р.")



}