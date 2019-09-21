package id.mitungone.ot

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.gms.ads.*
import id.mitungone.ot.indonesia.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var adsBannerMain: AdView
    private lateinit var interInAd: InterstitialAd

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MobileAds.initialize(this, R.string.id.toString())

        adsBannerMain = findViewById(R.id.adsBannerMain)
        val adRequest = AdRequest.Builder().build()
        adsBannerMain.loadAd(adRequest)

        interInAd = InterstitialAd(this)
        interInAd.setAdUnitId("ca-app-pub-1243923276471582/6812792613")
        interInAd.loadAd(AdRequest.Builder().build())
        interInAd.setAdListener(object : AdListener() {
            override fun onAdClosed() {
                // Load the next interstitial.
                interInAd.loadAd(AdRequest.Builder().build())
            }
        })

        inButton.setOnClickListener(View.OnClickListener {
            val intr = Intent(this@MainActivity, Global::class.java)
            startActivity(intr)
            if (interInAd.isLoaded()) {
                interInAd.show()
            } else {
                Log.d("TAG", "gagal mengload iklan interstitial.")
            }
        })

        adsButton.setOnClickListener(View.OnClickListener {
            val ads = Intent(this@MainActivity, Ads::class.java)
            startActivity(ads)
        })

        rcti.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@MainActivity, Rcti::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        sctv.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@MainActivity, Sctv::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        trans7.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@MainActivity, Trans7::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        transtv.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@MainActivity, Transtv::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        globaltv.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@MainActivity, Globaltv::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        antv.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@MainActivity, Antv::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        metrotv.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@MainActivity, Metrotv::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        kompastv.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@MainActivity, Kompastv::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        tvone.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@MainActivity, Tvone::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        rtv.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@MainActivity, Rtv::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        indosiar.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@MainActivity, Indosiar::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        inewstv.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@MainActivity, Inewstv::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        beritasatu.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@MainActivity, Beritasatu::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        cnn.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@MainActivity, Cnn::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        mnctv.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@MainActivity, Mnctv::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        tvri.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@MainActivity, Tvri::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        nettv.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@MainActivity, Nettv::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        balitv.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@MainActivity, Balitv::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

    }

    override fun onBackPressed() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle(getString(R.string.keluar))
        builder.setMessage(getString(R.string.keluar_message))
        builder.setPositiveButton("Ya") { dialog, i ->
            finishActivity(0)
            finish()
        }
        builder.setNegativeButton("Batal") { dialog, which -> }
        val dialog = builder.show()
    }
}
