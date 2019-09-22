package com.example.garbage;


import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private MyDatabaseHelper dpHelper;
    private String gar_search;
    private int flag = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tv_in = findViewById(R.id.garbage_in);
        TextView tv_recycle = findViewById(R.id.recycle_image);
        TextView tv_wet = findViewById(R.id.wet_image);
        TextView tv_harmful = findViewById(R.id.harmful_image);
        TextView tv_dry = findViewById(R.id.dry_image);
        Button bt_search = findViewById(R.id.magnifier);
        final EditText et_search = findViewById(R.id.search);
        final Intent intent_re = new Intent(MainActivity.this,RecycleActivity.class);
        final Intent intent_wet = new Intent(MainActivity.this,WetActivity.class);
        final Intent intent_harmful = new Intent(MainActivity.this,HarmfulActivity.class);
        final Intent intent_dry = new Intent(MainActivity.this,DryActivity.class);
        dpHelper = new MyDatabaseHelper(this,"GarbageBook.db",null,1);
        tv_recycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_in.setBackground(getResources().getDrawable(R.drawable.recyclein));
            }
        });
        tv_wet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_in.setBackground(getResources().getDrawable(R.drawable.wetin));
            }
        });
        tv_harmful.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_in.setBackground(getResources().getDrawable(R.drawable.harmfulin));
            }
        });
        tv_dry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_in.setBackground(getResources().getDrawable(R.drawable.dryin));
            }
        });
        SQLiteDatabase db = dpHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("recycle","塑料瓶");
        values.put("wet","米饭");
        values.put("harmful","电池");
        values.put("dry","头发");
        db.insert("Garbage",null,values);
        values.clear();
        values.put("recycle","报纸");
        values.put("wet","剩饭");
        values.put("harmful","充电电池");
        values.put("dry","餐巾纸");
        db.insert("Garbage",null,values);
        values.clear();
        values.put("recycle","纸箱");
        values.put("wet","面包");
        values.put("harmful","蓄电池");
        values.put("dry","卫生纸");
        db.insert("Garbage",null,values);
        values.clear();
        values.put("recycle","纸袋");
        values.put("wet","蛋糕");
        values.put("harmful","纽扣电池");
        values.put("dry","陶瓷");
        db.insert("Garbage",null,values);
        values.clear();
        values.put("recycle","包装纸");
        values.put("wet","饼干");
        values.put("harmful","荧光灯");
        values.put("dry","胶带");
        db.insert("Garbage",null,values);
        values.clear();
        values.put("recycle","玩具");
        values.put("wet","内脏");
        values.put("harmful","节能灯");
        values.put("dry","创可贴");
        db.insert("Garbage",null,values);
        values.clear();
        values.put("recycle","保鲜盒");
        values.put("wet","苹果核");
        values.put("harmful","卤素灯");
        values.put("dry","纸尿裤");
        db.insert("Garbage",null,values);
        values.clear();
        values.put("recycle","衣架");
        values.put("wet","蛋壳");
        values.put("harmful","药物");
        values.put("dry","笔");
        db.insert("Garbage",null,values);
        values.clear();
        values.put("recycle","油桶");
        values.put("wet","虾");
        values.put("harmful","油漆桶");
        values.put("dry","眼镜");
        db.insert("Garbage",null,values);
        values.clear();
        values.put("recycle","玻璃");
        values.put("wet","果仁");
        values.put("harmful","体温计");
        values.put("dry","橡皮泥");
        db.insert("Garbage",null,values);
        values.clear();
        values.put("recycle","刀");
        values.put("wet","蔬菜");
        values.put("harmful","消毒剂");
        values.put("dry","毛巾");
        db.insert("Garbage",null,values);
        values.clear();
        values.put("recycle","衣服");
        values.put("wet","花");
        values.put("harmful","相片底片");
        values.put("dry","气泡膜");
        db.insert("Garbage",null,values);
        values.clear();
        values.put("recycle","篮球");
        values.put("wet","虾");
                values.put("harmful","温度计");
        values.put("dry","烟头");
        db.insert("Garbage",null,values);
        values.clear();
        values.put("recycle","锅");
        values.put("wet","鱼");
        values.put("harmful","LED灯");
        values.put("dry","蚊香");
        db.insert("Garbage",null,values);
        values.clear();
        values.put("recycle","金");
        values.put("wet","薯片");
        values.put("harmful","水银");
        values.put("dry","外卖盒");
        db.insert("Garbage",null,values);
        values.clear();
        values.put("recycle","瓶盖");
        values.put("wet","菜叶");
        values.put("harmful","日光灯");
        values.put("dry","口香糖");
        db.insert("Garbage",null,values);
        values.clear();values.put("recycle","电灯");
        values.put("wet","小龙虾");
        values.put("harmful","农药瓶");
        values.put("dry","玉米叶");
        db.insert("Garbage",null,values);
        values.clear();
        values.put("recycle","啤酒瓶");
        values.put("wet","玉米");
        values.put("harmful","口服液瓶子");
        values.put("dry","开心果");
        db.insert("Garbage",null,values);
        values.clear();
        values.put("recycle","风扇");
        values.put("wet","肉");
        values.put("harmful","X光片");
        values.put("dry","湿巾");
        db.insert("Garbage",null,values);
        values.clear();
        values.put("recycle","皮鞋");
        values.put("wet","果核");
        values.put("harmful","猫砂");
        values.put("dry","胶水");
        db.insert("Garbage",null,values);
        values.clear();
        values.put("recycle","冰箱");
        values.put("wet","方便面");
        values.put("harmful","指甲油瓶");
        values.put("dry","大骨");
        db.insert("Garbage",null,values);
        values.clear();
        values.put("recycle","塑料");
        values.put("wet","瓜子");
        values.put("harmful","废药");
        values.put("dry","内裤");
        db.insert("Garbage",null,values);
        values.clear();
        values.put("recycle","酒瓶");
        values.put("wet","苹果皮");
        values.put("harmful","药片");
        values.put("dry","化妆棉");
        db.insert("Garbage",null,values);
        values.clear();
        values.put("recycle","牛奶盒");
        values.put("wet","花生");
        values.put("harmful","胶囊");
        values.put("dry","猪骨");
        db.insert("Garbage",null,values);
        values.clear();
        values.put("recycle","手套");
        values.put("wet","猪肉");
        values.put("harmful","老鼠药");
        values.put("dry","打火机");
        db.insert("Garbage",null,values);
        values.clear();
        values.put("recycle","纸张");
        values.put("wet","鱼刺");
        values.put("harmful","灯管");
        values.put("dry","指甲");
        db.insert("Garbage",null,values);
        values.clear();
        values.put("recycle","袜子");
        values.put("wet","玉米芯");
        values.put("harmful","杀虫剂");
        values.put("dry","核桃壳");
        db.insert("Garbage",null,values);
        values.clear();
        values.put("recycle","玻璃瓶");
        values.put("wet","鱼骨");
        values.put("harmful","药瓶");
        values.put("dry","快餐盒");
        db.insert("Garbage",null,values);
        values.clear();
        values.put("recycle","充电线");
        values.put("wet","鸡蛋壳");
        values.put("harmful","胶卷");
        values.put("dry","香烟");
        db.insert("Garbage",null,values);
        values.clear();
        values.put("recycle","快递盒");
        values.put("wet","龙虾壳");
        values.put("harmful","感冒药");
        values.put("dry","笔芯");
        db.insert("Garbage",null,values);
        values.clear();
        values.put("recycle","金属");
        values.put("wet","树枝");
        values.put("harmful","油漆");
        values.put("dry","坚果");
        db.insert("Garbage",null,values);
        values.clear();
        values.put("recycle","床单");
        values.put("wet","茶叶");
        values.put("harmful","眼药水");
        values.put("dry","榴莲");
        db.insert("Garbage",null,values);
        values.clear();
        values.put("recycle","香水瓶");
        values.put("wet","鱼骨头");
        values.put("harmful","led灯泡");
        values.put("dry","榴莲壳");
        db.insert("Garbage",null,values);
        values.clear();
        values.put("recycle","钥匙");
        values.put("wet","辣条");
        values.put("harmful","樟脑丸");
        values.put("dry","抹布");
        db.insert("Garbage",null,values);
        values.clear();
        values.put("recycle","银");
        values.put("wet","蚊子");
        values.put("harmful","保健品");
        values.put("dry","塑料包装");
        db.insert("Garbage",null,values);
        values.clear();
        values.put("recycle","罐头");
        values.put("wet","骨头");
        values.put("harmful","药剂");
        values.put("dry","牙签");
        db.insert("Garbage",null,values);
        values.clear();
        values.put("recycle","耳机");
        values.put("wet","葡萄皮");
        values.put("harmful","水银血压计");
        values.put("dry","锡纸");
        db.insert("Garbage",null,values);
        values.clear();
        values.put("recycle","剪刀");
        values.put("wet","排骨");
        values.put("harmful","指甲油");
        values.put("dry","玉米壳");
        db.insert("Garbage",null,values);
        values.clear();
        values.put("recycle","充电器");
        values.put("wet","果皮");
        values.put("harmful","染发剂壳");
        values.put("dry","吸管");
        db.insert("Garbage",null,values);
        values.clear();
        values.put("recycle","螺丝");
        values.put("wet","面");
        values.put("harmful","洗甲水");
        values.put("dry","碗");
        db.insert("Garbage",null,values);
        values.clear();
        values.put("recycle","鼠标");
        values.put("wet","剩菜");
        values.put("harmful","旧电池");
        values.put("dry","口红");
        db.insert("Garbage",null,values);
        values.clear();
        values.put("wet","水果");
        db.insert("Garbage",null,values);
        values.clear();
        values.put("wet","苹果");
        db.insert("Garbage",null,values);
        values.clear();
        bt_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SQLiteDatabase db = dpHelper.getWritableDatabase();
                Cursor cursor = db.query("Garbage",null,null,null,null,null,null);
                gar_search = String.valueOf(et_search.getText());
                if (cursor.moveToFirst()){
                    do{
                        if(gar_search.equals(cursor.getString(cursor.getColumnIndex("recycle")))){
                            startActivity(intent_re);
                            flag = 1;
                            break;
                        }
                        else if(gar_search.equals(cursor.getString(cursor.getColumnIndex("wet")))){
                            startActivity(intent_wet);
                            flag = 1;
                            break;
                        }
                        else if(gar_search.equals(cursor.getString(cursor.getColumnIndex("harmful")))){
                            startActivity(intent_harmful);
                            flag = 1;
                            break;
                        }
                        else if(gar_search.equals(cursor.getString(cursor.getColumnIndex("dry")))){
                            startActivity(intent_dry);
                            flag = 1;
                            break;
                        }
                    }while (cursor.moveToNext());
                } cursor.close();
                if(flag == 0) {
                    Toast.makeText(MainActivity.this,"本词条未收录",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
