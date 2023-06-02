package com.orhanucar.orhan_ucar_v1.AltinciSoru

class GenelMudur(baseSalary: Int) : Mudur(baseSalary) {
    override fun maasHesapla(hours: Int): Int {
        return (baseSalary + hours * 100) * 8 / 10
    }
}