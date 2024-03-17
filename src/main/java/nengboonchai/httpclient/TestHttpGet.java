package nengboonchai.httpclient;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.google.gson.Gson;

class Location{
    String city;
    String country;
    String region;

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

}
class Detail{
    String university;
    String rank_display;
    Double score;
    String type;
    Integer student_faculty_ratio;
    String international_students;
    String faculty_count;
    Location location;

    public String getUniversity() {
        return this.university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getRank_display() {
        return this.rank_display;
    }

    public void setRank_display(String rank_display) {
        this.rank_display = rank_display;
    }

    public Double getScore() {
        return this.score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getStudent_faculty_ratio() {
        return this.student_faculty_ratio;
    }

    public void setStudent_faculty_ratio(Integer student_faculty_ratio) {
        this.student_faculty_ratio = student_faculty_ratio;
    }

    public String getInternational_students() {
        return this.international_students;
    }

    public void setInternational_students(String international_students) {
        this.international_students = international_students;
    }

    public String getFaculty_count() {
        return this.faculty_count;
    }

    public void setFaculty_count(String faculty_count) {
        this.faculty_count = faculty_count;
    }

    public Location getLocation() {
        return this.location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

}
class Student{
    Integer page;
    Integer per_page;
    Integer total;
    Integer total_pages;
    List<Detail> data=new ArrayList<>();

    public Integer getPage() {
        return this.page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPer_page() {
        return this.per_page;
    }

    public void setPer_page(Integer per_page) {
        this.per_page = per_page;
    }

    public Integer getTotal() {
        return this.total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getTotal_pages() {
        return this.total_pages;
    }

    public void setTotal_pages(Integer total_pages) {
        this.total_pages = total_pages;
    }

    public List<Detail> getData() {
        return this.data;
    }

    public void setData(List<Detail> data) {
        this.data = data;
    }


    


}
public class TestHttpGet {
    public static Student callHttp(String page){
        Student result = null;
        try {
            String url = "https://jsonmock.hackerrank.com/api/universities?page="+page;
            System.out.println(url);
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(url))
                    .GET()
                    .build();
            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            //HttpHeaders responseHeaders = response.headers();
            //System.out.println(response.body());
            //JsonParser.parse(response.body().toString()).
            //result = new  JSONObject();
            // parsing file "JSONExample.json"
            //System.out.println(response.body().toString());
            Gson gson = new Gson();
            result = gson.fromJson(response.body().toString(), Student.class);

            //result = new JSONObject(response.body().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            return result;
        }

    }
    public static void main(String[] args) {
            String firstCity= "Shanghai";
            // get page
            Student firstStudent = callHttp("");
            //System.out.println(jsonObject.getInt("total_pages"));
            int total = firstStudent.getTotal_pages();
            //System.out.println(total);
            for(int i=0;i<total;i++){
                Student st = callHttp(String.valueOf(i+1));
                //jsonObject.get("data");
                List<Detail> details = st.getData();
                for(int j=0;j<details.size();j++){
                    System.out.println(details.get(j).getLocation().getCity());

                }
            }
    }
}
