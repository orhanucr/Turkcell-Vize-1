package com.orhanucar.orhan_ucar_v1.IkıncıSoru

class Deger(val number: Int) : Reverseable {
    override fun reverse(): String {
        return number.toString().reversed()
    }
}