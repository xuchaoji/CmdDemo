package com.xuchaoji.spigot.commanddemo;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

import net.md_5.bungee.api.ChatColor;

public class ListenerDemo implements Listener {
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		//获取玩家ID并发送欢迎消息
		Player player = event.getPlayer();
		String playerName = player.getName().toString();
		player.sendMessage(ChatColor.AQUA+playerName+"欢迎加入服务器。");
		//获取玩家手持物品，并向全服务器广播
		ItemStack item = player.getInventory().getItemInMainHand();
		//ItemStack传入参数包含Material类型和数量，下面获取material的类型
		String itemName = item.getType().name();
		//向服务器发送公告
		Bukkit.broadcastMessage(ChatColor.AQUA+playerName+"手持"+itemName+"来到了这个世界！");
	}
}
