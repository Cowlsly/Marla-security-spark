# Cowlsly Audio Assets

This document defines the standardized audio system across the entire Cowlsly suite (website + Android apps) for consistency.

## Core Sound Files (from Focused_Audio_Fix_C)

| Sound Name                        | Filename                              | Purpose                              | Recommended Volume | Used In                  |
|-----------------------------------|---------------------------------------|--------------------------------------|--------------------|--------------------------|
| Primary Button Tap                | `btn_tap_primary.ogg`                 | Main UI tap/click feedback           | 0.75 – 0.85        | All projects             |
| Success / Positive                | `sfx_success.ogg`                     | Rewards, confirmations, positive     | 0.80 – 0.90        | All projects             |
| Background Music                  | `bg_website_identity.ogg`             | Subtle ambient / identity loop       | 0.25 – 0.40        | All projects             |
| Error / Alert                     | `alert_glass_break_alert_clean.ogg`   | Errors, warnings, cancellations      | 0.70 – 0.80        | All projects             |

## File Locations

### Website (cowlsly-web)
- Path: `assets/audio/`
- Loaded via Howler.js

### Android Apps
- Path: `app/src/main/res/raw/`
- Referenced via `R.raw.` in Kotlin

## Usage in Marla Security Spark

A lightweight `AudioManager` has been created in `audio/AudioManager.kt`.
It currently supports button tap and success sounds. Expand as the app grows.

## Future Expansion

Additional sounds should follow the same naming and quality standards from the Focused_Audio_Fix_C pack for brand consistency.

Last updated: June 2026