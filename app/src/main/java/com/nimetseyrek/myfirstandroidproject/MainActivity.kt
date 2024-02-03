package com.nimetseyrek.myfirstandroidproject
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.nimetseyrek.myfirstandroidproject.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            }
    fun degistir(view : View) {
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Access views using View Binding
        binding.textView.text = "Merve Akdeniz"
    }


}


