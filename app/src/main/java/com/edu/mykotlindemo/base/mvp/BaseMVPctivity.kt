package com.edu.mykotlindemo.base.mvp

/**
 * @package_name：com.edu.mykotlindemo.base.mvp
 * @author: lyq
 * @data: 2019/12/12 15:19
 * @description：mvp模式基类
 */
abstract class BaseMVPActivity<in V : IView, P : IPresenter<in V>> : BaseActivity(), IView {

    protected lateinit var presenter: P

    override fun initData() {
        super.initData()
        presenter = createPresenter()
        presenter.attachView(this as V)
    }

    abstract fun createPresenter(): P


}