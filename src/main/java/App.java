/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import okhttp3.Response;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import java.io.File;
import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException, GitAPIException {
        Git git = Git.open(new File(""));
        System.out.println(git.log().call().iterator().next().getShortMessage());
        System.out.println(git.getRepository().getBranch());
    }

    private static void printResponse(Response response) throws IOException {

    }
}
