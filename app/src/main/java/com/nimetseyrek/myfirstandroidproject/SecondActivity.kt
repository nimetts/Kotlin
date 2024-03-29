package com.nimetseyrek.myfirstandroidproject

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.nimetseyrek.myfirstandroidproject.ui.theme.MyFirstAndroidProjectTheme

class SecondActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ikinci)

        val intent = intent
        val alinanVeri = intent.getStringExtra("yollananVeri") // Anahtar "yollanan veri" olarak değiştirildi

        val textView: TextView = findViewById(R.id.textView)
        textView.text = alinanVeri ?: "Veri bulunamadı" // Eğer alinanVeri null ise "Veri bulunamadı" metnini göster
    }
   

}