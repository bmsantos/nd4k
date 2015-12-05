package org.nd4j

import org.nd4j.linalg.api.ndarray.INDArray

public class Foo {
    public fun hello() = println("Hello World")
}

public fun <T> INDArray.get(i:Int, j:Int = 0):T {
    val t:T? = null;
    when (t) {
        is Float -> return getFloat(i, j) as T
        is Double -> return getDouble(i, j) as T
    }
    return getInt(i, j) as T
}

public fun INDArray.plus(a:Number): INDArray {
    return this.add(a)
}

public fun INDArray.minus(a:Number): INDArray {
    return this.sub(a)
}