package com.edu.mykotlindemo.base

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

/**
 * @package_name：com.edu.mykotlindemo.base
 * @author: lyq
 * @data: 2019/12/12 15:36
 * @description：fragment基类
 */
abstract class BaseFragment : Fragment() {

    protected lateinit var mContext: Context

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

    override fun onAttach(activity: Activity) {
        super.onAttach(activity)
        mContext = activity
    }

    final override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(getLayoutResId(), container, false)
        initView(rootView, savedInstanceState)
        initData()
        return rootView

    }

    abstract fun initView(rootView: View?, savedInstanceState: Bundle?)

    abstract fun initData()

    abstract fun getLayoutResId(): Int


}