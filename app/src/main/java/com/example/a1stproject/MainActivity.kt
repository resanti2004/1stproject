package com.example.a1stproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.a1stproject.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        with(binding) {
//            btnTest1.setOnClickListener{
//                Toast.makeText(this@MainActivity, "Hallo Teman Teman", Toast.LENGTH_SHORT).show()
//            }
//        }

        with(binding  ){
            btnTest1.setOnClickListener{
                //Mengambil teks dari EditText untuk username
                val username = username.text.toString()
                //Memeriksa apakah bidang username tidak kosong
                if (username.isNotEmpty()) {
                    //Membuat pesan dengan nama pengguna yang berhasil login
                    val message = "Hallo, $username berhasil login!"
                    //Menampilkan pesan Toast dengan pesan yang telah dibuat
                    Toast.makeText(this@MainActivity, message, Toast.LENGTH_LONG).show()
                } else {
                    //Jika bidang username kosong, tampilkan pesan Toast bahwa username belum diisi
                    Toast.makeText(this@MainActivity, "Username belum diisi", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}