package com.epam.trainings.activator;

import com.epam.trainings.SimpleBlahBlahBlahService;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

    @Override
    public void start(BundleContext bundleContext) throws Exception {
        System.out.printf("Client bundle is activated!");
        SimpleBlahBlahBlahService.sayBlahBlahBlah();
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        System.out.println("Client bundle is deactivated!");
    }
}
