package gameserver.network.aion.serverpackets;

import gameserver.configs.main.GSConfig;
import gameserver.network.aion.AionConnection;
import gameserver.network.aion.AionServerPacket;

import java.nio.ByteBuffer;



/**
 * @author ginho1
 */
public class SM_CHARACTER_SELECT extends AionServerPacket
{
	private int type;	   // 0: new passkey input window, 1: passkey input window, 2: message window
	private int messageType; // 0: newpasskey complete, 2: passkey edit complete, 3: passkey input
	private int wrongCount;

	public SM_CHARACTER_SELECT(int type)
	{
		this.type = type;
	}

	public SM_CHARACTER_SELECT(int type, int messageType, int wrongCount)
	{
		this.type = type;
		this.messageType = messageType;
		this.wrongCount = wrongCount;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void writeImpl(AionConnection con, ByteBuffer buf)
	{
		writeC(buf, type);

		switch (type)
		{
			case 0:
				break;
			case 1:
				break;
			case 2:
				writeH(buf, messageType); // 0: newpasskey complete, 2: passkey edit complete, 3: passkey input
				writeC(buf, wrongCount > 0 ? 1 : 0); // 0: right passkey, 1: wrong passkey
				writeD(buf, wrongCount); // wrong passkey input count
				writeD(buf, GSConfig.PASSKEY_WRONG_MAXCOUNT); // Enter the number of possible wrong numbers (retail server default value: 5)
				break;
		}
	}
}