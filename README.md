# ForgeTemplate

A simple template based off of the [MDK](https://github.com/MinecraftForge/MinecraftForge/tree/1.17.x/mdk) that I use to create new projects quicker by extracting all mod-related info to `gradle.properties`.
**This does not do the work for you.** It only makes the initial Gradle setup easier and less tedious.

## Setting up
* Open up `gradle.properties` and change all the necessary properties
* Rename the main package to be the same as `mod_base_package` in the properties file, e.g. `me.sizableshrimp.examplemod`

### Using mixins?
#### NOTE: Mixin is shipped in Forge 1.17.1 as of `37.0.59`. Make sure to set this as the minimum version in the `mods.toml` if you use Mixins!
* Delete `build.gradle`
* Rename `mixinbuild.gradle` to `build.gradle`
* Rename `examplemod.mixins.json` to start with your mod id
* Add mixins under the `mixin` package inside your main package, e.g. `me.sizableshrimp.examplemod.mixin`

### Not using mixins?
* Delete `mixinbuild.gradle`
* Delete `src/main/resources/examplemod.mixins.json`
* Remove `mixin_version` from `gradle.properties`

Finally, import into your IDE of choice.