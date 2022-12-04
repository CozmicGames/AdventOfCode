package com.cozmicgames.utils

import java.io.InputStream

fun readFile(name: String): InputStream {
    return try {
        requireNotNull({}.javaClass.getResourceAsStream(if (name.startsWith("/")) name else "/$name"))
    } catch (e: Exception) {
        error("File not found: $name")
    }
}
