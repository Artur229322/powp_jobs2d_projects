package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.drivers.SingleDriver;

public interface Visitor {

	public void visitICompoundCommand(ICompoundCommand iCompoundCommand);
	public void visitOperateToCommand(OperateToCommand operateToCommand);
	public void visitSetPositionCommand(SetPositionCommand setPositionCommand);
	public void visitSingleDriver(SingleDriver singleDriver);
}
