package com.orhanucar.orhan_ucar_v1.AltinciSoru

open class Personel(val baseSalary: Int) : Calisanlar {
    override fun maasHesapla(hours: Int): Int {
        return (baseSalary + hours * 100) * 3 / 10
    }
}