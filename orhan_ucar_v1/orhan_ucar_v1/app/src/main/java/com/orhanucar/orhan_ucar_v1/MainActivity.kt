package com.orhanucar.orhan_ucar_v1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.orhanucar.orhan_ucar_v1.AltinciSoru.GenelMudur
import com.orhanucar.orhan_ucar_v1.AltinciSoru.Mudur
import com.orhanucar.orhan_ucar_v1.AltinciSoru.Personel
import com.orhanucar.orhan_ucar_v1.IkıncıSoru.Deger
import com.orhanucar.orhan_ucar_v1.Number

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1.Soru
        val number = Number(245)
        number.basamakTopla()

        //2.Soru
        val deger = Deger(743)
        println(deger.reverse())

        //3.Soru
        val result = SeriesCalculator.calculateSeries(7)
        println("Serinin toplamı: $result")

        //4.Soru
        val n = 7
        val sumOfPrimes = PrimeNumbers.getSumOfAllPrimes(n)
        println("1'den $n'e kadar olan asal sayıların toplamı: $sumOfPrimes")

        //5.Soru
        //4.Soru icin oluşturduğumuz PrimeNumbers class ındaki isPrime fonksiyounu burada da kullandık
        val value = 11
        if (PrimeNumbers.isPrime(value)) {
            println("$value asal sayidir")
        } else {
            println("$value asal sayi değildir!")
        }

        //6.Soru
        val personel = Personel(1000)
        val mudur = Mudur(3000)
        val genelMudur = GenelMudur(5000)

        println("Personel Maasi: ${personel.maasHesapla(50)}")
        println("Mudur Maasi: ${mudur.maasHesapla(50)}")
        println("Genel Mudur Maasi: ${genelMudur.maasHesapla(50)}")


    }

}