package classesKotlin.rsk

sealed class PersonEvent {
    class Awake:PersonEvent()
    class Asleep: PersonEvent()
    class Eating(val food: String): PersonEvent()

}

fun handleSubmit(event: PersonEvent){
    when (event) {
        is PersonEvent.Awake -> println("Awake")
        is PersonEvent.Asleep -> println("Asleep")
        is PersonEvent.Eating -> println(event.food)

    }
}

