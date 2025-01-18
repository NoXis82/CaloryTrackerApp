package ru.noxis.core.util

import ru.noxis.core.navigation.Route

sealed class UiEvent {
    data class Navigate(val route: Route) : UiEvent()
    data object NavigateUp : UiEvent()
}