package org.wso2.custom.plugin;

//import org.apache.log4j.Logger;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.project.MavenProject;


/**
 * This goal will say a message.
 *
 * @goal custom-rename
 */
public class RenameFileMojo extends AbstractMojo {

    /**
     * @parameter default-value="${project}"
     * @required
     * @readonly
     */
    MavenProject project;

    public void execute() throws MojoExecutionException, MojoFailureException {

        String customFileName = createCustomFileName(project.getArtifactId());

        //substring the artifact id
        //get the last
        //check the files in the root directory
        //rename with the new custom name
    }

    private String createCustomFileName(String artifactId) {

        String customFileName = null;


        if(!"".equals(artifactId)){

            String[] artifactIdSplitArray = artifactId.split(".");

            if(artifactIdSplitArray.length == 0){

                customFileName = artifactId;

            } else{

                if(!"".equals(artifactIdSplitArray[artifactIdSplitArray.length - 1].trim())){

                    customFileName = artifactIdSplitArray[artifactIdSplitArray.length-1];

                }
                else{
                    //log.warn("The unit artifact-id is invalid");


                }

            }
        }



        return customFileName;
    }


}
