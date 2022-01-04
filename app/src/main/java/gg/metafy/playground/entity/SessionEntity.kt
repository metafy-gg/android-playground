package gg.metafy.playground.entity

import java.util.Date

data class SessionEntity(
    val id: String,
    val scheduledAt: Date,
    val expiresAt: Date,
    val duration: Long,
    val priceCents: Int,
    val studentAvatar: String,
    val sessionName: String,
    val sessionGame: String,
    val description: String,
    val isLegacy: Boolean,
)
