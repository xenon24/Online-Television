package id.mitungone.ot

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import id.mitungone.ot.timurtengah.*
import kotlinx.android.synthetic.main.content_timur_tengah.*

class TimurTengah : AppCompatActivity() {

    private lateinit var adsBanner: AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timur_tengah)

        religiBackButton.setOnClickListener(View.OnClickListener {
            onBackPressed()
            finish()
        })

        MobileAds.initialize(this, R.string.id.toString())

        adsBanner= findViewById(R.id.adsBanner)
        val adRequest = AdRequest.Builder().build()
        adsBanner.loadAd(adRequest)

        religi1.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@TimurTengah, Religi1::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        religi2.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@TimurTengah, Religi2::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        religi3.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@TimurTengah, Religi3::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        religi5.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@TimurTengah, Religi5::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        religi8.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@TimurTengah, Religi8::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })
    }
}
