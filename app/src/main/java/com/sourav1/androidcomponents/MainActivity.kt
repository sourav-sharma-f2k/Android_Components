package com.sourav1.androidcomponents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import java.io.Serializable

class MainActivity : AppCompatActivity() {
    private lateinit var btn: Button
    private lateinit var nameEt: EditText
    private lateinit var ageEt: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.submitBtn)
        nameEt = findViewById(R.id.userName)
        ageEt = findViewById(R.id.userAge)

        btn.setOnClickListener{
            val userName: String
            val userAge: Int

            if(nameEt.text.isEmpty()){
                nameEt.error = "This field can't be empty.."
            }
            else if(ageEt.text.isEmpty()){
                ageEt.error = "This field can't be empty.."
            }
            else{
                userName = nameEt.text.toString()
                userAge = ageEt.text.toString().toInt()
                val user = User(userName, userAge)

                val intent = Intent(this, InfoActivity::class.java)
                intent.putExtra("USER_INFO", user as Serializable)
                startActivity(intent)
                nameEt.text.clear()
                ageEt.text.clear()
            }
        }
    }
}