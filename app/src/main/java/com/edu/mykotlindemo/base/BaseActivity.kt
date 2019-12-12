package com.edu.mykotlindemo.base.mvp

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * @package_name：com.edu.mykotlindemo.base.mvp
 * @author: lyq
 * @data: 2019/12/12 15:18
 * @description：activity基类
 */
abstract class BaseActivity : AppCompatActivity() {
    protected lateinit var mContext: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutResId())
        mContext = this
        initView()
        initData()
    }

    /**
     * abstract
     * 必须被重写	只能在抽象类使用：抽象成员不能实现
     * @return Int
     */
    abstract fun getLayoutResId(): Int

    abstract fun initView()
    /**
     *    open	可以被重写	需要显式标明
     */
    open fun initData() {}

    override fun onDestroy() {
        super.onDestroy()
    }
}