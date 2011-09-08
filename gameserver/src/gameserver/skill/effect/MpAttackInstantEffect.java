/*
 * This file is part of zetta-core <zetta-core.org>.
 *
 *  zetta-core is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  zetta-core is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with zetta-core.  If not, see <http://www.gnu.org/licenses/>.
 */
package gameserver.skill.effect;

import gameserver.skill.action.DamageType;
import gameserver.skill.model.Effect;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;




/**
 * @author Sippolo
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MpAttackInstantEffect")
public class MpAttackInstantEffect extends DamageEffect
{
	@XmlAttribute
	protected boolean		percent;
	@Override
	public void applyEffect(Effect effect)
	{
		int maxMP = effect.getEffected().getLifeStats().getMaxMp();
		int newValue = value;
		// Support for values in percentage
		if (percent)
			newValue = (int)((maxMP * value)/100);
		effect.getEffected().getLifeStats().reduceMp(newValue);
	}
	
	@Override
	public void calculate(Effect effect)
	{
		super.calculate(effect, DamageType.MAGICAL, false);
	}
}
