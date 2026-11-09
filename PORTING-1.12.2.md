# Forge 1.12.2 port status

This branch is the start of the Forge 1.12.2 migration from the 1.20.1 Forge source. The build targets Minecraft 1.12.2 / Forge 14.23.5.2860, uses Java 8, and includes a minimal client-only Forge mod entry point.

## Important: renderer not yet ported

This is not a working Radiance renderer port yet. The current Minecraft integration, mixins, and bundled `core.dll` / `libcore.so` were built for newer Minecraft/Forge APIs and are deliberately excluded from this initial build. The current JAR is only a loader scaffold; it does not initialize Vulkan or render the world with Radiance.

## Porting sequence

1. Establish a clean Forge 1.12.2 + Java 8 build and launch test.
2. Reimplement the client lifecycle and rendering integration using 1.12.2/Forge hooks (including compatibility with the 1.12.2 OpenGL rendering path).
3. Port or replace mixins/access transformers against 1.12.2 mappings and its Mixin bootstrap.
4. Define a compatible JNI boundary and build matching MCVR native binaries; do not reuse newer-version binaries without validation.
5. Add rendering features incrementally and test on Windows and Linux with supported GPUs.

Build using JDK 8 and `./gradlew setupDecompWorkspace build` (Windows: `gradlew.bat`). This initial milestone has not been validated in a local Forge runtime in this environment.
