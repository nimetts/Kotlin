package com.nimetseyrek.myfirstandroidproject
import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
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
        sinifCalismasi()
            }
   /* fun degistir(view : View) {
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Access views using View Binding
        binding.textView.text = "Merve Akdeniz"
    }*/


fun sinifCalismasi(){
    var superman = SuperKahraman("superman",20,"Gazeteci")
    var binding2=ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding2.root)
    // Access views using View Binding
    binding2.textView.text = "Yaş: ${superman.yas}"

}
}


