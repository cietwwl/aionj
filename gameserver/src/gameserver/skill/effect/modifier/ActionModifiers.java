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
package gameserver.skill.effect.modifier;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;

/**
 * @author ATracer
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionModifiers")
public class ActionModifiers {

    @XmlElements({
        @XmlElement(name = "frontdamage", type = FrontDamageModifier.class),
        @XmlElement(name = "backdamage", type = BackDamageModifier.class),
        @XmlElement(name = "flyingdamage", type = FlyingDamageModifier.class),
        @XmlElement(name = "nonflyingdamage", type = NonFlyingDamageModifier.class),
        @XmlElement(name = "targetrace", type = TargetRaceDamageModifier.class),
        @XmlElement(name = "abnormaldamage", type = AbnormalDamageModifier.class)
    })
    protected List<ActionModifier> actionModifiers;
    /**
     * Gets the value of the actionModifiers property.
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StumbleDamageModifier }
     * {@link FrontDamageModifier }
     * {@link BackDamageModifier }
     * {@link StunDamageModifier }
     * {@link PoisonDamageModifier }
     * {@link TargetRaceDamageModifier }
     * 
     */
    public List<ActionModifier> getActionModifiers() {
        if (actionModifiers == null) {
            actionModifiers = new ArrayList<ActionModifier>();
        }
        return this.actionModifiers;
    }
}
