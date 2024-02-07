package com.nimetseyrek.myfirstandroidproject
import android.annotation.SuppressLint
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
        println("Merhaba Kotlin")
        var a=5
        var b= 20
        println(a*b)
        /*val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            var binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)
            // Access views using View Binding
            binding.textView.text = "Merve Akdeniz"
        }*/

   /* fun degistir(view : View) {
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Access views using View Binding
        binding.textView.text = "Merve Akdeniz"
    }*/
    }
    fun superKahramanYap(view : View){
         // Layout dosyanızdaki plain text alanının ID'si "isimText" olsun
        val isimText: EditText = findViewById(R.id.isimText)
        val yasText: EditText = findViewById(R.id.yasText)
        val meslekText: EditText = findViewById(R.id.meslekText)
        // Plain text alanının içeriğine erişmek için
        val isim = isimText.text.toString()
        val yas = yasText.text.toString().toIntOrNull()
        val meslek = meslekText.text.toString()
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if(yas==null){
            binding.textView.text = "Doğru Yaşı Giriniz!"
        }
        else{
            val superKahraman= SuperKahraman(isim,yas,meslek)
            binding.textView.text = "İsim: ${superKahraman.isim} Yaş: ${superKahraman.yas} Meslek: ${superKahraman.meslek} "
        }
    }







