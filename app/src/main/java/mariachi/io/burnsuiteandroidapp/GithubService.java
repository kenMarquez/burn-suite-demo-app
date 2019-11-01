package mariachi.io.burnsuiteandroidapp;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GithubService {

    @GET("/users/octocat")
    Call<Object> getUsers();
}
