//  CreateRepositoryTest.java
//  Created by Paul Lai on 27/10/2016.
//  Copyright (c)

package com.gitrepo.paul.test;

import org.junit.Test;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * Created by paul.lai on 27-10-2016.
 */
public class CreateRepositoryTest {

    public static final String GITHUB_OAUTH_TOKEN = "fake-token"; //Actual Token is removed & replaced by a placeholder token
    public static final String REPO_NAME = "fake-repo"; //Replace the repository name with a name you want

    @Test
    public void testCreate() throws IOException {

        GitHub gitHub = GitHub.connectUsingOAuth(GITHUB_OAUTH_TOKEN);

        GHRepository ghRepository = gitHub.createRepository(REPO_NAME).create(); //Calls POST /user/repos

        String repoName = ghRepository.getName();

        assertEquals(repoName, REPO_NAME);
    }

}
