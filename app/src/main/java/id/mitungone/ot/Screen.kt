package id.mitungone.ot

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_screen.*

class Screen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen)

        val anim = AnimationUtils.loadAnimation(this, R.anim.mytransition)
        tvScreen1.startAnimation(anim)
        tvScreen2.startAnimation(anim)
        imgScreen.startAnimation(anim)
        val i = Intent(this, MainActivity::class.java)
        val timer = object : Thread() {
            override fun run() {
                try {
                    Thread.sleep(3000)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                } finally {
                    startActivity(i)
                    finish()
                }
            }
        }
        timer.start()
    }
}
