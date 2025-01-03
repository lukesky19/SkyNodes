# SkyNodes
## Description
* This plugin allows you to configure tasks with a delay. Each task will randomly choose a node, which randomly chooses a schematic and location from a configured list to paste in.

## Features
* Supports WorldEdit and FastAsyncWorldEdit
* Restricts block breaking within a SkyNode to a configured list of blocks.
* Teleports player to safety before a SkyNode is pasted.
* Multiple schematics can be configured for one location. The plugin will pick one at random.
* Multiple tasks are supported to paste multiple SkyNodes at once.

## Dependencies
* WorldEdit or FastAsyncWorldEdit
* WorldGuard
* Multiverse-Core

## FAQ
Q: What versions does this plugin support?

A: 1.21.0, 1.21.1, 1.21.2, and 1.21.3

Q: Are there any plans to support any other versions?

A: No.

Q: Does this work on Spigot and Paper?

A: This will work on Paper, but not Spigot as I have dropped Spigot support as of version 2.0.0.

Q: Is Folia supported?

A: There is no Folia support at this time. I may look into it in the future though.

## Issues or Bugs
* Create a new GitHub Issue describing your issue.
* Please post any relevant logs containing errors related to SkyNodes and your configuration files.
* I will attempt to solve any issues to the best of my ability.

## Example Setup Instructions
* Create a new region in a world that encompases the entire playable area.
* Create a new region inside that region where you want players to be able to break blocks.
* Create a new group (/lp creategroup \<name>).
* Add that group to the 2nd region above (/rg addmember \<region name> g:\<group name>).
* Create a schematic to replace the blocks players will break. Make sure to remember the coordinates you ran //copy at.
* Open nodes.yml and configure a node based on what you have done.
* Reload the plugin (/skynodes reload)
* Give a player the group you created to be able to mine the node. (/lp user \<username> parent add \<group name>)
* Also works with temporary ranks as well. (/lp user \<username> parent addtemp \<group name> 1h accumulate)

## Building
```./gradlew build```

## Why AGPL3?
I wanted a license that will keep my code open source. I believe in open source software and in-case this project goes unmaintained by me, I want it to live on through the work of others. And I want that work to remain open source to prevent a time when a fork can never be continued (i.e., closed-sourced and abandoned).
