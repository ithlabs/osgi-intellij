package org.osgiusers.hello.consumer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import org.osgiusers.hello.service.HelloService;

public class Activator implements BundleActivator
{
    public void start(BundleContext bundleContext) throws Exception
    {

        System.out.println("HelloConsumer STARTED");

        ServiceReference reference = bundleContext.getServiceReference(HelloService.class.getName());
        HelloService helloService = ((HelloService) bundleContext.getService(reference));
        helloService.print("Hello OSGi World");
    }

    public void stop(BundleContext bundleContext) throws Exception
    {
        System.out.println("HelloConsumer STOPPED");

    }
}
