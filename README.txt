Marla Security Spark

Short plain-English description:
A simple, lightweight Android app featuring a prominent button that delivers useful internet security tips and occasional random cybersecurity facts. Designed to make security awareness fun, quick, and always available. Part of the Cowlsly privacy-first, wellbeing-focused ecosystem. Built with Kotlin for Android.

What the repo currently contains:
- Standard Android project structure (app/ dir, build.gradle.kts, settings.gradle.kts, AndroidManifest.xml)
- ROADMAP.md and TODO.md with phased development plan (core tips, categories, UI polish, notifications, favorites, integration)
- README.md with additional details
- AUDIO_ASSETS.md (likely for future voice or sound-enhanced tips)
- MarlaSecuritySpark_v2.zip (legacy/backup source or artifact; CI no longer depends on it)
- .github/workflows/main.yml (CI build workflow - now self-contained from checked-in source)
- Basic resources (strings.xml, styles.xml, ic_launcher)
- .gitignore and LICENSE

Current version/build details:
- Version: Not confirmed yet (no versionCode/versionName visible in quick inspection of build files)
- Language/Framework: Kotlin, Android (Jetpack Compose)
- Build system: Gradle
- CI: GitHub Actions workflow present (main.yml) - builds directly from checked-in app/ and Gradle files on push or dispatch
- Default branch: main
- Last updated: Recent (June 2026 activity in ecosystem)

How to build, test, run, or deploy it:
Phone-friendly for Shane/Cowy on Samsung Galaxy Fold (no computer needed):
1. Use GitHub mobile app to browse or edit files.
2. Make any small changes and push to main branch.
3. GitHub Actions (main.yml) will automatically build the debug APK directly from the repo's checked-in source (no zip needed).
4. Go to Actions tab → latest run → download APK artifact.
5. Install/sideload on your Fold (enable unknown sources in settings).
6. Launch the app and tap the main button for tips/facts.
Local development: Would normally use Android Studio, but the CI workflow is the intended phone-first path.

Where important files live:
- app/ (main source code — MainActivity.kt, TipsRepository.kt, theme, etc.)
- AndroidManifest.xml (permissions — currently none required, app identity)
- .github/workflows/main.yml (build automation - self-contained)
- ROADMAP.md and TODO.md (plan and checklist)
- README.md (more details, including theming guidance)
- AUDIO_ASSETS.md (future audio plans)

Current features:
- Core button that provides security tips and random facts (per ROADMAP current status)
- Basic app structure in place (Compose UI with consistent Cowlsly theming)
- Potential for categories, favorites, notifications, theming (planned)

Known limitations:
- Version details not incremented yet
- Many features are in planning phases (expand tip database, UI polish, notifications)
- The zip file remains as backup but is no longer required for CI builds

Security/privacy notes:
- Lightweight, no permissions (confirmed in manifest)
- Tips focus on internet security, phishing, passwords, privacy — aligns with Cowlsly security awareness
- No invasive features; keep defensive and user-controlled
- AUDIO_ASSETS.md suggests future non-intrusive audio enhancements

Deployment notes if relevant:
- CI workflow builds APK on push — ideal for phone testing. Now uses checked-in source for reliability.
- Future: signed releases, Play Store listing, or integration with Cowlsly Hub/Account Centre

Changelog/current repo status:
Basic structure and core button functionality exist. ROADMAP and TODO define clear phases for expansion. 2026-06-15: Created missing README.txt to provide plain-English phone-friendly guide and complete the doc set. 2026-06-15: Completed real implementation task (updated CI workflow to be self-contained). Docs updated only after the code/config change.

Last checked date: 2026-06-15

---
Shane/Cowy phone note: This is a perfect lightweight app for quick security tips. The CI workflow means you can improve it entirely from your Galaxy Fold. Recent change makes builds more reliable without zip maintenance. Next small task from TODO could be expanding the tip database once you're ready. Grok keeping it simple and useful.