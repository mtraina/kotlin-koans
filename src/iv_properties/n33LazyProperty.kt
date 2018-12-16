package iv_properties

import util.TODO

class LazyProperty(val initializer: () -> Int) {
    var init: Boolean = false
    var _lazy: Int = 0


    val lazy: Int
        get() = lazyValue()

    fun lazyValue(): Int {
        if(!init){
            _lazy = initializer.invoke()
            init = true
        }
        return _lazy
    }

}

fun todoTask33(): Nothing = TODO(
    """
        Task 33.
        Add a custom getter to make the 'lazy' val really lazy.
        It should be initialized by the invocation of 'initializer()'
        at the moment of the first access.
        You can add as many additional properties as you need.
        Do not use delegated properties yet!
    """,
    references = { LazyProperty({ 42 }).lazy }
)
