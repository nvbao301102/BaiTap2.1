package com.example.baitap2

import android.app.AlertDialog
import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var edtUser : EditText
    private lateinit var edtPass : EditText
    private lateinit var btnLogin : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtUser = findViewById(R.id.edtUser)
        edtPass = findViewById(R.id.edtPass)
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener(){
            val intent = Intent(this, MainActivity2::class.java)
            val bundle = Bundle()
            bundle.putAll(bundle)
            intent.putExtra("data","${edtUser.text}")
            intent.putExtra("data2","${edtPass.text}")
            intent.putExtra("dulieu", bundle)

            if(edtUser.text.toString()=="t4tek" && edtPass.text.toString()== "tekt4")
            {
            startActivity(intent)
            }else{
                val dialog = AlertDialog.Builder(this,android.R.style.Theme_DeviceDefault_Light_Dialog)
                dialog.setMessage("Vui lòng nhập Username =t4tek và Password =tekt4 để đăng nhập thành công!")
                dialog.show()
            }
        }
    }

    override fun onPause() {
        super.onPause()
        finish()
    }

}