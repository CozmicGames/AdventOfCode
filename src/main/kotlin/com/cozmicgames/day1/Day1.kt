package com.cozmicgames.day1

import com.cozmicgames.utils.readFile
import kotlin.math.max

class Day1 {
    fun run() {
        readFile("day1.txt").use {
            val reader = it.bufferedReader()

            var currentCalories = 0
            var maxCalories = 0

            var line = reader.readLine()
            do {
                if (line.isNullOrBlank()) {
                    maxCalories = max(maxCalories, currentCalories)
                    currentCalories = 0
                } else
                    line.toIntOrNull()?.let {
                        currentCalories += it
                    }

                line = reader.readLine()
            } while (line != null)

            println(maxCalories)
        }
    }
}

fun main() {
    Day1().run()
}
