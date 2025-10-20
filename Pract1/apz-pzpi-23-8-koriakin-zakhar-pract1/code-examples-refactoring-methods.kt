class User(val name: String, val age: Int)

/* Поганий код */
class User { /* ... */ }
class Order { /* ... */ }
class Invoice { /* ... */ }

// ---------- 1.2.3 Форматування коду ----------
/* Хороший код */
fun printHello(user: User?) {
    if (user != null) {
        println("Hello, ${user.name}")
    }
}

/* Поганий код */
fun badHello(u:User?){if(u!=null){println("Hello,"+u.name)}}

// ---------- 1.2.4 Іменування ----------
/* Хороший код */
val userName: String = "Іван"
fun getUserAge(): Int = 25
class UserProfile
const val MAX_RETRY_COUNT = 3

/* Поганий код */
val User_name: String = "Іван"
fun Get_user_Age(): Int = 25
class user_profile

// ---------- 1.2.5 Коментарі ----------
/* Хороший код */
// Обчислюємо податок для замовлення з урахуванням ПДВ
val tax = order.calculateTax()

/* Поганий код */
// Змінна tax
val badTax = order.calculateTax()

// ---------- 1.2.6 Документування коду ----------
/**
 * Обчислює знижку для клієнта.
 *
 * @param amount сума покупки
 * @return розмір знижки у відсотках
 * @sample calculateDiscount(200.0) // повертає 10
 */
fun calculateDiscount(amount: Double): Int {
    return if (amount > 100) 10 else 0
}

// ---------- 1.2.8 Кодування на основі тестування (TDD) ----------
/* Хороший тест */
@Test
fun testDiscount() {
    assertEquals(10, calculateDiscount(200.0))
}

/* Реалізація */
fun calculateDiscountTDD(amount: Double): Int = if (amount > 100) 10 else 0

// ---------- 1.2.10 Приклади оформлення коду ----------
/* Хороший код */
fun isAdult(age: Int): Boolean {
    return age >= 18
}

fun printUserInfo(user: User) {
    println("Name: ${user.name}")
    println("Age: ${user.age}")
}

class ProperUser(val name: String, val age: Int)

/* Поганий код */
fun adult(a:Int):Boolean{return a>=18}
fun pu(u:User){println(u.name);println(u.age)}
class U(n:String,a:Int)
