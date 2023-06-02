package com.orhanucar.orhan_ucar_v1

class SeriesCalculator {
    companion object {
        fun calculateSeries(n: Int): Double {
            var sum = 1.0
            var factorial = 1

            for (i in 1..n) {
                factorial *= i
                sum += (i.toDouble() / factorial)
            }

            return sum
        }
    }
}
