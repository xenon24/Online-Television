package id.mitungone.ot

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.gms.ads.*
import kotlinx.android.synthetic.main.content_global.*

class Global : AppCompatActivity() {

    private lateinit var adsBannerGlo: AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_global)

        gloBackButton.setOnClickListener(View.OnClickListener {
            onBackPressed()
            finish()
        })

        MobileAds.initialize(this, R.string.id.toString())

        adsBannerGlo = findViewById(R.id.adsBannerGlo)
        val adRequest = AdRequest.Builder().build()
        adsBannerGlo.loadAd(adRequest)

        korea.setOnClickListener(View.OnClickListener {
            val kr = Intent(this@Global, Korea::class.java)
            startActivity(kr)
        })

        timurtengah.setOnClickListener(View.OnClickListener {
            val re = Intent(this@Global, TimurTengah::class.java)
            startActivity(re)
        })

        olahraga.setOnClickListener(View.OnClickListener {
            val ol = Intent(this@Global, Olahraga::class.java)
            startActivity(ol)
        })

    }
}
