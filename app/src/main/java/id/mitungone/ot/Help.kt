package id.mitungone.ot

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.content_help.*

class Help : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)

        helpBackButton.setOnClickListener(View.OnClickListener { onBackPressed() })

    }

    fun hubPengembang(v: View) {
        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "text/plain"
        intent.putExtra(Intent.EXTRA_EMAIL, arrayOf("dev.mitungone@gmail.com"))
        intent.putExtra(Intent.EXTRA_SUBJECT, "Bantuan Online Television")
        intent.putExtra(
            Intent.EXTRA_TEXT,
            "Hai pengguna setia Online Television, jelaskan keluhan anda disini agar kami bisa segera memperbaikinya:"
        )
        try {
            startActivity(Intent.createChooser(intent, "Kirim Email"))
        } catch (ex: android.content.ActivityNotFoundException) {
        }
    }

}
