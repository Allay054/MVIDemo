package com.example.mvidemo.ui.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mvidemo.data.model.User
import com.example.mvidemo.databinding.ItemLayoutBinding

class MainAdapter(
    private val users: ArrayList<User>
) : RecyclerView.Adapter<MainAdapter.DataViewHolder>() {


    class DataViewHolder(binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

        private var binding: ItemLayoutBinding? = null

        init {
            this.binding = binding
        }
        fun bind(user: User) {
            binding!!.textViewUserName.text = user.name
            binding!!.textViewUserEmail.text = user.email
            Glide.with(binding!!.imageViewAvatar.context)
                .load(user.avatar)
                .into(binding!!.imageViewAvatar)
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): DataViewHolder {
        return DataViewHolder(
            ItemLayoutBinding.inflate(
                LayoutInflater.from(viewGroup.context),
                viewGroup, false
            )
        )
    }
    override fun getItemCount(): Int = users.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) =
        holder.bind(users[position])

    fun addData(list: List<User>) {
        users.addAll(list)
    }

}