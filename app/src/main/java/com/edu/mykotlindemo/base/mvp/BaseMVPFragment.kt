package com.edu.mykotlindemo.base.mvp

import com.edu.mykotlindemo.base.BaseFragment

/**
 * @package_name：com.edu.mykotlindemo.base.mvp
 * @author: lyq
 * @data: 2019/12/12 15:36
 * @description：
 */
abstract class BaseMVPFragment<in V : IView, P : IPresenter<in V>> : BaseFragment(), IView {

    protected lateinit var presenter: P

    override fun initData() {
        presenter = createPresenter()
        presenter.attachView(this as V)
    }

    abstract fun createPresenter(): P


}