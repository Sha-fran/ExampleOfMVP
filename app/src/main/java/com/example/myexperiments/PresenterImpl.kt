package com.example.myexperiments

class PresenterImpl (private val view:MyView):Presenter {
    private var model = ModelImpl

    override fun addItem() {
        model.addItem()
        view.updateItems(model.getItem())
    }

    override fun setView() {
        view.updateItems(model.getItem())
    }
}
