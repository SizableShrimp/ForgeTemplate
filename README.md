# ForgeTemplate

A simple template based off of the [MDK](https://github.com/MinecraftForge/MinecraftForge/tree/1.16.x/mdk) that I use to create new projects quicker by extracting all mod-related info to `gradle.properties`.

## Setting up
* Open up `gradle.properties` and change all the necessary properties
* Rename the main package to be the same as `${mod_base_package}.${mod_id}`, e.g. `me.sizableshrimp.examplemod`

### Using mixins?
* Delete `build.gradle`
* Rename `mixinbuild.gradle` to `build.gradle`
* Rename `examplemod.mixins.json` to start with your mod id
* Add mixins under the `mixin` package inside your base package, e.g. `me.sizableshrimp.examplemod.mixin`

### Not using mixins?
* Delete `mixinbuild.gradle`
* Delete `src/main/resources/examplemod.mixins.json`
* Remove `mixin_version` from `gradle.properties`

Finally, import into your IDE of choice.