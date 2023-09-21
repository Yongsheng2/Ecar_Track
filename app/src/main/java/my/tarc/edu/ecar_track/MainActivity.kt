package my.tarc.edu.ecar_track

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import my.tarc.edu.ecar_track.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigationView.setOnClickListener{
                menuItem ->
            when (menuItem.id) {
                R.id.Home -> {
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse("content://home_page.kt"))
                    startActivity(intent)
                }
                else -> false
            }
        }
    }
}