package com.edu.mykotlindemo.application

import android.app.Application
import android.content.Context

/**
 * @package_name：com.edu.mykotlindemo.application
 * @author: lyq
 * @data: 2019/12/12 15:07
 * @description：
 */
class MyApplication : Application() {
    /**
     * companion object 修饰为伴生对象,伴生对象在类中只能存在一个，类似于java中的静态方法 Java 中使用类访问静态成员，静态方法。
     */
    companion object {
        private lateinit var context: Context

        private lateinit var instance: MyApplication

        fun getContext(): Context {
            return context.applicationContext
        }

        fun getInstance(): MyApplication {
            return instance
        }
    }

    override fun onCreate() {
        super.onCreate()
        context = this
        instance = this
    }
}