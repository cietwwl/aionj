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
package chatserver.network.gameserver;

import org.jboss.netty.buffer.ChannelBuffer;

import chatserver.common.netty.BaseClientPacket;
import chatserver.network.netty.handler.GameChannelHandler;

/**
 * @author ATracer
 */
public abstract class AbstractGameClientPacket extends BaseClientPacket
{
	protected GameChannelHandler gameChannelHandler;

	/**
	 * 
	 * @param channelBuffer
	 * @param gameChannelHandler
	 * @param opCode
	 */
	public AbstractGameClientPacket(ChannelBuffer channelBuffer,
		GameChannelHandler gameChannelHandler, int opCode)
	{
		super(channelBuffer, opCode);
		this.gameChannelHandler = gameChannelHandler;
	}
}
