package org.nd4j

import org.nd4j.linalg.api.ndarray.INDArray

fun <T> INDArray.get(i:Int, j:Int = 0):T {
    val t:T? = null;
    when (t) {
        is Float -> return getFloat(i, j) as T
        is Double -> return getDouble(i, j) as T
    }
    return getInt(i, j) as T
}

fun INDArray.plus(a:Number):INDArray {
    return this.add(a)
}

fun INDArray.minus(a:Number):INDArray {
    return this.sub(a)
}