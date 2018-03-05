package org.osgiusers.hello.service;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;


public class Activator implements BundleActivator
{
    public void start(BundleContext bundleContext) throws Exception
    {

        System.out.println("HelloService STARTED");
        bundleContext.registerService(HelloService.class.getName(), new HelloServiceImpl(), null);
    }

    public void stop(BundleContext bundleContext) throws Exception
    {
        System.out.println("HelloService STOPPED");

    }
}
