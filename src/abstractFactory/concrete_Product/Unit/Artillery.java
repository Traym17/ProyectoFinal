package abstractFactory.concrete_Product.Unit;


import abstractFactory.abstract_Product.Unit;

public class Artillery implements Unit {
    private int unitCode;
    private static final String unitType = "Artillería";
    private int unitAttack;
    private int unitDefense;
    private int unitHP;

    /********************** Seccion para hacer SET del codigo ******************************/

    public void setUnitCode(int code) {
        this.unitCode = 200000 + code;
    }

    public void setUnitAttack(int attack) {
        this.unitAttack = attack;
    }

    public void setUnitDefense(int defense) {
        this.unitDefense = defense;
    }

    public void setUnitHP(int unitHP) {
        this.unitHP = unitHP;
    }

    /********************** Seccion para hacer GET del codigo ******************************/

    public int getCode() {
        return unitCode;
    }

    public static String getUnitType() {
        return unitType;
    }

    public int getAttack() {
        return unitAttack;
    }

    public int getDefense() {
        return unitDefense;
    }

    public int getHP() {
        return unitHP;
    }


    /*Sección para implementer las funcionalidades de la Interfaz*/
    @Override
    public String unitCode() {
       return "El código es: " + getCode();
    }

    @Override
    public int generateUnitCode() {
        return (int) (Math.random() * 9999);
    }

    @Override
    public String unitAttack() {
        return "El ataque es: " + getAttack();
    }

    @Override
    public int generateUnitAttack() {
        return 2;
    }


    @Override
    public String unitDefense() {
        return "La defensa es: " + getDefense();
    }

    @Override
    public int generateUnitDefense() {
        return 4;
    }

    @Override
    public String unitHP() {
        return "El movimiento es: " + getHP();
    }

    @Override
    public int generateUnitHP() {
        return 4;
    }

    @Override
    public String getUnitInformation() {
        return "La únidad de tipo: " + getUnitType() + ", se le asigno el código: " + getCode()+
                ", tiene un valor de ataque de: " + getAttack()+ ", un valor de defensa de: " + getDefense()+
                ", y un movimiento total de: " + getHP();
    }
}
