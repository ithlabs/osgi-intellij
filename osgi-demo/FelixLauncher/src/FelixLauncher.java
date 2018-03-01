import org.apache.felix.framework.Felix;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;

import java.util.HashMap;
import java.util.Map;


public class FelixLauncher
{
    public static void main(String[] args)
    {
        try
        {

            //Init Apache Felix
            Map<String, String> configMap = new HashMap<String, String>();
            configMap.put(Constants.FRAMEWORK_STORAGE_CLEAN, "onFirstInit");
            Felix framework = new Felix(configMap);
            framework.init();

            //Init Bundles
            BundleContext context = framework.getBundleContext();
            Bundle helloService = context.installBundle("file:out/production/HelloService.jar");
            Bundle helloConsumer = context.installBundle("file:out/production/HelloConsumer.jar");

            //Start Felix and Install Bundles
            framework.start();
            helloService.start();
            helloConsumer.start();
            framework.stop();
        }
        catch (Exception exception)
        {
            System.exit(0);
        }
    }
}
