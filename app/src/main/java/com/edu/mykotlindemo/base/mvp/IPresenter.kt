package com.edu.mykotlindemo.base.mvp

/**
 * @package_name：com.edu.mykotlindemo.base.mvp
 * @author: lyq
 * @data: 2019/12/12 15:34
 * @description：
 */
interface IPresenter<V : IView> {

    fun attachView(view: V)

    fun detachView()

    fun isViewAttached(): Boolean

    fun getView(): V?
}