/*
 * This file is part of aion-unique <aionunique.smfnew.com>.
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
package gameserver.network.aion.serverpackets;

import gameserver.network.aion.AionConnection;
import gameserver.network.aion.AionServerPacket;

import java.nio.ByteBuffer;




/**
 * 
 * @author orz, Sarynth
 * 
 */
public class SM_SELL_ITEM extends AionServerPacket
{

	private int	targetObjectId;
	private int sellPercentage;
	
	public SM_SELL_ITEM(int targetObjectId, int sellPercentage)
	{
		
		this.sellPercentage = sellPercentage;
		this.targetObjectId = targetObjectId;
	
	}

	/**
	* {@inheritDoc}
	*/
	
	@Override
	protected void writeImpl(AionConnection con, ByteBuffer buf)
	{		

		writeD(buf, targetObjectId);
		writeD(buf, sellPercentage); // Buy Price * (sellPercentage / 100) = Display price.
	
	}	
}
