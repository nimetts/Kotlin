package com.nimetseyrek.myfirstandroidproject
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity



class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
fun firstFragment(view: View){

   val FragmentManager= supportFragmentManager
    val FragmentTransaction = FragmentManager.beginTransaction()
    val firstFragment= BlankFragment()
    FragmentTransaction.replace(R.id.frameLayout,firstFragment).commit
}
    fun secondFragment(view: View){

        val FragmentManager= supportFragmentManager
        val FragmentTransaction = FragmentManager.beginTransaction()
        val secondFragment= BlankFragment()
        FragmentTransaction.replace(R.id.frameLayout,secondFragment).commit
    }
}





