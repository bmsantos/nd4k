package org.nd4j

import org.nd4j.linalg.api.ndarray.INDArray

fun INDArray.get<T>(vararg i:Int):T {
    val j:T? = null;
    when (j) {
        is Float -> return getFloat(i[0], if (i.size > 1) i[1] else 0) as T
        is Double -> return getDouble(i[0], if (i.size > 1) i[1] else 0) as T
    }
    return getInt(i[0], if (i.size > 1) i[1] else 0) as T
}

fun INDArray.plus(a:Number):INDArray {
    return this.add(a)
}

fun INDArray.minus(a:Number):INDArray {
    return this.sub(a)
}