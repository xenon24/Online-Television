package id.mitungone.ot

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import id.mitungone.ot.korea.*
import kotlinx.android.synthetic.main.content_korea.*

class Korea : AppCompatActivity() {

    private lateinit var adsBannerKr: AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_korea)

        koreaBackButton.setOnClickListener(View.OnClickListener {
            onBackPressed()
            finish()
        })

        MobileAds.initialize(this, R.string.id.toString())

        adsBannerKr = findViewById(R.id.adsBannerKorea)
        val adRequest = AdRequest.Builder().build()
        adsBannerKr.loadAd(adRequest)

        korea1.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@Korea, Korea1::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        korea2.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@Korea, Korea2::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        korea3.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@Korea, Korea3::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        korea4.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@Korea, Korea4::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        korea5.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@Korea, Korea5::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        korea6.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@Korea, Korea6::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        korea7.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@Korea, Korea7::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        korea8.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@Korea, Korea8::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        korea9.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@Korea, Korea9::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        korea10.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@Korea, Korea10::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        korea11.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@Korea, Korea11::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        korea12.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@Korea, Korea12::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        korea13.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@Korea, Korea13::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        korea14.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@Korea, Korea14::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        korea15.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@Korea, Korea15::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        korea16.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@Korea, Korea16::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

    }
}
