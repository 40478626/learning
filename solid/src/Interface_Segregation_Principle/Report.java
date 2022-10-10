package Interface_Segregation_Principle;


class GenerateReport implements GenerateExcelReport, GeneratePDFReport {

    @Override
    public void generateExcel() {

    }

    @Override
    public void generatePDF() {
    }
}

public class Report {
    public static void main (String[] args){
        
    }

}
