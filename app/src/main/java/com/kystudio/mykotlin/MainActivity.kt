package com.kystudio.mykotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var userName:String = ""
    private var userPwd:String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 获取焦点
        userNameText.requestFocus()

        // 登录
        loginBtn.setOnClickListener {
            //textView.text = "Heloo,Kotlin!!!"
            userName = userNameText.text.toString()
            userPwd = passwordText.text.toString()
            if (userName.equals("kylin")  && userPwd.equals("012308")) {
                showToast("账户名为 " + userName + " 密码为 " + userPwd)
                showToast("登录成功！！！")
            }else{
                showToast("登录失败！！！")
            }
        }

        // 重置账户名密码
        resetBtn.setOnClickListener {
            userNameText.setText("")
            passwordText.setText("")
            userNameText.hint="账户名"
            passwordText.hint="密码"
            userNameText.requestFocus()
        }
    }

    /**
     * 显示反馈信息
     */
    fun showToast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}
