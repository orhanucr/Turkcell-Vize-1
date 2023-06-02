package com.orhanucar.orhan_ucar_v1.AltinciSoru

open class Mudur(baseSalary: Int) : Personel(baseSalary) {
    override fun maasHesapla(hours: Int): Int {
        return (baseSalary + hours * 100) * 6 / 10
    }
}
