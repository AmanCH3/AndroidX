package com.example.andriodx.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.andriodx.R

class PinkAdapter(var nameList: ArrayList<String>, var imageList: ArrayList<Int>) : BaseAdapter() {

    override fun getCount(): Int {
//        TODO("Not yet implemented")
        return  nameList.size
    }

    override fun getItem(position: Int): Any? {
//        TODO("Not yet implemented")
        return null
    }


    override fun getItemId(position: Int): Long {
//        TODO("Not yet implemented")
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
//        TODO("Not yet implemented")
        var view : View = LayoutInflater.from(parent!!.context).inflate(R.layout.sample_grid_view_1,parent,false)
        var name : TextView = view.findViewById(R.id.textView12)
        var image : ImageView = view.findViewById(R.id.imageView3)



        name.text = nameList[position]
        image.setImageResource(imageList[position])


        return view
    }
}