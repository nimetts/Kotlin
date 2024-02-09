package com.nimetseyrek.myfirstandroidproject
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import com.nimetseyrek.myfirstandroidproject.databinding.ActivityMainBinding


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun aktiviteDegistir(view: View){
    val intent= Intent(applicationContext,SecondActivity::class.java)
        val kullaniciVerisi: EditText = findViewById(R.id.editText)
        val veri = kullaniciVerisi.text.toString()
        intent.putExtra("yollananVeri", veri)
        startActivity(intent)
}
    }







