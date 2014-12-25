package youtrack.commands;

import com.sun.istack.internal.NotNull;
import youtrack.BaseItem;

/**
 * Created by Egor.Malyshev on 25.12.2014.
 */
public abstract class RunningCommand<O extends BaseItem, R> extends Command<O, R> {
    private R argument;

    public R getArgument() {
        return argument;
    }

    public void setArgument(R argument) {

        this.argument = argument;
    }

    public RunningCommand(@NotNull O owner) {
        super(owner);
    }

}