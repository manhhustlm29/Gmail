package com.example.baitap2

import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.baitap2.R

class EmailAdapter(private val emailList: List<MyEmail>) : RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_email, parent, false)
        return EmailViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        val email = emailList[position]
        holder.sender.text = email.sender
        holder.subject.text = email.subject
        holder.preview.text = email.preview

        // Thiết lập chữ cái đầu tiên vào ô tròn
        val firstLetter = email.sender.firstOrNull()?.uppercaseChar() ?: '?' // Biến thể nếu không có tên
        holder.initials.text = firstLetter.toString()
    }

    override fun getItemCount(): Int {
        return emailList.size
    }

    class EmailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val sender: TextView = itemView.findViewById(R.id.text_sender)
        val subject: TextView = itemView.findViewById(R.id.text_subject)
        val preview: TextView = itemView.findViewById(R.id.text_preview)
        val initials: TextView = itemView.findViewById(R.id.initials) // Thêm dòng này
    }

}
