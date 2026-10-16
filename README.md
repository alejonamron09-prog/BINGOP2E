# BINGOP2E Android Starter (prototype)

This is an Android Studio project wrapper for the existing BINGOP2E HTML demo. It is source code, **not a built APK**. No real-money entry, deposits, withdrawals, cash prizes, account system, online multiplayer, ads, or server validation are implemented.

## Build an APK
1. Install Android Studio on a computer and allow it to install a compatible Android SDK.
2. Open this folder (`BINGOP2E_Android_Starter`) in Android Studio.
3. Let Gradle sync and install any requested SDK components.
4. Select **Build > Build Bundle(s) / APK(s) > Build APK(s)**.
5. For a test install, find the APK in `app/build/outputs/apk/debug/` after a successful build.

## Before publishing
- Replace the demo package ID `com.bingop2e.mobile` with a unique ID you control.
- Add app icon, privacy policy, support contact, content rating, and Play Console declarations.
- Add secure backend and anti-cheat before any online competition.
- Do not add sponsor-funded cash prizes, cash-out, deposits, paid entries, or prize-linked chance features until a Philippine gaming lawyer/regulator confirms the required approvals and Google Play eligibility in writing.

## Current prototype limitations
- Local/demo gameplay only; no cloud save or cross-device accounts.
- Demo coins have no monetary value.
- WebView loads a bundled local HTML file; internet permission is not requested.

## Build from an Android phone using GitHub Actions
This project includes `.github/workflows/build-apk.yml` so you can build in GitHub's cloud runner without installing Android Studio on your phone.

1. In your phone browser, sign in to GitHub and create a **new private repository** named `BINGOP2E`.
2. Upload the contents of this project folder to the repository root. Make sure `.github/workflows/build-apk.yml` is included. If GitHub's mobile upload page hides dot-folders, use the browser's **Desktop site** option or upload the ZIP using a repository file manager that preserves the folder structure.
3. Open the repository's **Actions** tab. If prompted, enable Actions for the repository.
4. Choose **Build BINGOP2E APK** on the left and tap **Run workflow**. You can also push to the `main` branch to trigger a build.
5. Wait for the workflow to finish with a green check. Open that run and scroll to **Artifacts**.
6. Download `BINGOP2E-debug-APK`, extract the downloaded ZIP, and locate `app-debug.apk`.
7. Tap the APK to install. Android may ask you to allow installation from that browser or file manager; enable it only for the app you trust, then turn it off again afterward.

Notes:
- The generated debug APK is for testing, not a Play Store release.
- GitHub Actions usage limits and account settings can change; check the current GitHub plan limits before relying on repeated builds.
- Do not upload passwords, signing keys, API keys, or personal data into the repository.
