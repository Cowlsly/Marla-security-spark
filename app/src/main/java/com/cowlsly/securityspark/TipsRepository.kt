package com.cowlsly.securityspark

object TipsRepository {
    private val tips = listOf(
        SecurityTip(
            category = "Privacy",
            text = "Use a password manager and unique passwords for every important account. Reusing passwords is one of the fastest ways accounts get compromised."
        ),
        SecurityTip(
            category = "Scam Awareness",
            text = "If someone pressures you to act immediately or threatens consequences, it is almost always a scam. Legitimate organisations do not work this way."
        ),
        SecurityTip(
            category = "Android Security",
            text = "Only install apps from the Play Store or trusted sources. Sideloading increases your exposure to malware and spyware."
        ),
        SecurityTip(
            category = "Phishing",
            text = "Check the sender address carefully. Scammers often use very similar looking domains (e.g. support-g00gle.com). Hover or long-press links before tapping."
        ),
        SecurityTip(
            category = "Data Safety",
            text = "Review app permissions regularly. An app that needs access to your contacts, location or camera when it has no reason to is a red flag."
        ),
        SecurityTip(
            category = "Account Security",
            text = "Enable 2FA (preferably app-based or hardware key) on every account that supports it. SMS 2FA is better than nothing but can be SIM-swapped."
        ),
        SecurityTip(
            category = "General",
            text = "Keep your operating system and apps updated. Most serious exploits are fixed quickly once discovered — staying updated is free protection."
        )
    )

    fun getRandomTip(): SecurityTip = tips.random()
}