package com.nepxion.aquarius.common.property;

/**
 * <p>Title: Nepxion Aquarius</p>
 * <p>Description: Nepxion Aquarius</p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @email 1394997@qq.com
 * @version 1.0
 */

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nepxion.aquarius.common.constant.AquariusConstant;

public class AquariusPropertiesManager {
    private static final Logger LOG = LoggerFactory.getLogger(AquariusPropertiesManager.class);

    static {
        System.out.println("");
        System.out.println("╔═══╗");
        System.out.println("║╔═╗║");
        System.out.println("║║ ║╠══╦╗╔╦══╦═╦╦╗╔╦══╗");
        System.out.println("║╚═╝║╔╗║║║║╔╗║╔╬╣║║║══╣");
        System.out.println("║╔═╗║╚╝║╚╝║╔╗║║║║╚╝╠══║");
        System.out.println("╚╝─╚╩═╗╠══╩╝╚╩╝╚╩══╩══╝");
        System.out.println("      ║║");
        System.out.println("      ╚╝");
        System.out.println("Nepxion Aquarius  v1.0.0.RELEASE");
        System.out.println("");
    }

    private static AquariusProperties properties;

    static {
        initializeProperties();
    }

    private static void initializeProperties() {
        try {
            LOG.info("Start to read {}...", AquariusConstant.CONFIG_FILE);

            AquariusContent content = new AquariusContent(AquariusConstant.CONFIG_FILE);

            properties = new AquariusProperties(content.getContent());
        } catch (IOException e) {
            LOG.error("Read {} failed", AquariusConstant.CONFIG_FILE, e);
        }
    }

    public static AquariusProperties getProperties() {
        return properties;
    }
}