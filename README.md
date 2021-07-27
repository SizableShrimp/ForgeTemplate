# ForgeTemplate

A simple template based off of the [MDK](https://github.com/MinecraftForge/MinecraftForge/tree/1.16.x/mdk) that I use to create new projects quicker by extracting all mod-related info to `gradle.properties`.
**This does not do the work for you.** It only makes the initial Gradle setup easier and less tedious.

## Setting up
* Open up `gradle.properties` and change all the necessary properties
* Rename the main package to be the same as the mod's base package and then mod id, e.g. `me.sizableshrimp.examplemod`

### Using mixins?
#### NOTE: Mixin is currently not shipped in Forge 1.17.
* Delete `build.gradle`
* Rename `mixinbuild.gradle` to `build.gradle`
* Rename `examplemod.mixins.json` to start with your mod id
* Add mixins under the `mixin` package inside your main package, e.g. `me.sizableshrimp.examplemod.mixin`

### Not using mixins?
* Delete `mixinbuild.gradle`
* Delete `src/main/resources/examplemod.mixins.json`
* Remove `mixin_version` from `gradle.properties`

Finally, import into your IDE of choice.