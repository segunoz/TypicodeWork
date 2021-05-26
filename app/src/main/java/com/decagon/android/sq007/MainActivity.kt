package com.decagon.android.sq007

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.decagon.android.sq007.repository.Repository

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val repository = Repository()
        val viewModelFactory = MainViewModelFactory(repository)

        viewModel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)
        //viewModel.getPost()

        viewModel.getCustomPosts(2, "id", "desc")
        viewModel.myCustomPosts.observe(this, Observer{

        }
        )


//        viewModel.myResponse.observe(this, Observer {response->
//           if (response.isSuccessful){
//               Log.d("response", response.userId.toString())
//               Log.d("response", response.id.toString())
//               textView.text = response.title!!
//               Log.d("response", response.body)
//           } else {
//               Log.d("error message", "Error occured")
//           }
//
//
//        })
    }
}