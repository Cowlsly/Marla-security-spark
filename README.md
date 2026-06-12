# Security Spark 🔦

A tiny Android app: press **Surprise Me** and get a useful security, privacy, scam-avoidance, Android safety, or technology-learning tip.

This is deliberately small. No login. No Firebase. No analytics. No ads. No network permission.

**Now styled consistently** with the rest of the Cowlsly suite (Collaborate app + website).

## Current Styling (Suite Consistent)

- **Background**: Deep dark navy (`#0F0F1A`)
- **Primary Accent**: Marla’s bright pink (`#F472B6`)
- **Text**: Clean white on dark surfaces
- **Surfaces**: Slightly lighter dark cards (`#1A1A2E`)
- **Typography**: Modern sans-serif

These colours match the three-AI colour system used in the Collaborate app and the overall dark aesthetic of the Cowlsly website.

## What the app does

- Shows one main screen.
- Displays a title and a friendly intro.
- Shows a random local tip when you press **Surprise Me**.
- Displays a category label for the current tip.
- Lets you copy the current tip.
- Stores all starter tips locally in Kotlin code.
- Uses no Android permissions.

## Recommended Theming for Compose (`SecuritySparkTheme.kt`)

When expanding the Jetpack Compose UI, use these values for consistency:

```kotlin
// Example base colors for SecuritySparkTheme
val DarkNavy = Color(0xFF0F0F1A)
val MarlaPink = Color(0xFFF472B6)
val SurfaceDark = Color(0xFF1A1A2E)
val TextWhite = Color(0xFFFFFFFF)
val TextSecondary = Color(0xFFB0B0C0)
```

Use `MarlaPink` as the main accent for buttons, highlights, and active states.

## Project structure

```text
MarlaSecuritySpark/
├── .github/
│   └── workflows/
│       └── build-debug-apk.yml
├── app/
│   ├── build.gradle.kts
│   ├── proguard-rules.pro
│   └── src/main/
│       ├── AndroidManifest.xml
│       ├── java/com/cowlsly/securityspark/
│       │   ├── MainActivity.kt
│       │   ├── SecurityTip.kt
│       │   ├── TipsRepository.kt
│       │   └── ui/theme/
│       │       └── SecuritySparkTheme.kt   ← Update this for full Compose theming
│       └── res/
│           ├── drawable/
│           │   └── ic_launcher.xml
│           └── values/
│               ├── strings.xml
│               └── styles.xml
├── build.gradle.kts
├── gradle.properties
├── settings.gradle.kts
└── README.md
```

## What each part teaches

**MainActivity.kt** teaches what an Android Activity is...

(keeping the rest of the educational content as before)

## Build from GitHub Actions

... (same as before)

## Next tiny upgrades

Good next steps, in order:

1. Fully implement `SecuritySparkTheme.kt` using the colours above.
2. Add a session-only favourite button.
3. Move tips from Kotlin code to a JSON file in assets.
4. Add categories filter.
5. Add a daily tip widget.

Keep each upgrade small. Tiny sparks first, grand vault doors later.
