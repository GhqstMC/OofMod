package us.nickfraction.oofmod.commands;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import us.nickfraction.oofmod.OofMod;

public class OpenMenuCommand extends CommandBase {

    private OofMod mod;

    public OpenMenuCommand(OofMod mod) {
        this.mod = mod;
    }

    @Override
    public String getCommandName() {
        return "oofmod";
    }

    @Override
    public String getCommandUsage(ICommandSender p_71518_1_) {
        return "/" + getCommandName();
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) {
        mod.openMenu();
    }

    public boolean canCommandSenderUseCommand(ICommandSender p_71519_1_)
    {
        return true;
    }

}
