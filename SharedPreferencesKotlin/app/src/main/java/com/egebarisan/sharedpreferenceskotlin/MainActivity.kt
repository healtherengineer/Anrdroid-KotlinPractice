package com.egebarisan.sharedpreferenceskotlin

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val file_path = "data_holder"
    val key_email  = "email"
    val key_phone  = "phone"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var emailText = findViewById<EditText>(R.id.email)
        var phoneText = findViewById<EditText>(R.id.phone)
        var deleteBtn = findViewById<Button>(R.id.delete)
        var saveBtn = findViewById<Button>(R.id.save)

        var data_holder = getSharedPreferences(file_path , Context.MODE_PRIVATE)
        // only this app can reach our data
        var editor = data_holder.edit()

        Toast.makeText(applicationContext ,

            "Email : ${data_holder.getString("key_email" , data_holder.getString("email", null))}"+
        "Phone : ${data_holder.getString("key_phone" ,data_holder.getString("phone", null))}",
            Toast.LENGTH_LONG).show()

        saveBtn.setOnClickListener(){

            editor.putString(key_email, emailText.text.toString())
            editor.putString(key_phone,phoneText.text.toString())
            editor.commit()// you can use apply().
            Toast.makeText(applicationContext, "Successfull Register",
            Toast.LENGTH_LONG).show()

        }
        deleteBtn.setOnClickListener(){

            editor
                .remove(key_email)
                .remove(key_phone)
                .commit()

            Toast.makeText(applicationContext , "Deletion is Okay ! " , Toast.LENGTH_LONG).show()
        }


    }
}