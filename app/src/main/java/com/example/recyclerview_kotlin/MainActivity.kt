package com.example.recyclerview_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var arrayList: ArrayList<News>
    lateinit var imageId:Array<Int>
    lateinit var heading:Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView=findViewById(R.id.recyclerView_id)
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        arrayList= arrayListOf<News>()
        getUserData()
    }

    private fun getUserData() {
        imageId= arrayOf(R.drawable.news1,R.drawable.news2,R.drawable.news3,R.drawable.news4,R.drawable.news5,R.drawable.news6,R.drawable.news7,R.drawable.news1,R.drawable.news2,R.drawable.news3,R.drawable.news4,R.drawable.news5,R.drawable.news6,R.drawable.news7,R.drawable.news1,R.drawable.news2,R.drawable.news3,R.drawable.news4,R.drawable.news5,R.drawable.news6,R.drawable.news7,R.drawable.news1,R.drawable.news2,R.drawable.news3,R.drawable.news4,R.drawable.news5,R.drawable.news6,R.drawable.news7,R.drawable.news1,R.drawable.news2,R.drawable.news3,R.drawable.news4,R.drawable.news5,R.drawable.news6,R.drawable.news7)
        heading= arrayOf("This is news heading for news1","This is news heading for news2","This is news heading for news3","This is news heading for news4","This is news heading for news5","This is news heading for news6","This is news heading for news7","This is news heading for news1","This is news heading for news2","This is news heading for news3","This is news heading for news4","This is news heading for news5","This is news heading for news6","This is news heading for news7","This is news heading for news1","This is news heading for news2","This is news heading for news3","This is news heading for news4","This is news heading for news5","This is news heading for news6","This is news heading for news7","This is news heading for news1","This is news heading for news2","This is news heading for news3","This is news heading for news4","This is news heading for news5","This is news heading for news6","This is news heading for news7","This is news heading for news1","This is news heading for news2","This is news heading for news3","This is news heading for news4","This is news heading for news5","This is news heading for news6","This is news heading for news7")

        for(i in imageId.indices){
           val news=News(imageId[i],heading[i])
           arrayList.add(news)
       }
        recyclerView.adapter=MyAdapter(arrayList)
    }
}