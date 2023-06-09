package JavaThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class RequestProcessor {
	
	private ExecutorService threadPool;
	private ThreadGroup databaseThreadGroup;
	private ThreadGroup reportThreadGroup;
	
	public RequestProcessor() {
		//create a threadpool with 10 threads
		threadPool= Executors.newFixedThreadPool(10, new ThreadFactory() {
			@Override
			public Thread newThread(Runnable r) {
				// TODO Auto-generated method stub
//				return null;
				return new Thread(r);
			}
		});
		
		//create thread groups for database and report
		databaseThreadGroup = new ThreadGroup("Database Threads");
		reportThreadGroup = new ThreadGroup("Report Threads");
	}
	
//	public void processRequest(Request request) {
//		Runnable task= new Runnable() {
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				if(request.getType()== RequestType.DATABASE_QUERY) {
//					//set the thread to the database thread group
//					Thread.currentThread().setThreadGroup(databaseThreadGroup);
//					performDatabaseQuery(request);
//					
//				}
//				else if(request.getType()== RequestType.REPORT_GENERATION) {
//					//set the thread to the database thread group
//					Thread.currentThread().setThreadGroup(reportThreadGroup);
//					generateReport(request);
//					
//				}
//				
//			}
//		};
//		threadPool.submit(request);
//	}
	
	public void performDatabaseQuery(Request request) {
		System.out.println("Processing database query request");
	}
	
	public void generateReport(Request request) {
		System.out.println("Processing report generation query request");
	}
	public void shutdown() {
		threadPool.shutdown();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

enum RequestType{
	DATABASE_QUERY,
	REPORT_GENERATION
}


class Request{
	private RequestType type;
	private String data;
	public Request(RequestType type, String data) {
		super();
		this.type = type;
		this.data = data;
	}
	public RequestType getType() {
		return type;
	}
	public void setType(RequestType type) {
		this.type = type;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	
}