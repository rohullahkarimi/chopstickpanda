package com.example.chopstickpanda.ui.home

import android.app.DownloadManager
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.example.chopstickpanda.Product
import com.example.chopstickpanda.ProductAdapter
import com.example.chopstickpanda.R
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {


    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)

        //val textView: TextView = root.findViewById(R.id.testView)  // case 1: it was home text that removed from
        // -- template

        //--- Add products to ravintola page which is fragment_home
        val recyclerView = root.findViewById(R.id.recyclerView) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(requireActivity(), RecyclerView.VERTICAL, false)

        val products = ArrayList<Product>()

        // this should change to restaurant mySQL data
        for (i in 1..3){
            products.add(Product("Pizza 1", "ok"))
            products.add(Product("Pizza 2", "ok"))
            products.add(Product("Pizza 3", "ok"))
            products.add(Product("Pizza 4", "ok"))
        }
        val adapter = ProductAdapter(products)
        recyclerView.adapter = adapter
        //----end of ravintola page

        homeViewModel.text.observe(this, Observer {
            //textView.text = it   // depends on case1
        })
        return root
    }
}


















// use it when layout is completed
/*
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.fragment_home)

    // Instantiate the RequestQueue
    val queue = Volley.newRequestQueue(this)
    // URL to JSON data - remember use your own data here
    val url = "https://extra.foodon.fi/json/android_employees.json"
    // Create request and listeners
    val jsonObjectRequest = JsonObjectRequest(
        Request.Method.GET, url, null,
        Response.Listener { response ->
            // Get employees from JSON
            val employees = response.getJSONArray("employees")
            Log.d("JSON",employees.toString())
        },
        Response.ErrorListener { error ->
            Log.d("JSON",error.toString())
        }
    )
    // Add the request to the RequestQueue.
    queue.add(jsonObjectRequest)
}

 */