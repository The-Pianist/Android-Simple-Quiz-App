package com.example.quizapp


import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_quiz_qactivity.*

class QuizQActivity() : AppCompatActivity(),View.OnClickListener {

    private var mCurrentPosition: Int = 1
    private var mQList: ArrayList<Question>? = null
    private var moptionPosition: Int = 0

    constructor(parcel: Parcel) : this() {
        mCurrentPosition = parcel.readInt()
        moptionPosition = parcel.readInt()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_qactivity)

        option1.setOnClickListener(this)
        option2.setOnClickListener(this)
        option3.setOnClickListener(this)
        option4.setOnClickListener(this)
        option5.setOnClickListener(this)
        mQList = Constants.getQuestion()
        setQ()
    }

    private fun setQ() {
        mCurrentPosition = 1
        val qu = mQList!![mCurrentPosition - 1]

        defaultOptionView()

        progressbar.progress = mCurrentPosition
        progress.text = "$mCurrentPosition" + "/" + progressbar.max

        tv_Question.text = qu.question
        option1.text = qu.Answer1
        option2.text = qu.Answer2
        option3.text = qu.Answer3
        option4.text = qu.Answer4
        option5.text = qu.Answer5
    }
    private fun defaultOptionView() {
        val options = ArrayList<TextView>()
        options.add(1, option1)
        options.add(2, option2)
        options.add(3, option3)
        options.add(4, option4)
        options.add(5, option5)

        for(option in options){
            option.setTextColor(Color.parseColor("#FF000000"))
            option.typeface= Typeface.DEFAULT
            option.background=ContextCompat.getDrawable(
                this,
                R.drawable.default_option_border_bg)
        }
    }

    override fun onClick(v:View?){

        when(v?.id){
            R.id.option1->{ optionselected(option1,1) }
            R.id.option2->{optionselected(option2,2)}
            R.id.option3->{optionselected(option3,3)}
            R.id.option4->{optionselected(option4,4)}
            R.id.option5->{optionselected(option5,5)}
        }
    }

    private fun optionselected(tv:TextView,selecedOptionPosition:Int){
        defaultOptionView()

        moptionPosition=selecedOptionPosition
        tv.background=ContextCompat.getDrawable(this,R.drawable.selected_option_order_bg)
    }



}