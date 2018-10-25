package io.github.adamnain.footballclublatihan2.main

import io.github.adamnain.footballclublatihan2.model.Team

interface MainView {
    fun showLoading()
    fun hideLoading()
    fun showTeamList(data: List<Team>)
}