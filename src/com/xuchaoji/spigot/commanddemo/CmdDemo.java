package com.xuchaoji.spigot.commanddemo;

import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class CmdDemo extends JavaPlugin {
	//加载插件执行
	@Override
	public void onEnable() {
		getServer().getConsoleSender().sendMessage(ChatColor.AQUA+"[CmdDemo]已加载");
		this.getCommand("cjcmd").setExecutor(new CjCmd());
		getServer().getConsoleSender().sendMessage(ChatColor.AQUA+"[CmdDemo]cjcmd命令注册成功！");
	}
	//停用插件执行
	@Override
	public void onDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.RED+"[CmdDemo]已停用");
	}
}
