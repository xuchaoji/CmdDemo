package com.xuchaoji.spigot.commanddemo;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import net.md_5.bungee.api.ChatColor;

public class CjCmd implements CommandExecutor{
	 // This method is called, when somebody uses our command
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lable, String[] args) {
		//判断sender是否为玩家，非玩家没有背包，无法给物品
		if (sender instanceof Player){
			Player player = (Player)sender;
			player.sendMessage(ChatColor.AQUA+"[CmdDemo]"+ChatColor.AQUA+sender.getName()+ChatColor.AQUA+"执行了cjcmd指令，下面发放物品。");
			//创建ItemStack，bread和diamond，ItemStack需要两个参数，第一个是材料名称，第二个是数量。
			ItemStack bread = new ItemStack(Material.BREAD,10);
			ItemStack diamond = new ItemStack(Material.DIAMOND,2);
			player.getInventory().addItem(bread, diamond);
			
		}else {
			//当非玩家执行命令时，给个错误提示。
			sender.sendMessage(ChatColor.DARK_RED+"[CmdDemo]只有玩家才能执行此命令！");
		}
		//当指令执行顺利时，返回true，否则玩家每次输入指令都会在客户端看到自己发送的指令。
		return true;
	}
	

}
