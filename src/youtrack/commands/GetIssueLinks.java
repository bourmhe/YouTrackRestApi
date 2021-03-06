package youtrack.commands;
import com.sun.istack.internal.NotNull;
import org.apache.commons.httpclient.methods.GetMethod;
import youtrack.Issue;
import youtrack.IssueLink;
import youtrack.commands.base.ListCommand;
/**
 * Created by egor.malyshev on 02.04.2014.
 */
public class GetIssueLinks extends ListCommand<Issue, IssueLink> {
    public GetIssueLinks(@NotNull Issue owner) {
        super(owner);
    }
    @Override
    public void createCommandMethod() {
        method = new GetMethod(owner.getYouTrack().getHostAddress() + "issue/" + owner.getId() + "/link");
    }
}