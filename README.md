# ForgeTemplate

A simple template based off of the [MDK](https://github.com/MinecraftForge/MinecraftForge/tree/1.16.x/mdk) that I use to create new projects quicker by extracting all mod-related info to `gradle.properties`.

### Using mixins?
* Delete `build.gradle` and rename `mixinbuild.gradle` to `build.gradle`

### Not using mixins?
* Delete `mixinbuild.gradle` and delete `src/main/resources/examplemod.mixins.json`
* Remove `mixin_version` from `gradle.properties`