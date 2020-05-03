package co.abhishek.coronavirustracking.ui.feature

import android.animation.AnimatorInflater
import android.animation.ObjectAnimator
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import co.abhishek.coronavirustracking.R
import co.abhishek.coronavirustracking.ui.feature.mainscreen.MainActivity


class SplashScreenActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val icon = findViewById<View>(R.id.imageview)
        val anim = AnimatorInflater.loadAnimator(this, R.animator.flipping) as ObjectAnimator
        anim.setTarget(icon)
        anim.setDuration(400)
        anim.start()

        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 1000)
    }
}
