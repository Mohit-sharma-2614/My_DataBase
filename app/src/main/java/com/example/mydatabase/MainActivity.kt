package com.example.mydatabase

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mydatabase.Data.DBHandler
import com.example.mydatabase.Data.StudentTable
import com.example.mydatabase.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var dbHandler = DBHandler() // Initialize DBHandler instance
        var db = dbHandler.getDB(this) // Call getDB using the instance

        binding.SubmitBtn.setOnClickListener{
            val name = binding.NameEt.text.toString()
            db.studentDao.insertStudent(StudentTable(name))
        }
    }
}