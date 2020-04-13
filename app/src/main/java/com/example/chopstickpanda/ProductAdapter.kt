package com.example.chopstickpanda

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.product_item.view.*

class ProductAdapter(val productList: ArrayList<Product>) : RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val textViewName = itemView.findViewById(R.id.textViewName) as TextView
        val textViewPrice = itemView.findViewById(R.id.textViewPrice) as TextView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.product_item, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product : Product = productList[position]
        holder.textViewName.text = product.name
        holder.textViewPrice.text = product.price
    }
}