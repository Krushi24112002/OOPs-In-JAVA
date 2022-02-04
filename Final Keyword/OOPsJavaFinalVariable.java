// Java Final variable
// NOTE: once the variable is declared as final then its value can not be changed.

import java.util.*;

// Creating Class
class Audi {

    // Creating Final Variable
    final int SpeedLimit = 80;

    // Crating Class Print Function
    void run() {
        SpeedLimit = 90;
    }

}

public class OOPsJavaFinalVariable {

    public static void main(String[] args) {

        Audi MyCar = new Audi();
        MyCar.run();

    }
}

// NOTE : This Programm Error Because final Variable Can not Be Chage.