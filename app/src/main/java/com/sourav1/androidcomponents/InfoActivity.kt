package com.sourav1.androidcomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.*

class InfoActivity : AppCompatActivity() {

    private lateinit var userNameTv: TextView
    private lateinit var userAgeTv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        val user = intent.extras?.get("USER_INFO") as User

        userNameTv = findViewById(R.id.userNameInfo)
        userAgeTv = findViewById(R.id.userAgeInfo)

        userNameTv.append(user.name)
        userAgeTv.append(user.age.toString())
    }
}