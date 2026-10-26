Help AI - Fabric test mod for Minecraft 26.1.2  (adds /help ai -> READY TO HELP ALWAYS)

Layout mirrors your autoclicker reference:
  fabric.mod.json, assets/help-ai/{icon.png,lang/en_us.json}, entrypoint class.

NOT compiled yet. Build it (pick one):
  A) GitHub (no install): create a repo, upload this folder, open Actions > build,
     download the "help-ai-jar" artifact -> help-ai-1.0.0.jar
  B) Local: install JDK 25 + Gradle 9.4+, then in this folder run:  gradle build
     -> build/libs/help-ai-1.0.0.jar

Install: copy help-ai-1.0.0.jar + Fabric API 0.155.0+26.1.2 into .minecraft/mods
(Fabric Loader 0.19.3+). Test in a world: /help ai
