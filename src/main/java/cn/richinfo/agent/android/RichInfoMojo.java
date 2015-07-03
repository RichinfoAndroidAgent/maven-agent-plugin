package cn.richinfo.agent.android;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.ResolutionScope;

@Mojo(name="instrument", requiresDependencyResolution=ResolutionScope.COMPILE, defaultPhase=LifecyclePhase.VALIDATE)
public class RichInfoMojo extends AbstractMojo {

	public void execute() throws MojoExecutionException {
		
	}

}
