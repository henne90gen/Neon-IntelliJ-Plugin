package de.henne90gen

import com.intellij.lang.Language

class NeonLanguage private constructor() : Language("Neon") {
    companion object {
        val INSTANCE: NeonLanguage = NeonLanguage()
    }
}
