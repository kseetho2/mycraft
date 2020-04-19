package net.shadowfacts.forgelin
import net.minecraft.item.Item
import net.minecraft.item.Items
import net.minecraft.util.ResourceLocation
import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.event.RegistryEvent
import net.minecraftforge.fml.common.Mod
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

const val MODID = "whatever_mod"
const val NAME = "Whatever Mod"
const val VERSION = "0.1"

val logger: Logger = LogManager.getLogger(MODID)

@Mod("mymod")
object EventHandler{
    fun registerItems(event: RegistryEvent<Item>) {

    }

}
























