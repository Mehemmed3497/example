package listTask;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> topCompanies=new ArrayList<>();
        System.out.println(topCompanies.isEmpty());
        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");
        int a= topCompanies.size();
        System.out.println(a);
        String bestCompany = topCompanies.get(0);
        String secondBestCompany=topCompanies.get(1);
        String lastCompany=topCompanies.get(topCompanies.size()-1);

        System.out.println(bestCompany);
        System.out.println(secondBestCompany);
        System.out.println(lastCompany);

        topCompanies.set(4,"Walmart");
        System.out.println(topCompanies);
    }
}
