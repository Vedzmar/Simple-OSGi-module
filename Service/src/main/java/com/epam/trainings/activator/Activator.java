package com.epam.trainings.activator;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

    @Override
    public void start(BundleContext bundleContext) throws Exception {
        System.out.println("Client bundle is activated!");
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        System.out.println("Client bundle is deactivated!");
    }
}
