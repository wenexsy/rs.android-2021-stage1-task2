package subtask2

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        var A = 0
        for (B in b) {
            while (a[A].toUpperCase() != B) {
                if (a.length != A.inc()) {
                    A++
                } else {
                    return "NO"
                }
            }
        }
        return "YES"
    }
}