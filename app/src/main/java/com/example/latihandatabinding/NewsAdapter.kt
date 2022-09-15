package com.example.latihandatabinding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.latihandatabinding.databinding.ItemNewsBinding

class NewsAdapter (var listBerita : ArrayList<DataNews>) : RecyclerView.Adapter<NewsAdapter.ViewHolder>() {

    class ViewHolder(val binding :ItemNewsBinding ) : RecyclerView.ViewHolder(binding.root) {
        fun dataBinding(itemData : DataNews){
            binding.databerita = itemData
            binding.card.setOnClickListener{
                val bundle = Bundle()
                bundle.putSerializable("detailberita", itemData)
                Navigation.findNavController(itemView).navigate(R.id.action_newsFragment2_to_detailNewsFragment,bundle)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemNewsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.dataBinding(listBerita[position])
    }

    override fun getItemCount(): Int {
        return listBerita.size
    }
}