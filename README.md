# ForgeTemplate

A simple template based off of the [MDK](https://github.com/MinecraftForge/MinecraftForge/tree/1.19.x/mdk) that I use to create new projects quicker by extracting all mod-related info to `gradle.properties`.
**This does not do the work for you.** It only makes the initial Gradle setup easier and less tedious.

## Setting up
* Open up `gradle.properties` and change all the necessary properties
* Rename the main package to be the same as `mod_base_package` in the properties file, e.g. `com.example.examplemod`

### Using mixins?
* Delete `build.gradle`
* Rename `mixinbuild.gradle` to `build.gradle`
* Rename `examplemod.mixins.json` to start with your mod id
* Add mixins under the `mixin` package inside your main package, e.g. `com.example.examplemod.mixin`

### Not using mixins?
* Delete `mixinbuild.gradle`
* Delete `src/main/resources/examplemod.mixins.json`
* Remove `mixin_version` from `gradle.properties`

Finally, import into your IDE of choice.