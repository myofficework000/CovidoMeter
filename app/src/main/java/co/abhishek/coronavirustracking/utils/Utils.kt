package co.abhishek.coronavirustracking.utils

import android.content.Context
import android.content.DialogInterface
import android.view.animation.Animation
import android.view.animation.LinearInterpolator
import android.view.animation.RotateAnimation
import androidx.appcompat.app.AlertDialog
import co.abhishek.coronavirustracking.R
import java.text.DecimalFormat


class Utils {

    fun aboutAlert(context: Context, title: String, message: String) {

        val builder = AlertDialog.Builder(context)

        with(builder)
        {
            setTitle("Abhishek Pathak")
            setMessage("Hello, got any ideas?, don't hesitate to contact me \n\nabhishek336.net@gmail.com\n")
            setIcon(R.drawable.profile)
            setPositiveButton("OK") { dialog: DialogInterface, _: Int ->
                dialog.dismiss()
            }
            show()
        }

    }

    fun rotatingAnimation() : Animation {

        val rotate = RotateAnimation(0f,
            180f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f)
        rotate.duration = 500
        rotate.repeatCount = Animation.INFINITE
        rotate.interpolator = LinearInterpolator()

        return rotate
    }

    fun addCommas(number: String): String {
        val formatter = DecimalFormat("#,###,###")
        val yourFormattedString = formatter.format(number)
        return yourFormattedString
    }

}