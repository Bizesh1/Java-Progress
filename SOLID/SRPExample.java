package SOLID;

class Report {
    void generateReport() {
        System.out.println("Generating report...");
    }
}

class ReportPrinter {
    void printReport() {
        System.out.println("Printing report...");
    }
}

public class SRPExample {
    public static void main(String[] args) {
        Report report = new Report();
        ReportPrinter printer = new ReportPrinter();
        report.generateReport();    
        printer.printReport();
    }
}
