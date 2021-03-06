package abstractFactory.concrete_Factory.Unit;

import abstractFactory.abstract_Factory.Army_Unit;
import abstractFactory.abstract_Product.Unit;
import abstractFactory.concrete_Product.Unit.*;

public class Factory_Artillery implements Army_Unit {

    @Override
    public Unit createUnit() {
        Artillery newUnit =  new Artillery();
        newUnit.setUnitCode(newUnit.generateUnitCode());
        newUnit.setUnitAttack(newUnit.generateUnitAttack());
        newUnit.setUnitDefense(newUnit.generateUnitDefense());
        newUnit.setUnitHP(newUnit.generateUnitHP());

        return newUnit;
    }
}
