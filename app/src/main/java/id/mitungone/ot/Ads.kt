package id.mitungone.ot

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.content_ads.*

class Ads : AppCompatActivity() {

    private lateinit var adsBannerAds: AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ads)

        MobileAds.initialize(this, R.string.id.toString())

        adsBannerAds = findViewById(R.id.adsBannerAds)
        val adRequest = AdRequest.Builder().build()
        adsBannerAds.loadAd(adRequest)

        adsBackButton.setOnClickListener(View.OnClickListener { onBackPressed() })

        helpButton.setOnClickListener(View.OnClickListener {
            val help = Intent(this@Ads, Help::class.java)
            startActivity(help)
        })

        infoButton.setOnClickListener(View.OnClickListener {
            val info = Intent(this@Ads, Info::class.java)
            startActivity(info)
        })
    }

    fun share(v: View) {
        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "text/plain"
        intent.putExtra(
            Intent.EXTRA_TEXT,
            "Yuk nonton televisi dimanapun dan kapanpun dengan online television https://play.google.com/store/apps/details?id=id.mitungone.ot"
        )
        try {
            startActivity(Intent.createChooser(intent, "Bagikan kepada"))
        } catch (ex: android.content.ActivityNotFoundException) {
        }
    }

    fun rate(v: View) {
        try {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("market://details?id=id.mitungone.ot")
                )
            )
        } catch (e: ActivityNotFoundException) {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://play.google.com/store/apps/details?id=id.mitungone.ot$packageName")
                )
            )
        }
    }

}
