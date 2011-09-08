/*
 * This file is part of aion-unique <aion-unique.org>.
 *
 *  aion-unique is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  aion-unique is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with aion-unique.  If not, see <http://www.gnu.org/licenses/>.
 */
package gameserver.dao;

import gameserver.model.gameobjects.player.Player;

import commons.database.dao.DAO;


/**
 * @author Mr. Poke
 * 
 */
public abstract class PlayerLifeStatsDAO implements DAO
{
	/**
	 * Returns unique identifier for PlayerLifeStatsDAO
	 * 
	 * @return unique identifier for PlayerLifeStatsDAO
	 */
	@Override
	public final String getClassName()
	{
		return PlayerLifeStatsDAO.class.getName();
	}

	/**
	 * 
	 * @param player
	 */
	public abstract void loadPlayerLifeStat(Player player);

	/**
	 * 
	 * @param player
	 */
	public abstract void insertPlayerLifeStat(Player player);
	
	/**
	 * 
	 * @param player
	 */
	public abstract void updatePlayerLifeStat(Player player);

	/**
	 * 
	 * @param player
	 */
	public abstract void deletePlayerLifeStat(int playerId);
}
