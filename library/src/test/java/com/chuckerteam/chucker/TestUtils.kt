package com.chuckerteam.chucker

import java.io.File
import okio.Buffer
import okio.Okio
import okio.buffer

fun getResourceFile(file: String): Buffer {
    return Buffer().apply {
        writeAll(Okio.source(File("./src/test/resources/$file")).buffer())
    }
}
