/*
 *
 *  * Copyright 2021 Spikey Sanju
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *     https://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 *
 */

package dev.spikeysanju.einsen.ui.theme.color

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

class AppColors(
    primary: Color,
    text: Color,
    card: Color,
    background: Color,
    info: Color,
    warning: Color,
    success: Color,
    error: Color,
    isLight: Boolean
) {

    var primary by mutableStateOf(primary)
        private set

    var text by mutableStateOf(text)
        private set

    var card by mutableStateOf(card)
        private set

    var background by mutableStateOf(background)
        private set

    var information by mutableStateOf(info)
        private set

    var warning by mutableStateOf(warning)
        private set

    var success by mutableStateOf(success)
        private set

    var error by mutableStateOf(error)
        private set

    var isLight by mutableStateOf(isLight)
        private set

    fun copy(
        primary: Color = this.primary,
        text: Color = this.text,
        card: Color = this.card,
        background: Color = this.background,
        info: Color = this.information,
        warning: Color = this.warning,
        success: Color = this.success,
        error: Color = this.error,
        isLight: Boolean = this.isLight
    ): AppColors = AppColors(
        primary, text, card, background, info, warning, success, error, isLight
    )

    fun updateColorsFrom(other: AppColors) {
        primary = other.primary
        text = other.text
        card = other.card
        background = other.background
        information = other.information
        warning = other.warning
        success = other.success
        error = other.error
        isLight = other.isLight
    }
}

// light mode color themes
private val lightPrimaryColor = Color(0xFF066EF7)
private val lightTextColor = Color(0xFF000000)
private val lightCardColor = Color(0xFFFFFFFF)
private val lightBackgroundColor = Color(0xFFF6F9FF)

// state color for light theme
private val lightErrorColor = Color(0xFFEB5757)
private val lightWarningColor = Color(0xFFFFA93B)
private val lightSuccessColor = Color(0xFF6FCF97)
private val lightInformationColor = Color(0xFF006AF6)

// dark mode color themes
private val darkPrimaryColor = Color(0xFF066EF7)
private val darkTextColor = Color(0xFF000000)
private val darkCardColor = Color(0xFFFFFFFF)
private val darkBackgroundColor = Color(0xFFF6F9FF)

// state color for dark theme
private val darkErrorColor = Color(0xFFEB5757)
private val darkWarningColor = Color(0xFFFFA93B)
private val darkSuccessColor = Color(0xFF6FCF97)
private val darkInformationColor = Color(0xFF006AF6)

fun lightColors(
    primary: Color = lightPrimaryColor,
    text: Color = lightTextColor,
    card: Color = lightCardColor,
    background: Color = lightBackgroundColor,
    info: Color = lightInformationColor,
    warning: Color = lightWarningColor,
    success: Color = lightSuccessColor,
    error: Color = lightErrorColor
): AppColors = AppColors(
    primary = primary,
    text = text,
    card = card,
    background = background,
    info = info,
    warning = warning,
    success = success,
    error = error,
    isLight = true
)

fun darkColors(
    primary: Color = darkPrimaryColor,
    text: Color = darkTextColor,
    card: Color = darkCardColor,
    background: Color = darkBackgroundColor,
    info: Color = darkInformationColor,
    warning: Color = darkWarningColor,
    success: Color = darkSuccessColor,
    error: Color = darkErrorColor
): AppColors = AppColors(
    primary = primary,
    text = text,
    card = card,
    background = background,
    info = info,
    warning = warning,
    success = success,
    error = error,
    isLight = false
)

val LocalColors = staticCompositionLocalOf { lightColors() }
