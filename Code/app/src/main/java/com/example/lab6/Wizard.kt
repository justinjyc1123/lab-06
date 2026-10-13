package com.example.lab6
/**
 * Represents a wizard who casts spells using mana.
 *
 * @property name the name of the wizard
 * @property mana the current mana available
 * @property spellPower the base power used to calculate spell damage
 */
class Wizard (
    val name: String,
    var  mana: Int,
    var spellPower: Int
){
    /**
     * Casts a spell and returns the damage dealt.
     *
     * Explosion costs 10 mana and deals 3 times spellPower damage.
     * Frostbite costs 5 mana and deals 2 times spellPower damage.
     * Failed spells do not consume mana.
     *
     * @param spell the name of the spell to cast
     * @return the damage dealt, or 0 for insufficient mana or an invalid spell
     */
    fun castSpell(spell: String): Int
    {
        when(spell){
            "Explosion"->{
                if(mana >=10){
                    mana-=10
                    return spellPower*3
                }else{
                    return 0
                }
            }
            "Frostbite" ->{
                if(mana>=5){
                    mana-=5
                    return  spellPower *2
                }else{
                    return 0
                }
        }
            else -> {
            return 0
            }
        }

    }
}