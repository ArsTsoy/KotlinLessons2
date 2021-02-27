package classes

class Car (
        var age: Int,
        var power: Int
        ) {

    private var model: String? = null

    fun getModel(): String {
        return model ?: "NOT DEFINED"
    }

    fun setModel(model: String) {
        this.model = model
    }

}