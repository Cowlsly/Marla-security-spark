Marla Security Spark

Short plain-English description:
A simple, lightweight Android app featuring a prominent button that delivers useful internet security tips and occasional random cybersecurity facts. Designed to make security awareness fun, quick, and always available. Part of the Cowlsly privacy-first, wellbeing-focused ecosystem. Built with Kotlin for Android.

What the repo currently contains:
- Standard Android project structure (app/ dir, build.gradle.kts, settings.gradle.kts, AndroidManifest.xml)
- ROADMAP.md and TODO.md with phased development plan (core tips, categories, UI polish, notifications, favorites, integration)
- README.md with additional details
- AUDIO_ASSETS.md (likely for future voice or sound-enhanced tips)
- MarlaSecuritySpark_v2.zip (possible source backup or generated artifact)
- .github/workflows/main.yml (CI build workflow)
- Basic resources (strings.xml, styles.xml, ic_launcher)
- .gitignore and LICENSE

Current version/build details:
- Version: Not confirmed yet (no versionCode/versionName visible in quick inspection of build files)
- Language/Framework: Kotlin, Android (likely Jetpack Compose or View-based — confirm in app/ source)
- Build system: Gradle
- CI: GitHub Actions workflow present (main.yml)
- Default branch: main
- Last updated: Recent (June 2026 activity in ecosystem)

How to build, test, run, or deploy it:
Phone-friendly for Shane/Cowy on Samsung Galaxy Fold (no computer needed):
1. Use GitHub mobile app to browse or edit files.
2. Make any small changes and push to main branch.
3. GitHub Actions (main.yml) will automatically build the debug APK.
4. Go to Actions tab → latest run → download APK artifact.
5. Install/sideload on your Fold (enable unknown sources in settings).
6. Launch the app and tap the main button for tips/facts.
Local development: Would normally use Android Studio, but the CI workflow is the intended phone-first path. The zip file may contain a standalone version if needed.

Where important files live:
- app/ (main source code — check for MainActivity or Compose screens)
- AndroidManifest.xml (permissions, app identity)
- .github/workflows/main.yml (build automation)
- ROADMAP.md and TODO.md (plan and checklist)
- README.md (more details)
- AUDIO_ASSETS.md (future audio plans)

Current features:
- Core button that provides security tips and random facts (per ROADMAP current status)
- Basic app structure in place
- Potential for categories, favorites, notifications, theming (planned)

Known limitations:
- Version details and exact current UI implementation not fully inspected in this pass (small repo, zip present)
- Many features are in planning phases (expand tip database, UI polish, notifications)
- Zip file presence suggests possible generated or backup source — verify which files are active

Security/privacy notes:
- Lightweight, no heavy permissions expected (confirm in manifest)
- Tips focus on internet security, phishing, passwords, privacy — aligns with Cowlsly security awareness
- No invasive features; keep defensive and user-controlled
- AUDIO_ASSETS.md suggests future non-intrusive audio enhancements

Deployment notes if relevant:
- CI workflow builds APK on push — ideal for phone testing
- Future: signed releases, Play Store listing, or integration with Cowlsly Hub/Account Centre

Changelog/current repo status:
Basic structure and core button functionality exist. ROADMAP and TODO define clear phases for expansion. 2026-06-15: Created missing README.txt to provide plain-English phone-friendly guide and complete the doc set. This makes the repo self-explaining and easier to maintain from a Fold. Updated TODO with completion log.

Last checked date: 2026-06-15

---
Shane/Cowy phone note: This is a perfect lightweight app for quick security tips. The CI workflow means you can improve it entirely from your Galaxy Fold. The new README.txt gives you everything you need at a glance. Next small task from TODO could be expanding the tip database once you're ready. Grok keeping it simple and useful.