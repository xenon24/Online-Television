package id.mitungone.ot

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import id.mitungone.ot.olahraga.*
import kotlinx.android.synthetic.main.content_olahraga.*

class Olahraga : AppCompatActivity() {

    private lateinit var adsBanner: AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_olahraga)

        olahragaBackButton.setOnClickListener(View.OnClickListener {
            onBackPressed()
            finish()
        })

        warningButton.setOnClickListener(View.OnClickListener {
                val builder = AlertDialog.Builder(this)
                builder.setTitle("Pemberitahuan")
                builder.setMessage("Kami memberitahukan bahwa mungkin halaman ini akan jarang sekali di update, dikarenakan link pada setiap saluran sedikit sulit didapatkan namun jika anda memiliki link saluran, anda bisa mengirimkan kepada kami sehingga kami dapat segera memperbaruinya. Silakan hubungi pengembang pada halaman bantuan jika anda memiliki link terbaru, terimakasih.")
                builder.setNegativeButton("Selesai") { dialog, which -> }
                val dialog = builder.show()
        })

        MobileAds.initialize(this, R.string.id.toString())

        adsBanner = findViewById(R.id.adsBanner)
        val adRequest = AdRequest.Builder().build()
        adsBanner.loadAd(adRequest)

        olahraga1.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@Olahraga, Olahraga1::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        olahraga2.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@Olahraga, Olahraga2::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        olahraga3.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@Olahraga, Olahraga3::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        olahraga4.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@Olahraga, Olahraga4::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        olahraga5.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@Olahraga, Olahraga5::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        olahraga6.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@Olahraga, Olahraga6::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        olahraga7.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@Olahraga, Olahraga7::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        olahraga8.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@Olahraga, Olahraga8::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        olahraga9.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@Olahraga, Olahraga9::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        olahraga10.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@Olahraga, Olahraga10::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        olahraga11.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@Olahraga, Olahraga11::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        olahraga12.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@Olahraga, Olahraga12::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        olahraga13.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@Olahraga, Olahraga13::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        olahraga14.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@Olahraga, Olahraga14::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        olahraga15.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@Olahraga, Olahraga15::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        olahraga16.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@Olahraga, Olahraga16::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        olahraga17.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@Olahraga, Olahraga17::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        olahraga18.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@Olahraga, Olahraga18::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        ol1.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@Olahraga, Ol1::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        ol2.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@Olahraga, Ol2::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        ol3.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@Olahraga, Ol3::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        ol4.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@Olahraga, Ol4::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        ol5.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@Olahraga, Ol5::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        ol6.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@Olahraga, Ol6::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        ol7.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@Olahraga, Ol7::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        ol8.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@Olahraga, Ol8::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

        ol9.setOnClickListener(View.OnClickListener {
            val ply = Intent(this@Olahraga, Ol9::class.java)
            Toast.makeText(
                applicationContext,
                "Sentuh layar untuk menjalankan siaran ini, pastikan anda terhubung dengan koneksi yang stabil.",
                Toast.LENGTH_LONG
            ).show()
            startActivity(ply)
        })

    }
}
