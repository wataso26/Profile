package app.wataso_.watanabe.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        profileImage.isVisible =false

        profileCommentText.isVisible = false

        button1.setOnClickListener {

            profileImage.isVisible = true
            profileCommentText.isVisible = true
            //konnni
        }
    }
}