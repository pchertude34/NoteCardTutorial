package com.chertudep.notecardtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuestionActivity extends AppCompatActivity
{
    private Button mNextButton;
    private Button mPrevButton;
    private Button mAnswerButton;
    private TextView mQuestion;

    private int position = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        mNextButton = (Button) findViewById(R.id.next_button);
        mPrevButton = (Button) findViewById(R.id.prev_button);
        mAnswerButton = (Button) findViewById(R.id.answer_button);
        mQuestion = (TextView) findViewById(R.id.question_text);

        mQuestion.setText(Questions.QuestionList[position]);

        mNextButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                position++;
                mQuestion.setText(Questions.QuestionList[position]);
            }
        });

        mPrevButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                position--;
                mQuestion.setText(Questions.QuestionList[position]);
            }
        });

        mAnswerButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

            }
        });
    }


}
