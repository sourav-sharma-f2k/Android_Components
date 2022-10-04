package com.sourav1.androidcomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
const val TAG = "CHECK: "

class LayoutActivity : AppCompatActivity() {

    lateinit var fName: EditText
    lateinit var lName: EditText
    lateinit var bDate: EditText
    lateinit var country: EditText
    lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout)

        fName = findViewById(R.id.ET1)
        lName = findViewById(R.id.ET2)
        bDate = findViewById(R.id.ET3)
        country = findViewById(R.id.ET4)
        btn = findViewById(R.id.Btn)

        btn.setOnClickListener{
            if(fName.text.isEmpty()){
                fName.error = "This field can't be empty..."
            }
            else if(lName.text.isEmpty()){
                lName.error = "This field can't be empty..."
            }
            else if(bDate.text.isEmpty()){
                bDate.error = "This field can't be empty..."
            }
            else if(country.text.isEmpty()){
                country.error = "This field can't be empty..."
            }
            else{
                val mfName = fName.text.toString()
                val mlName = lName.text.toString()
                val mDate = bDate.text.toString()
                val mCountry = country.text.toString()

                Log.d(TAG, "First Name: $mfName")
                Log.d(TAG, "Last Name: $mlName")
                Log.d(TAG, "Date: $mDate")
                Log.d(TAG, "Country: $mCountry")

//                val myInfo = PersonalInfo(mfName, mlName, mDate, mCountry)

            }
        }
    }
}