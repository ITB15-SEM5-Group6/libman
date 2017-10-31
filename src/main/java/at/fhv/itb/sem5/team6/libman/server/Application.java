package at.fhv.itb.sem5.team6.libman.server;

import at.fhv.itb.sem5.team6.libman.interfaces.IMediaSearchFactory;
import at.fhv.itb.sem5.team6.libman.server.RMI.MediaSearchFactoryImpl;
import at.fhv.itb.sem5.team6.libman.server.RMI.RMIServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.rmi.RmiServiceExporter;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	IMediaSearchFactory getSearchServiceFactory(){
		return new MediaSearchFactoryImpl();
	}

	@Bean
	RmiServiceExporter exporter(IMediaSearchFactory implementation){
		Class<IMediaSearchFactory> serviceInterface = IMediaSearchFactory.class;
		RmiServiceExporter exporter = new RmiServiceExporter();
		exporter.setServiceInterface(serviceInterface);
		exporter.setService(implementation);
		exporter.setServiceName("MediaSearchFactory");
		exporter.setRegistryPort(1099);
		return exporter;
	}
}
