package org.nd4j

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.nd4j.linalg.cpu.NDArray
import org.nd4j.linalg.factory.Nd4j

class OperatableNDArrayTest {

    private val shape3x3 = intArrayOf(3, 3)

    private val float1x4 = floatArrayOf(1f, 2f, 3f, 4f)
    private val float3x3 = (1..9).map { it * 1.0f }.toArrayList().toFloatArray()
    private val double3x3 = (1..9).map { it * 1.0 }.toArrayList().toDoubleArray()

    @Test
    public fun shouldGetIntByIndex() {
        // Given
        val nd = Nd4j.create(float1x4)

        // When
        val int: Int = nd.get(0, 2)
        assertThat(int).isEqualTo(nd.getInt(0, 2))
    }

    @Test
    public fun shouldGetFloatByIndex() {
        // Given
        val nd = Nd4j.create(float1x4)

        // When
        val int: Float = nd.get(0, 2)
        assertThat(int).isEqualTo(nd.getFloat(0, 2))
    }

    @Test
    public fun shouldGetDoubleByIndex() {
        // Given
        val nd = Nd4j.create(float1x4)

        // When
        val int: Double = nd.get(0, 2)
        assertThat(int).isEqualTo(nd.getDouble(0, 2))
    }

    @Test
    public fun shouldGetIntByIndexInShapedArray() {
        // Given
        val nd: NDArray = Nd4j.create(float3x3, shape3x3) as NDArray

        // When
        val int: Int = nd.get(1, 1)

        // Then
        assertThat(int).isEqualTo(nd.getInt(1, 1));
    }

    @Test
    public fun shouldGetFloatByIndexInShapedArray() {
        // Given
        val nd = Nd4j.create(double3x3, shape3x3)

        // When
        val float: Float = nd.get(2, 2)

        // Then
        assertThat(float).isEqualTo(nd.getFloat(2, 2));
    }

    @Test
    public fun shouldGetDoubleByIndexInShapedArray() {
        // Given
        val nd = Nd4j.create(float3x3, shape3x3)

        // When
        val double: Double = nd.get(2, 0)

        // Then
        assertThat(double).isEqualTo(nd.getDouble(2, 0));
    }
}