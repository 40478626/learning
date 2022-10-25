public class SoftwareDepartment {
    public void MobileTeam(){
        System.out.println("Built Mobile Application!");
    }
    public void FrontEndTeam(){
        System.out.println("Built Website!");
    }
    public void BackEndTeam(){
        System.out.println("Build Functions!");
    }
    public static void main (String[] args){
        SoftwareDepartment softwareDepartment = new SoftwareDepartment();
        softwareDepartment.MobileTeam();
        softwareDepartment.FrontEndTeam();
        softwareDepartment.BackEndTeam();

    }

}
