package org.example.yy.maven.shade;

import cn.hutool.core.util.RandomUtil;

public class Hello {
    public void say() {
        int[] randomInt = RandomUtil.randomInts(5);
        System.out.printf("hello, random:" + randomInt);
    }

    // mvn-shade-plugin-1.0-SNAPSHOT.jar                   肥包
    // mvn-shade-plugin-1.0-SNAPSHOT-sources.jar           肥包源码
    // original-mvn-shade-plugin-1.0-SNAPSHOT.jar          原始小包

}
