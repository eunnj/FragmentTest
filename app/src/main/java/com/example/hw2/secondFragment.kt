package com.example.hw2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_second.*

class secondFragment : Fragment(){
    lateinit var RecyclerViewAdapter : RecyclerViewAdapter
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout. fragment_second , container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        setRecyclerview()
    }

    private fun setRecyclerview(){
        var dataList: ArrayList<People> = ArrayList()
        dataList.add(People("김자반","010-1111-1111","99.02.23"))
        dataList.add(People("생새우","010-1111-1111","08.10.24"))
        dataList.add(People("코끼리","010-1111-1111","03.09.14"))
        dataList.add(People("코알라","010-1111-1111","98.03.23"))
        dataList.add(People("홍길동","010-1111-1111","98.06.05"))
        dataList.add(People("문자바","010-1111-1111","98.05.18"))
        dataList.add(People("씨언어","010-1111-1111","00.06.26"))
        dataList.add(People("짜장면","010-1111-1111","93.03.23"))
        dataList.add(People("산딸기","010-1111-1111","94.02.31"))
        dataList.add(People("바나나","010-1111-1111","97.06.26"))
        dataList.add(People("에듀윌","010-1111-1111","99.03.03"))


        RecyclerViewAdapter= RecyclerViewAdapter(activity!!,dataList)
        recyclerview.adapter=RecyclerViewAdapter
        recyclerview.layoutManager=LinearLayoutManager(activity)
    }
}