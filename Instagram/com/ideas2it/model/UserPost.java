import com.ideas2it.model;

/**
 * upload the post for user.
 *
 * @version     1.0 13 Sept 2022
 * @author      Yogeshwar
 */
public class UserPost {
    String accountName;
    String postlLocation;
    int postCount;
 
    public UserPost(String accountName, String postLocation, int postcount) {
        this.accountName = accountName;
        this.postLocation = location;
        this.postCount = postCount;
    }

    public string getAccountName() {
        return accountName;
    }

    public String setAccountName(String accountName) {
        this.accountName = accountName;
    }
    
    public void getPostLocation() {
        return postLocation;
    }

    public String setPostLocation(String postLocation) {
        this.postLocation = postLocation;
    } 

    public void getPostCount() {
        return postCount;
    }

    public int setPostCount(int postCount) {
        this.postCount = postCount;
    }
}