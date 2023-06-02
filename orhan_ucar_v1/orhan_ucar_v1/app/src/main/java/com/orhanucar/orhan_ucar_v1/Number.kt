package com.orhanucar.orhan_ucar_v1

class Number(private val number: Int) {
    fun basamakTopla() {
        var toplam = 0
        var n = number
        while (n > 0) {
            val digit = n % 10
            toplam += digit
            n /= 10
        }
        println("$number sayisi için basamaklarının toplamı = $toplam")
    }
}
