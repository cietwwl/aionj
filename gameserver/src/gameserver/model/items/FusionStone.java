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
package gameserver.model.items;

import gameserver.model.gameobjects.PersistentState;
import gameserver.model.gameobjects.stats.modifiers.StatModifier;
import gameserver.model.templates.item.ItemTemplate;
import gameserver.services.ItemService;

import java.util.TreeSet;



/**
 * @author ATracer
 *
 */
public class FusionStone extends ItemStone
{
	
	private TreeSet<StatModifier> modifiers;
	
	public FusionStone(int itemObjId, int itemId, int slot, PersistentState persistentState)
	{
		super(itemObjId, itemId, slot, ItemStoneType.FUSIONSTONE, persistentState);
		
		ItemTemplate stoneTemplate = ItemService.getItemTemplate(itemId);
		if(stoneTemplate != null && stoneTemplate.getModifiers() != null)
		{
			this.modifiers = stoneTemplate.getModifiers();
		}	
	}
	
	/**
	 * @return modifiers
	 */
	public TreeSet<StatModifier> getModifiers()
	{
		return modifiers;
	}
	
	public StatModifier getFirstModifier()
	{
		return modifiers != null ? modifiers.first() : null;
	}
	
}
