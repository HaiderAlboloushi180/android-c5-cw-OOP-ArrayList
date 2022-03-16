package com.example.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // Creating the Array
    ArrayList<Student> students = new ArrayList<Student>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.studentListView);

        // Creating the students
        Student s1 = new Student("يوسف", 14, 12, R.drawable.boy1);
        Student s2 = new Student("سلمان", 13, 10, R.drawable.boy1);
        Student s3 = new Student("ماجد", 15, 11, R.drawable.boy1);
        Student s4 = new Student("جوان", 17, 12, R.drawable.girl1);

        // Adding the students
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        StudentAdapter studentAdapter = new StudentAdapter(this,0,students);


        listView.setAdapter(studentAdapter);
    }
}

