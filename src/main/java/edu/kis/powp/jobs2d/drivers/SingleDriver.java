package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.Visitor;

import java.util.Iterator;

public interface SingleDriver extends Job2dDriver {

    public Iterator<DriverCommand> iterator();

    @Override
    public default void accept(Visitor visitor){
        visitor.visitSingleDriver(this);
    }
}
