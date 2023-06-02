package com.orhanucar.orhan_ucar_v1

class PrimeNumbers {
    companion object {
        fun isPrime(value: Int): Boolean {
            if (value < 2) return false
            for (i in 2..(value / 2)) {
                if (value % i == 0) return false
            }
            return true
        }

        fun getSumOfAllPrimes(n: Int): Int {
            var sum = 0
            for (i in 2..n) {
                if (isPrime(i)) sum += i
            }
            return sum
        }
    }
}
