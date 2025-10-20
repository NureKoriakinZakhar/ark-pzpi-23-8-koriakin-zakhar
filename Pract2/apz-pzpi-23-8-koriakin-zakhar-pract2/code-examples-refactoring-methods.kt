// ---------- Метод «Rename Method» ----------
/* Приклад коду до рефакторингу */
fun f1(a: Double, b: Double): Double {
    return a * b * 0.1
}

fun main() {
    println(f1(200.0, 3.0))
}


/* Приклад коду після рефакторингу */
fun calculateDiscount(price: Double, quantity: Double): Double {
    val discountRate = 0.1
    return price * quantity * discountRate
}

fun main() {
    println(calculateDiscount(200.0, 3.0))
}

// ---------- Метод «Extract / Replace Magic Number with Symbolic Constant» ----------
/* Приклад коду до рефакторингу */
fun calculateCircleArea(radius: Double): Double {
    return 3.14159 * radius * radius
}

fun main() {
    println("Area: ${calculateCircleArea(5.0)}")
}

/* Приклад коду після рефакторингу */
private const val PI = 3.14159

fun calculateCircleArea(radius: Double): Double {
    return PI * radius * radius
}

fun main() {
    println("Area: ${calculateCircleArea(5.0)}")
}

// ---------- Метод «Replace Temp with Query» ----------
/* Приклад коду до рефакторингу */
fun printOrderTotal(quantity: Int, price: Double) {
    val basePrice = quantity * price
    if (basePrice > 1000) {
        println("Велике замовлення. Знижка 10%")
    } else {
        println("Загальна сума: $basePrice грн")
    }
}

/* Приклад коду після рефакторингу */
fun basePrice(quantity: Int, price: Double): Double = quantity * price

fun printOrderTotal(quantity: Int, price: Double) {
    if (basePrice(quantity, price) > 1000) {
        println("Велике замовлення. Знижка 10%")
    } else {
        println("Загальна сума: ${basePrice(quantity, price)} грн")
    }
}

// ---------- Загальний рефакторинг ----------
/* Приклад коду до рефакторингу */
fun getData(u: String, p: String): Boolean {
    if (u == "admin" && p == "1234") {
        println("Access granted")
        return true
    } else {
        println("Access denied")
        return false
    }
}

/* Приклад коду після рефакторингу */
private const val DEFAULT_USER = "admin"
private const val DEFAULT_PASS = "1234"

fun isAuthorized(username: String, password: String): Boolean {
    val isValid = username == DEFAULT_USER && password == DEFAULT_PASS
    println(if (isValid) "Access granted" else "Access denied")
    return isValid
}
