package com.example.a123.test;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Test4 extends AppCompatActivity {

    private final static String CNAME = "ClassName";

    private final static String TNAME = "TeacherName";

    private final static String INTRODUCE = "Introdece";

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test4);
        String[] Cname = {"高等数学", "离散数学", "C语言", "中国近代史"};
        String[] Tname = {"苏农", "蔡老师", "蒋玉茹", "王欣媛"};
        String[] Introduce = {"可以系统的学习高中学不到的数学知识",
                "一入离散深似海",
                "最基础的编程语言",
                "鸦片战争以后中国的历史"};
        List<Map<String, Object>> items = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < Cname.length; i++) {
            Map<String, Object> item = new HashMap<String, Object>();
            item.put(CNAME, Cname[i]);
            item.put(TNAME, Tname[i]);
            item.put(INTRODUCE, Introduce[i]);
            items.add(item);
        }
        SimpleAdapter adapter = new SimpleAdapter(this, items, R.layout.item,
                new String[]{CNAME, TNAME, INTRODUCE},
                new int[]{R.id.CLASSNAME, R.id.TEACHERNAME, R.id.INTRODUCE});
        ListView list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);
    }
}
