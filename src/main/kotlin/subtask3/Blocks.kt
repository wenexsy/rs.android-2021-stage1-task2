package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.reflect.KClass

class Blocks {

    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        return when(blockB){
            String::class -> blockA.filterIsInstance<String>().joinToString("")
            Int::class -> blockA.filterIsInstance<Int>().sum()
            LocalDate::class -> DateTimeFormatter.ofPattern("dd.MM.yyyy").format(blockA.filterIsInstance<LocalDate>().max())
            else-> print("Error")
        }
    }

}