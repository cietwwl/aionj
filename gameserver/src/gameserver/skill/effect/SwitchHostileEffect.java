package gameserver.skill.effect; 
	 
import gameserver.controllers.attack.AggroInfo;
import gameserver.model.gameobjects.Creature;
import gameserver.model.gameobjects.player.Player;
import gameserver.skill.model.Effect;

import javax.xml.bind.annotation.XmlAccessType; 
import javax.xml.bind.annotation.XmlAccessorType; 
import javax.xml.bind.annotation.XmlType; 

 
 
/** 
 *  
 * @author ViAl 
 * 
 */ 
 @XmlAccessorType(XmlAccessType.FIELD) 
 @XmlType(name = "SwitchHostileEffect") 
 public class SwitchHostileEffect extends EffectTemplate { 

 @Override 
 public void applyEffect(Effect effect)  
 { 
	 Creature effected = effect.getEffected(); 
	 Creature effector = effect.getEffector(); 
	 if (((Player) effector).getSummon() != null) 
	 { 
		 int summonHate = 0;
		 int playerHate = 0;
		 for(AggroInfo al : effected.getAggroList().getList()) 
		 { 
			 if (al.getAttacker() == ((Player)effector).getSummon()) 
			 { 
				 summonHate = al.getHate(); 
			 }
			 else if (al.getAttacker() == effector)
			 { 
				 playerHate = al.getHate();
			 }
		 }
		 //switch hate
		 effected.getAggroList().stopHating(((Player)effector).getSummon());
		 effected.getAggroList().stopHating(effector);
		 effected.getAggroList().addHate(((Player)effector).getSummon(), playerHate);
		 effected.getAggroList().addHate(effector, summonHate);
		 
	 } 
 } 

} 