# Apache Texen példa

Ez a repository megmutatja, hogyan lehet Apache Texennel statikus tartalmat generálni, Velocity template-ek használatával.

A `jtechlog-texen-simple` projekt egy egyszerű példát tartalmaz. Bár a Texen ant task kerül felhasználásra, azt Mavenből hívjuk.

A `jtechlog-mytexentask` egy saját Texen task implementálását mutatja be. Ezt először le kell buildelni, és installálni az
`mvn install` parancs kiadásával, majd a `jtechlog-mytexentask-ex` projekt mutatja be annak használatát.