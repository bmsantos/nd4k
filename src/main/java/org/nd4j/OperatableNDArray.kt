package org.nd4j

import org.nd4j.linalg.api.ndarray.INDArray

fun INDArray.get<T>(i:Int, j:Int = 0):T {
    val t:T? = null;
    when (t) {
        is Float -> return getFloat(i, j) as T
        is Double -> return getDouble(i, j) as T
    }
    return getInt(i, j) as T
}

fun INDArray.get<T>(vararg i:Int):Int {
    return getInt(i[0], if (i.size > 1) i[1] else 0)
}

fun INDArray.plus(a:Number):INDArray {
    return this.add(a)
}

fun INDArray.minus(a:Number):INDArray {
    return this.sub(a)
}