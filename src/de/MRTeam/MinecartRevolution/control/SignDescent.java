//MinecartRevolution by Hoppelmann, Nolig and TutorialMakerHD

package de.MRTeam.MinecartRevolution.control;

import org.bukkit.block.Sign;
import org.bukkit.entity.Minecart;
import de.MRTeam.MinecartRevolution.MinecartRevolution;

public class SignDescent {

    public void execute(Minecart minecart) {

        Sign sign = MinecartRevolution.blockUtil.getSignBlockSign(minecart);
        if (sign == null) {
            return;
        }

        MinecartRevolution.pathFindUtil.insertDestination(minecart, sign.getLine(2));
    }

}
