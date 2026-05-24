

class FaultManager {

    private val faults = listOf(
        "Bearing Failure",
        "Overheated Motor",
        "Loose Wiring",
        "Hydraulic Leak"
    )

    var currentFault = ""

    fun generateFault() {
        currentFault = faults.random()
    }
}