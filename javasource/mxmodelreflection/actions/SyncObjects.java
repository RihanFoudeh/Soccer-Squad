// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package mxmodelreflection.actions;

import mxmodelreflection.metamodelBuilder.Builder;
import mxmodelreflection.metamodelBuilder.MetaObjectBuilder;
import mxmodelreflection.metamodelBuilder.MicroflowBuilder;
import mxmodelreflection.proxies.Microflows;
import mxmodelreflection.proxies.Module;
import mxmodelreflection.proxies.MxObjectMember;
import mxmodelreflection.proxies.MxObjectType;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.mendix.webui.FeedbackHelper;

/**
 * Reads all information from the running project and synchronize the full MxModelReflection domain model with the information from the current project
 * 
 * (The return value from this action can be ignored)
 */
public class SyncObjects extends CustomJavaAction<java.lang.Boolean>
{
	public SyncObjects(IContext context)
	{
		super(context);
	}

	@java.lang.Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		Builder builder = new Builder();
		builder.prepareSynchronization(this.getContext());
		new MetaObjectBuilder(builder).buildMetaObjects(this.getContext());
		new MicroflowBuilder(builder).buildMicroflows(this.getContext());
		builder.removeInactiveModules(this.getContext());
		
		FeedbackHelper.addRefreshClass(getContext(), Microflows.getType());
		FeedbackHelper.addRefreshClass(getContext(), MxObjectType.getType());
		FeedbackHelper.addRefreshClass(getContext(), Module.getType());
		FeedbackHelper.addRefreshClass(getContext(), MxObjectMember.getType());

		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "SyncObjects";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
