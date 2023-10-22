package com.example.myquiz

object Constants {
    const val USER_NAME:String="user_name"
    const val TOTAL_QUESTIONS:String="total_questions"
    const val CORRECT_ANSWERS:String="correct_answers"


    fun getQuestions():ArrayList<questions>{
        val questionsList = ArrayList<questions>()
        val que1 = questions(
            1,
            "what country does this flag belong ?",
            R.drawable.canada,
            "U.S.A",
            "Denmark",
            "Canada",
        "Mexico",
        3
        )
        questionsList.add(que1)

        val que2 = questions(
            2,
            "what country does this flag belong ?",
            R.drawable.cookislands__1_,
            "Cook Islands",
            "france",
            "Australia",
            "New-Zealand",
            1
        )
        questionsList.add(que2)

        val que3 = questions(
            3,
            "what country does this flag belong?",
            R.drawable.egypt,
            "Jordan",
            "Kuwait",
            "Oman",
            "Egypt",
            4
        )
        questionsList.add(que3)

        val que4 = questions(
            4,
            "what country does this flag belong ?",
            R.drawable.england,
            "Canada",
            "Australia",
            "Ireland",
            "England",
            4
        )
        questionsList.add(que4)

        val que5 = questions(
            5,
            "what country does this flag belong ?",
            R.drawable.finland,
            "Norway",
            "Cuba",
            "South Africa",
            "Finland",
            4
        )
        questionsList.add(que5)

        val que6 = questions(
            6,
            "what country does this flag belong ?",
            R.drawable.france,
            "Havana",
            "France",
            "Greece",
            "Finland",
            2
        )
        questionsList.add(que6)

        val que7 = questions(
            7,
            "what country does this flag belong ?",
            R.drawable.germany,
            "Poland",
            "Belarus",
            "Germany",
            "Russia",
            3
        )
        questionsList.add(que7)

        val que8 = questions(
            8,
            "what country does this flag belong ?",
            R.drawable.hongkong,
            "China",
            "Taiwan",
            "Kiribati",
            "Hong Kong",
            4
        )
        questionsList.add(que8)

        val que9 = questions(
            9,
            "what country does this flag belong ?",
            R.drawable.india,
            "India",
            "Myanmar",
            "Iran",
            "Singapore",
            1
        )
        questionsList.add(que9)

        val que10 = questions(
            10,
            "what country does this flag belong ?",
            R.drawable.laos,
            "Vietnam",
            "Laos",
            "Combodia",
            "Taiwan",
            2
        )
        questionsList.add(que10)

        return questionsList













    }




}