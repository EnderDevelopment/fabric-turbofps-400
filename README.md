# Fabric TurboFPS 400 Minecraft Mod

Fabric TurboFPS 400 is a client-side Minecraft Fabric mod for Minecraft Java Edition 26.3 that applies a lightweight FPS optimization profile at client startup. It is a Minecraft performance mod that reduces rendering workload by lowering view distances, disabling selected visual effects, minimizing particles, disabling VSync, and setting the frame rate limit to 400 FPS.

## Install

1. Install Minecraft Java Edition 26.3.
2. Install Fabric Loader 0.18.4 or newer for Minecraft 26.3.
3. Install the Fabric API version that supports Minecraft 26.3.
4. Build the project with Java 25:

   ```text
   ./gradlew build
   ```

   On Windows, run:

   ```text
   gradlew.bat build
   ```

5. Copy the generated `fps-boost-263-1.0.0.jar` from `build/libs` into the Minecraft `mods` folder.
6. Start Minecraft using the Fabric 26.3 profile.

## Use

1. Launch Minecraft with Fabric and the installed Fabric API.
2. When the client starts, the mod applies its performance profile automatically.
3. The profile sets the following options:

   - Render distance: 8 chunks
   - Simulation distance: 5 chunks
   - Frame rate limit: 400 FPS
   - Graphics: Fast
   - Clouds: Off
   - Entity shadows: Off
   - View bobbing: Off
   - Biome blend radius: 0
   - Particles: Minimal
   - VSync: Off

4. Change the settings later from Minecraft's Video Settings menu if needed.
5. Restarting the client applies the performance profile again and saves the settings to Minecraft's normal options file.

A 400+ FPS result is not guaranteed. Actual performance depends on the CPU, GPU, memory allocation, resolution, drivers, background applications, world complexity, and other installed mods.

The mod is client-side only. It does not add blocks, items, entities, world content, shaders, or server-side features.

---

More Minecraft mod projects by EnderDevelopment: https://github.com/EnderDevelopment

Project page: https://dash.enderdevelopment.com/community/f6d8d413-7d13-4ee6-9757-858f2c40e3eb?utm_source=github&utm_medium=readme&utm_campaign=auto_publish&utm_content=f6d8d413-7d13-4ee6-9757-858f2c40e3eb
