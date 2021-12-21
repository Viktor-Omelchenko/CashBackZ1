package ru.netology.service;

public class BonusService {

    public int calculateBonus(int amount){
        if (amount < 500){
            return 0;
        }

        int bonus = amount / 100;
        if (bonus > 100){
            return 100;
        }
        return bonus;
    }
}
