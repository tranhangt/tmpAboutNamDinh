package com.example.aboutnamdinh

import android.content.res.Resources

    fun getFoodDataList(resources: Resources): ArrayList<Popular>{
        return arrayListOf(
            Popular(
                name = resources.getString(R.string.food_1),
                image = R.drawable.pho,
                description = resources.getString(R.string.des_food_1)
            ),
            Popular(
                name = resources.getString(R.string.food_2),
                image = R.drawable.banhnhan,
                description = resources.getString(R.string.des_food_2)
            ),
            Popular(
                name = resources.getString(R.string.food_3),
                image = R.drawable.nemnam,
                description = resources.getString(R.string.des_food_3)
            )

        )
    }
    fun getPersonDataList(resources: Resources) : ArrayList<Popular>{
        return arrayListOf(
            Popular(
                name = resources.getString(R.string.person_1),
                image = R.drawable.nguyenhien,
                description = resources.getString(R.string.des_person_1)
            ),
            Popular(
                name = resources.getString(R.string.person_2),
                image = R.drawable.truongchinh,
                description = resources.getString(R.string.des_person_2)
            ),
            Popular(
                name = resources.getString(R.string.person_3),
                image = R.drawable.vancao,
                description = resources.getString(R.string.des_person_3)
            )
        )
    }
    fun getPlaceDataList(resources: Resources) : ArrayList<Popular>{
        return arrayListOf(
            Popular(
                name = resources.getString(R.string.place_1),
                image = R.drawable.dentran,
                description = resources.getString(R.string.des_place_1)
            ),
            Popular(
                name = resources.getString(R.string.place_2),
                image = R.drawable.nhathodo,
                description = resources.getString(R.string.des_place_2)
            ),
            Popular(
                name = resources.getString(R.string.place_3),
                image = R.drawable.chovieng,
                description = resources.getString(R.string.des_place_3)
            )
        )
    }
