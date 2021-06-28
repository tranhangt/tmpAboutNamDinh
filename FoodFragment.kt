package com.example.aboutnamdinh

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.aboutnamdinh.databinding.FragmentFoodBinding

class FoodFragment : Fragment(), OnSomeItemClickListener {
    lateinit var binding : FragmentFoodBinding
    lateinit var food_adapter:FoodAdapter
    private lateinit var foodList:ArrayList<Popular>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentFoodBinding.inflate(layoutInflater)
        foodList = getFoodDataList(resources)
        food_adapter = FoodAdapter(foodList, this)
        binding.rcvFood.adapter = food_adapter
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_food, container, false)
    }
    override fun onItemClick(item: Popular, position: Int) {
        val intent = Intent(view?.context, ItemDetailActivity::class.java)
        intent.putExtra("key_name", item.name)
        intent.putExtra("key_des", item.description)
        intent.putExtra("key_img", item.image)

        startActivity(intent)
    }
}